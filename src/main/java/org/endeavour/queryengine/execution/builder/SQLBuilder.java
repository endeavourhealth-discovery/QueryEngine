package org.endeavour.queryengine.execution.builder;

import lombok.extern.slf4j.Slf4j;
import org.endeavour.queryengine.exception.QueryEngineException;
import org.endeavour.queryengine.im.Parameter;
import org.endeavour.queryengine.im.*;
import org.jooq.*;
import org.jooq.impl.DSL;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.endeavour.queryengine.db.tables.Observation.OBSERVATION;
import static org.endeavour.queryengine.db.tables.Patient.PATIENT;

@Slf4j
/**
 * Two ways of doing this
 * 1) Increment, create select and add on joins/wheres/groupBy to the one instance
 * 2) Create parts e.g. select, list of joins, list of conditions. Then final stage is creating sql
 */
public class SQLBuilder {

    private SelectJoinStep<?> select;

    private ModelDocument modelDocument;

    private SQLHelper sqlHelper = new SQLHelper();

    public SQLBuilder(ModelDocument modelDocument) {

        this.modelDocument = modelDocument;

        prepare();

        attachCriterion();
    }

    public void attachCriterion() {

//        modelDocument.getCohort().stream().flatMap( Cohort::getCriterion ).collect(Collectors.toList());

        for (Cohort c : modelDocument.getCohort()) {

            for (Criterion criterion : c.getCriterion()) {
                Condition condition = getCondition(criterion);
                sqlHelper.addCondition( condition );
                select.where(condition);
            }
        }
    }

    private Condition getCondition(Criterion cri) {

        log.debug("About to process criterion {}", cri);

        Table table = getTableMapping(cri.getClazz());

        join(cri.getClazz());

        Condition condition = null;

        Attribute attribute = cri.getFilter().getAttribute();

        //concept property on observation table
        if (attribute.getProperty() != null && attribute.getProperty().equals("concept")) {
            //Get valueset that this refers to
            for (ValueSet vs : modelDocument.getValueSet()) {
                if (vs.getId().equals(attribute.getValueSet())) {
                    List<Integer> values = getValues(vs);
                    condition = OBSERVATION.CORE_CONCEPT_ID.in(values);
                }
            }
        } else if (attribute.getFunction() != null) {

            //Have function
            Function function = attribute.getFunction();
            TableField tableField = getFieldMapping(function.getParameter().get(0).getProperty());
            if (function.getBaseFunction().equals("TimeDifference")) {
                condition = getTimeDifferenceCondition(attribute);
            }

        }

        log.info("Condition {}", condition);

        return condition;
    }

    private List<Integer> getValues(ValueSet vs) {

        List<String> stringValues = vs.getExpression().get(0).getClassOrSubtypes();

        return stringValues.stream().map(s -> Integer.valueOf(s.substring(6, 14))).collect(Collectors.toList());
    }

    private TableField getFieldMapping(String property) {

        if (property.equals("cm:dateOfBirth")) return PATIENT.DATE_OF_BIRTH;

        throw new QueryEngineException("Cannot find mapping for " + property);
    }


    private Condition getTimeDifferenceCondition(Attribute attribute) {
        Function function = attribute.getFunction();
        TableField tableField = getFieldMapping(function.getParameter().get(0).getProperty());

        Condition condition = null;

        if (function.getBaseFunction().equals("TimeDifference")) {
            Parameter parameter = function.getParameter().get(0);

            String parameterToken = parameter.getParameterToken();

            Value value = attribute.getValue();
            double val = value.getValue();
            String operator = value.getOperator();

            if (parameterToken.equals("YEAR")) {
                val = val * 365;
            }
            if (parameterToken.equals("MONTH")) {
                val = val * 30.5;
            }
            if (parameterToken.equals("WEEK")) {
                val = val * 7;
            }

            Long timeInMilliseconds = (long) (val * 24 * 60 * 60 * 1000);

            Date now = new Date();
            timeInMilliseconds = now.getTime() - timeInMilliseconds;
            Date date = new Date(timeInMilliseconds);

            log.debug("parameterToken {}, value {}  = {}", parameterToken, value, date);

            condition = tableField.le(date);
        }

        return condition;

    }

    private Table getTableMapping(String clazz) {

        if (clazz.equals("cm:Person")) return PATIENT;
        if (clazz.equals("cm:Observation")) return OBSERVATION;

        throw new QueryEngineException("Cannot find table matching for " + clazz);
    }

    private void join(String clazz) {
        if (clazz.equals("cm:Observation")) {
            select.join(OBSERVATION).on(OBSERVATION.PATIENT_ID.eq(PATIENT.ID));
            sqlHelper.addJoin(OBSERVATION);
        } else if (clazz.equals("cm:Person")) {
            //nothing to do yet
        } else throw new QueryEngineException("Cannot find table matching for " + clazz);
    }

    public void prepare() {

        Table table = null;

        if (modelDocument.getCohort().isEmpty()) {
            //Nothing to do, no cohort
        }

        for (Cohort c : modelDocument.getCohort()) {
            table = getTableMapping(c.getDataSubject());
        }

        if (table == null) throw new QueryEngineException("Cannot determine select table");

        DSLContext create = DSL.using(SQLDialect.MYSQL);

        sqlHelper.setFrom(table);
        sqlHelper.addSelect(PATIENT.ID);

        select = create.select(PATIENT.ID).from(table);
    }

    public void log() {
        //Info
        log.info("Final sql : {}", select.getQuery().getSQL());
        log.info("Final binding : {}", select.getBindValues());
    }

    public String getSql() {
        return sqlHelper.getSelect().getSQL();
    }

    public List<Object> getBindValues() {
        return sqlHelper.getSelect().getBindValues();
    }

    public Map<String, Param<?>> getParams() {
        return sqlHelper.getSelect().getParams();
    }

    public Select<?> getSelect() {
        return sqlHelper.getSelect();
//        return select;
    }
}

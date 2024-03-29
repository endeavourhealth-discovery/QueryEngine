package org.endeavour.queryengine.execution.builder;

import lombok.Data;
import org.endeavour.queryengine.db.tables.Observation;
import org.jooq.*;

import static org.jooq.impl.DSL.*;

import java.util.ArrayList;
import java.util.List;

import static org.endeavour.queryengine.db.tables.Observation.OBSERVATION;
import static org.endeavour.queryengine.db.tables.Patient.PATIENT;

@Data
public class SQLHelper {

    private List<SelectField<?>> select = new ArrayList<>();
    private Table<?> from;
    private List<Table<?>> joins = new ArrayList<>();
    private List<GroupField> groupBy = new ArrayList<>();
    private List<SortField<?>> orderBy = new ArrayList<>();
    private List<Condition> conditions = new ArrayList<>();

    DSLContext create = using(SQLDialect.MYSQL);

    public DDLQuery getCreate() {

        //maybe edit select??
        //Be aware of create.createTableIfNotExists
        return create.createTable("cohort").as( getSelect() );

    }

    public Select<?> getSelect() {


        Table table = getTable();

        //Doesn't appear to be needed, but nice way to have no conditions
//        Condition co = conditions.stream().reduce(noCondition(), Condition::and);

//        Select s = groupBy.isEmpty() ? select(select).from(table).where(conditions).orderBy(orderBy) :  select(select).from(table).where(conditions).groupBy(groupBy).orderBy(orderBy);

        Select s = null;

        if(groupBy.isEmpty()) {
            s = select(select).from(table).where(conditions).orderBy(orderBy);
        } else {
            s = select(select).from(table).where(conditions).groupBy(groupBy).orderBy(orderBy);
        }

        return s;
    }

    private Table<?> getTable() {

        Table local = from.asTable();

        for (Table table : joins) {
            if (from.equals(PATIENT)) {
                if (table.equals(Observation.OBSERVATION)) {
                    local = local.join(OBSERVATION).on(OBSERVATION.PATIENT_ID.eq(PATIENT.ID));
                }
            }
        }

        return local;
    }

    public void addCondition(Condition condition) {
        conditions.add(condition);
    }

    public void addJoin(Table<?> table) {
        joins.add(table);
    }

    public void addSelect(SelectField<?> field) {
        select.add( field );
    }
}

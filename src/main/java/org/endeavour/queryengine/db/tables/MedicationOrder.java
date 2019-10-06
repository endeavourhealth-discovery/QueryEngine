/*
 * This file is generated by jOOQ.
 */
package org.endeavour.queryengine.db.tables;


import java.math.BigDecimal;
import java.sql.Date;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.endeavour.queryengine.db.Indexes;
import org.endeavour.queryengine.db.Keys;
import org.endeavour.queryengine.db.SubscriberPi;
import org.endeavour.queryengine.db.tables.records.MedicationOrderRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row19;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MedicationOrder extends TableImpl<MedicationOrderRecord> {

    private static final long serialVersionUID = 1044124162;

    /**
     * The reference instance of <code>subscriber_pi.medication_order</code>
     */
    public static final MedicationOrder MEDICATION_ORDER = new MedicationOrder();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MedicationOrderRecord> getRecordType() {
        return MedicationOrderRecord.class;
    }

    /**
     * The column <code>subscriber_pi.medication_order.id</code>.
     */
    public final TableField<MedicationOrderRecord, Long> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>subscriber_pi.medication_order.organization_id</code>.
     */
    public final TableField<MedicationOrderRecord, Long> ORGANIZATION_ID = createField(DSL.name("organization_id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>subscriber_pi.medication_order.patient_id</code>.
     */
    public final TableField<MedicationOrderRecord, Long> PATIENT_ID = createField(DSL.name("patient_id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>subscriber_pi.medication_order.person_id</code>.
     */
    public final TableField<MedicationOrderRecord, Long> PERSON_ID = createField(DSL.name("person_id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>subscriber_pi.medication_order.encounter_id</code>.
     */
    public final TableField<MedicationOrderRecord, Long> ENCOUNTER_ID = createField(DSL.name("encounter_id"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>subscriber_pi.medication_order.practitioner_id</code>.
     */
    public final TableField<MedicationOrderRecord, Long> PRACTITIONER_ID = createField(DSL.name("practitioner_id"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>subscriber_pi.medication_order.clinical_effective_date</code>.
     */
    public final TableField<MedicationOrderRecord, Date> CLINICAL_EFFECTIVE_DATE = createField(DSL.name("clinical_effective_date"), org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>subscriber_pi.medication_order.date_precision_concept_id</code>.
     */
    public final TableField<MedicationOrderRecord, Integer> DATE_PRECISION_CONCEPT_ID = createField(DSL.name("date_precision_concept_id"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>subscriber_pi.medication_order.dose</code>.
     */
    public final TableField<MedicationOrderRecord, String> DOSE = createField(DSL.name("dose"), org.jooq.impl.SQLDataType.VARCHAR(1000), this, "");

    /**
     * The column <code>subscriber_pi.medication_order.quantity_value</code>.
     */
    public final TableField<MedicationOrderRecord, Double> QUANTITY_VALUE = createField(DSL.name("quantity_value"), org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>subscriber_pi.medication_order.quantity_unit</code>.
     */
    public final TableField<MedicationOrderRecord, String> QUANTITY_UNIT = createField(DSL.name("quantity_unit"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>subscriber_pi.medication_order.duration_days</code>.
     */
    public final TableField<MedicationOrderRecord, Integer> DURATION_DAYS = createField(DSL.name("duration_days"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>subscriber_pi.medication_order.estimated_cost</code>.
     */
    public final TableField<MedicationOrderRecord, Double> ESTIMATED_COST = createField(DSL.name("estimated_cost"), org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>subscriber_pi.medication_order.medication_statement_id</code>.
     */
    public final TableField<MedicationOrderRecord, Long> MEDICATION_STATEMENT_ID = createField(DSL.name("medication_statement_id"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>subscriber_pi.medication_order.core_concept_id</code>.
     */
    public final TableField<MedicationOrderRecord, Integer> CORE_CONCEPT_ID = createField(DSL.name("core_concept_id"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>subscriber_pi.medication_order.non_core_concept_id</code>.
     */
    public final TableField<MedicationOrderRecord, Integer> NON_CORE_CONCEPT_ID = createField(DSL.name("non_core_concept_id"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>subscriber_pi.medication_order.bnf_reference</code>.
     */
    public final TableField<MedicationOrderRecord, String> BNF_REFERENCE = createField(DSL.name("bnf_reference"), org.jooq.impl.SQLDataType.VARCHAR(6), this, "");

    /**
     * The column <code>subscriber_pi.medication_order.age_at_event</code>.
     */
    public final TableField<MedicationOrderRecord, BigDecimal> AGE_AT_EVENT = createField(DSL.name("age_at_event"), org.jooq.impl.SQLDataType.DECIMAL(5, 2), this, "");

    /**
     * The column <code>subscriber_pi.medication_order.issue_method</code>.
     */
    public final TableField<MedicationOrderRecord, String> ISSUE_METHOD = createField(DSL.name("issue_method"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>subscriber_pi.medication_order</code> table reference
     */
    public MedicationOrder() {
        this(DSL.name("medication_order"), null);
    }

    /**
     * Create an aliased <code>subscriber_pi.medication_order</code> table reference
     */
    public MedicationOrder(String alias) {
        this(DSL.name(alias), MEDICATION_ORDER);
    }

    /**
     * Create an aliased <code>subscriber_pi.medication_order</code> table reference
     */
    public MedicationOrder(Name alias) {
        this(alias, MEDICATION_ORDER);
    }

    private MedicationOrder(Name alias, Table<MedicationOrderRecord> aliased) {
        this(alias, aliased, null);
    }

    private MedicationOrder(Name alias, Table<MedicationOrderRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> MedicationOrder(Table<O> child, ForeignKey<O, MedicationOrderRecord> key) {
        super(child, key, MEDICATION_ORDER);
    }

    @Override
    public Schema getSchema() {
        return SubscriberPi.SUBSCRIBER_PI;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.MEDICATION_ORDER_FK_MEDICATION_ORDER_ENCOUNTER_ID, Indexes.MEDICATION_ORDER_FK_MEDICATION_ORDER_PATIENT_ID_ORGANIZATION_ID, Indexes.MEDICATION_ORDER_FK_MEDICATION_ORDER_PRACTITIONER_ID, Indexes.MEDICATION_ORDER_MEDICATION_ORDER_CORE_CONCEPT_ID, Indexes.MEDICATION_ORDER_MEDICATION_ORDER_ID, Indexes.MEDICATION_ORDER_MEDICATION_ORDER_PATIENT_ID, Indexes.MEDICATION_ORDER_PRIMARY);
    }

    @Override
    public UniqueKey<MedicationOrderRecord> getPrimaryKey() {
        return Keys.KEY_MEDICATION_ORDER_PRIMARY;
    }

    @Override
    public List<UniqueKey<MedicationOrderRecord>> getKeys() {
        return Arrays.<UniqueKey<MedicationOrderRecord>>asList(Keys.KEY_MEDICATION_ORDER_PRIMARY, Keys.KEY_MEDICATION_ORDER_MEDICATION_ORDER_ID);
    }

    @Override
    public List<ForeignKey<MedicationOrderRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<MedicationOrderRecord, ?>>asList(Keys.FK_MEDICATION_ORDER_PATIENT_ID_ORGANIZATION_ID, Keys.FK_MEDICATION_ORDER_ENCOUNTER_ID, Keys.FK_MEDICATION_ORDER_PRACTITIONER_ID);
    }

    public Patient patient() {
        return new Patient(this, Keys.FK_MEDICATION_ORDER_PATIENT_ID_ORGANIZATION_ID);
    }

    public Encounter encounter() {
        return new Encounter(this, Keys.FK_MEDICATION_ORDER_ENCOUNTER_ID);
    }

    public Practitioner practitioner() {
        return new Practitioner(this, Keys.FK_MEDICATION_ORDER_PRACTITIONER_ID);
    }

    @Override
    public MedicationOrder as(String alias) {
        return new MedicationOrder(DSL.name(alias), this);
    }

    @Override
    public MedicationOrder as(Name alias) {
        return new MedicationOrder(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MedicationOrder rename(String name) {
        return new MedicationOrder(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MedicationOrder rename(Name name) {
        return new MedicationOrder(name, null);
    }

    // -------------------------------------------------------------------------
    // Row19 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row19<Long, Long, Long, Long, Long, Long, Date, Integer, String, Double, String, Integer, Double, Long, Integer, Integer, String, BigDecimal, String> fieldsRow() {
        return (Row19) super.fieldsRow();
    }
}

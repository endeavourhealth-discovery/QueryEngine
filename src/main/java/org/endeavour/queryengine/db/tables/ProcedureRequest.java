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
import org.endeavour.queryengine.db.tables.records.ProcedureRequestRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row12;
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
public class ProcedureRequest extends TableImpl<ProcedureRequestRecord> {

    private static final long serialVersionUID = 143013657;

    /**
     * The reference instance of <code>subscriber_pi.procedure_request</code>
     */
    public static final ProcedureRequest PROCEDURE_REQUEST = new ProcedureRequest();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ProcedureRequestRecord> getRecordType() {
        return ProcedureRequestRecord.class;
    }

    /**
     * The column <code>subscriber_pi.procedure_request.id</code>.
     */
    public final TableField<ProcedureRequestRecord, Long> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>subscriber_pi.procedure_request.organization_id</code>.
     */
    public final TableField<ProcedureRequestRecord, Long> ORGANIZATION_ID = createField(DSL.name("organization_id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>subscriber_pi.procedure_request.patient_id</code>.
     */
    public final TableField<ProcedureRequestRecord, Long> PATIENT_ID = createField(DSL.name("patient_id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>subscriber_pi.procedure_request.person_id</code>.
     */
    public final TableField<ProcedureRequestRecord, Long> PERSON_ID = createField(DSL.name("person_id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>subscriber_pi.procedure_request.encounter_id</code>.
     */
    public final TableField<ProcedureRequestRecord, Long> ENCOUNTER_ID = createField(DSL.name("encounter_id"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>subscriber_pi.procedure_request.practitioner_id</code>.
     */
    public final TableField<ProcedureRequestRecord, Long> PRACTITIONER_ID = createField(DSL.name("practitioner_id"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>subscriber_pi.procedure_request.clinical_effective_date</code>.
     */
    public final TableField<ProcedureRequestRecord, Date> CLINICAL_EFFECTIVE_DATE = createField(DSL.name("clinical_effective_date"), org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>subscriber_pi.procedure_request.date_precision_concept_id</code>.
     */
    public final TableField<ProcedureRequestRecord, Integer> DATE_PRECISION_CONCEPT_ID = createField(DSL.name("date_precision_concept_id"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>subscriber_pi.procedure_request.status_concept_id</code>.
     */
    public final TableField<ProcedureRequestRecord, Integer> STATUS_CONCEPT_ID = createField(DSL.name("status_concept_id"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>subscriber_pi.procedure_request.core_concept_id</code>.
     */
    public final TableField<ProcedureRequestRecord, Integer> CORE_CONCEPT_ID = createField(DSL.name("core_concept_id"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>subscriber_pi.procedure_request.non_core_concept_id</code>.
     */
    public final TableField<ProcedureRequestRecord, Integer> NON_CORE_CONCEPT_ID = createField(DSL.name("non_core_concept_id"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>subscriber_pi.procedure_request.age_at_event</code>.
     */
    public final TableField<ProcedureRequestRecord, BigDecimal> AGE_AT_EVENT = createField(DSL.name("age_at_event"), org.jooq.impl.SQLDataType.DECIMAL(5, 2), this, "");

    /**
     * Create a <code>subscriber_pi.procedure_request</code> table reference
     */
    public ProcedureRequest() {
        this(DSL.name("procedure_request"), null);
    }

    /**
     * Create an aliased <code>subscriber_pi.procedure_request</code> table reference
     */
    public ProcedureRequest(String alias) {
        this(DSL.name(alias), PROCEDURE_REQUEST);
    }

    /**
     * Create an aliased <code>subscriber_pi.procedure_request</code> table reference
     */
    public ProcedureRequest(Name alias) {
        this(alias, PROCEDURE_REQUEST);
    }

    private ProcedureRequest(Name alias, Table<ProcedureRequestRecord> aliased) {
        this(alias, aliased, null);
    }

    private ProcedureRequest(Name alias, Table<ProcedureRequestRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ProcedureRequest(Table<O> child, ForeignKey<O, ProcedureRequestRecord> key) {
        super(child, key, PROCEDURE_REQUEST);
    }

    @Override
    public Schema getSchema() {
        return SubscriberPi.SUBSCRIBER_PI;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.PROCEDURE_REQUEST_FK_PROCEDURE_REQUEST_ENCOUNTER_ID, Indexes.PROCEDURE_REQUEST_FK_PROCEDURE_REQUEST_PATIENT_ID_ORGANIZATION_ID, Indexes.PROCEDURE_REQUEST_FK_PROCEDURE_REQUEST_PRACTITIONER_ID, Indexes.PROCEDURE_REQUEST_PRIMARY, Indexes.PROCEDURE_REQUEST_PROCEDURE_REQUEST_ID, Indexes.PROCEDURE_REQUEST_PROCEDURE_REQUEST_PATIENT_ID);
    }

    @Override
    public UniqueKey<ProcedureRequestRecord> getPrimaryKey() {
        return Keys.KEY_PROCEDURE_REQUEST_PRIMARY;
    }

    @Override
    public List<UniqueKey<ProcedureRequestRecord>> getKeys() {
        return Arrays.<UniqueKey<ProcedureRequestRecord>>asList(Keys.KEY_PROCEDURE_REQUEST_PRIMARY, Keys.KEY_PROCEDURE_REQUEST_PROCEDURE_REQUEST_ID);
    }

    @Override
    public List<ForeignKey<ProcedureRequestRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ProcedureRequestRecord, ?>>asList(Keys.FK_PROCEDURE_REQUEST_PATIENT_ID_ORGANIZATION_ID, Keys.FK_PROCEDURE_REQUEST_PRACTITIONER_ID);
    }

    public Patient patient() {
        return new Patient(this, Keys.FK_PROCEDURE_REQUEST_PATIENT_ID_ORGANIZATION_ID);
    }

    public Practitioner practitioner() {
        return new Practitioner(this, Keys.FK_PROCEDURE_REQUEST_PRACTITIONER_ID);
    }

    @Override
    public ProcedureRequest as(String alias) {
        return new ProcedureRequest(DSL.name(alias), this);
    }

    @Override
    public ProcedureRequest as(Name alias) {
        return new ProcedureRequest(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ProcedureRequest rename(String name) {
        return new ProcedureRequest(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ProcedureRequest rename(Name name) {
        return new ProcedureRequest(name, null);
    }

    // -------------------------------------------------------------------------
    // Row12 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row12<Long, Long, Long, Long, Long, Long, Date, Integer, Integer, Integer, Integer, BigDecimal> fieldsRow() {
        return (Row12) super.fieldsRow();
    }
}
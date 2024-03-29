/*
 * This file is generated by jOOQ.
 */
package org.endeavour.queryengine.db.tables;


import java.sql.Date;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.endeavour.queryengine.db.Indexes;
import org.endeavour.queryengine.db.Keys;
import org.endeavour.queryengine.db.SubscriberPi;
import org.endeavour.queryengine.db.tables.records.PatientRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row13;
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
public class Patient extends TableImpl<PatientRecord> {

    private static final long serialVersionUID = 1708122544;

    /**
     * The reference instance of <code>subscriber_pi.patient</code>
     */
    public static final Patient PATIENT = new Patient();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PatientRecord> getRecordType() {
        return PatientRecord.class;
    }

    /**
     * The column <code>subscriber_pi.patient.id</code>.
     */
    public final TableField<PatientRecord, Long> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>subscriber_pi.patient.organization_id</code>.
     */
    public final TableField<PatientRecord, Long> ORGANIZATION_ID = createField(DSL.name("organization_id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>subscriber_pi.patient.person_id</code>.
     */
    public final TableField<PatientRecord, Long> PERSON_ID = createField(DSL.name("person_id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>subscriber_pi.patient.title</code>.
     */
    public final TableField<PatientRecord, String> TITLE = createField(DSL.name("title"), org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>subscriber_pi.patient.first_names</code>.
     */
    public final TableField<PatientRecord, String> FIRST_NAMES = createField(DSL.name("first_names"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>subscriber_pi.patient.last_name</code>.
     */
    public final TableField<PatientRecord, String> LAST_NAME = createField(DSL.name("last_name"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>subscriber_pi.patient.gender_concept_id</code>.
     */
    public final TableField<PatientRecord, Integer> GENDER_CONCEPT_ID = createField(DSL.name("gender_concept_id"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>subscriber_pi.patient.nhs_number</code>.
     */
    public final TableField<PatientRecord, String> NHS_NUMBER = createField(DSL.name("nhs_number"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>subscriber_pi.patient.date_of_birth</code>.
     */
    public final TableField<PatientRecord, Date> DATE_OF_BIRTH = createField(DSL.name("date_of_birth"), org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>subscriber_pi.patient.date_of_death</code>.
     */
    public final TableField<PatientRecord, Date> DATE_OF_DEATH = createField(DSL.name("date_of_death"), org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>subscriber_pi.patient.current_address_id</code>.
     */
    public final TableField<PatientRecord, Long> CURRENT_ADDRESS_ID = createField(DSL.name("current_address_id"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>subscriber_pi.patient.ethnic_code_concept_id</code>.
     */
    public final TableField<PatientRecord, Integer> ETHNIC_CODE_CONCEPT_ID = createField(DSL.name("ethnic_code_concept_id"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>subscriber_pi.patient.registered_practice_organization_id</code>.
     */
    public final TableField<PatientRecord, Long> REGISTERED_PRACTICE_ORGANIZATION_ID = createField(DSL.name("registered_practice_organization_id"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>subscriber_pi.patient</code> table reference
     */
    public Patient() {
        this(DSL.name("patient"), null);
    }

    /**
     * Create an aliased <code>subscriber_pi.patient</code> table reference
     */
    public Patient(String alias) {
        this(DSL.name(alias), PATIENT);
    }

    /**
     * Create an aliased <code>subscriber_pi.patient</code> table reference
     */
    public Patient(Name alias) {
        this(alias, PATIENT);
    }

    private Patient(Name alias, Table<PatientRecord> aliased) {
        this(alias, aliased, null);
    }

    private Patient(Name alias, Table<PatientRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Patient(Table<O> child, ForeignKey<O, PatientRecord> key) {
        super(child, key, PATIENT);
    }

    @Override
    public Schema getSchema() {
        return SubscriberPi.SUBSCRIBER_PI;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.PATIENT_PATIENT_ID, Indexes.PATIENT_PATIENT_PERSON_ID, Indexes.PATIENT_PRIMARY);
    }

    @Override
    public UniqueKey<PatientRecord> getPrimaryKey() {
        return Keys.KEY_PATIENT_PRIMARY;
    }

    @Override
    public List<UniqueKey<PatientRecord>> getKeys() {
        return Arrays.<UniqueKey<PatientRecord>>asList(Keys.KEY_PATIENT_PRIMARY, Keys.KEY_PATIENT_PATIENT_ID);
    }

    @Override
    public List<ForeignKey<PatientRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<PatientRecord, ?>>asList(Keys.FK_PATIENT_ORGANIZATION_ID);
    }

    public Organization organization() {
        return new Organization(this, Keys.FK_PATIENT_ORGANIZATION_ID);
    }

    @Override
    public Patient as(String alias) {
        return new Patient(DSL.name(alias), this);
    }

    @Override
    public Patient as(Name alias) {
        return new Patient(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Patient rename(String name) {
        return new Patient(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Patient rename(Name name) {
        return new Patient(name, null);
    }

    // -------------------------------------------------------------------------
    // Row13 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row13<Long, Long, Long, String, String, String, Integer, String, Date, Date, Long, Integer, Long> fieldsRow() {
        return (Row13) super.fieldsRow();
    }
}

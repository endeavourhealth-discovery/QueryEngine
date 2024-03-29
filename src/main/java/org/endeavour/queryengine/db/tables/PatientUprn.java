/*
 * This file is generated by jOOQ.
 */
package org.endeavour.queryengine.db.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.endeavour.queryengine.db.Indexes;
import org.endeavour.queryengine.db.Keys;
import org.endeavour.queryengine.db.SubscriberPi;
import org.endeavour.queryengine.db.tables.records.PatientUprnRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row11;
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
public class PatientUprn extends TableImpl<PatientUprnRecord> {

    private static final long serialVersionUID = 1285072979;

    /**
     * The reference instance of <code>subscriber_pi.patient_uprn</code>
     */
    public static final PatientUprn PATIENT_UPRN = new PatientUprn();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PatientUprnRecord> getRecordType() {
        return PatientUprnRecord.class;
    }

    /**
     * The column <code>subscriber_pi.patient_uprn.patient_id</code>.
     */
    public final TableField<PatientUprnRecord, Long> PATIENT_ID = createField(DSL.name("patient_id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>subscriber_pi.patient_uprn.organization_id</code>.
     */
    public final TableField<PatientUprnRecord, Long> ORGANIZATION_ID = createField(DSL.name("organization_id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>subscriber_pi.patient_uprn.person_id</code>.
     */
    public final TableField<PatientUprnRecord, Long> PERSON_ID = createField(DSL.name("person_id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>subscriber_pi.patient_uprn.uprn</code>.
     */
    public final TableField<PatientUprnRecord, Long> UPRN = createField(DSL.name("uprn"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>subscriber_pi.patient_uprn.qualifier</code>.
     */
    public final TableField<PatientUprnRecord, String> QUALIFIER = createField(DSL.name("qualifier"), org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>subscriber_pi.patient_uprn.algorithm</code>.
     */
    public final TableField<PatientUprnRecord, String> ALGORITHM = createField(DSL.name("algorithm"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>subscriber_pi.patient_uprn.match</code>.
     */
    public final TableField<PatientUprnRecord, String> MATCH = createField(DSL.name("match"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>subscriber_pi.patient_uprn.no_address</code>.
     */
    public final TableField<PatientUprnRecord, Byte> NO_ADDRESS = createField(DSL.name("no_address"), org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * The column <code>subscriber_pi.patient_uprn.invalid_address</code>.
     */
    public final TableField<PatientUprnRecord, Byte> INVALID_ADDRESS = createField(DSL.name("invalid_address"), org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * The column <code>subscriber_pi.patient_uprn.missing_postcode</code>.
     */
    public final TableField<PatientUprnRecord, Byte> MISSING_POSTCODE = createField(DSL.name("missing_postcode"), org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * The column <code>subscriber_pi.patient_uprn.invalid_postcode</code>.
     */
    public final TableField<PatientUprnRecord, Byte> INVALID_POSTCODE = createField(DSL.name("invalid_postcode"), org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * Create a <code>subscriber_pi.patient_uprn</code> table reference
     */
    public PatientUprn() {
        this(DSL.name("patient_uprn"), null);
    }

    /**
     * Create an aliased <code>subscriber_pi.patient_uprn</code> table reference
     */
    public PatientUprn(String alias) {
        this(DSL.name(alias), PATIENT_UPRN);
    }

    /**
     * Create an aliased <code>subscriber_pi.patient_uprn</code> table reference
     */
    public PatientUprn(Name alias) {
        this(alias, PATIENT_UPRN);
    }

    private PatientUprn(Name alias, Table<PatientUprnRecord> aliased) {
        this(alias, aliased, null);
    }

    private PatientUprn(Name alias, Table<PatientUprnRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PatientUprn(Table<O> child, ForeignKey<O, PatientUprnRecord> key) {
        super(child, key, PATIENT_UPRN);
    }

    @Override
    public Schema getSchema() {
        return SubscriberPi.SUBSCRIBER_PI;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.PATIENT_UPRN_FK_PATIENT_UPRN_PATIENT_ID_ORGANISATION_ID, Indexes.PATIENT_UPRN_PATIENT_UPRN_ID, Indexes.PATIENT_UPRN_PRIMARY);
    }

    @Override
    public UniqueKey<PatientUprnRecord> getPrimaryKey() {
        return Keys.KEY_PATIENT_UPRN_PRIMARY;
    }

    @Override
    public List<UniqueKey<PatientUprnRecord>> getKeys() {
        return Arrays.<UniqueKey<PatientUprnRecord>>asList(Keys.KEY_PATIENT_UPRN_PRIMARY, Keys.KEY_PATIENT_UPRN_PATIENT_UPRN_ID);
    }

    @Override
    public List<ForeignKey<PatientUprnRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<PatientUprnRecord, ?>>asList(Keys.FK_PATIENT_UPRN_PATIENT_ID_ORGANISATION_ID);
    }

    public Patient patient() {
        return new Patient(this, Keys.FK_PATIENT_UPRN_PATIENT_ID_ORGANISATION_ID);
    }

    @Override
    public PatientUprn as(String alias) {
        return new PatientUprn(DSL.name(alias), this);
    }

    @Override
    public PatientUprn as(Name alias) {
        return new PatientUprn(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PatientUprn rename(String name) {
        return new PatientUprn(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PatientUprn rename(Name name) {
        return new PatientUprn(name, null);
    }

    // -------------------------------------------------------------------------
    // Row11 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row11<Long, Long, Long, Long, String, String, String, Byte, Byte, Byte, Byte> fieldsRow() {
        return (Row11) super.fieldsRow();
    }
}

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
import org.endeavour.queryengine.db.tables.records.ReferralRequestRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row18;
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
public class ReferralRequest extends TableImpl<ReferralRequestRecord> {

    private static final long serialVersionUID = -785273454;

    /**
     * The reference instance of <code>subscriber_pi.referral_request</code>
     */
    public static final ReferralRequest REFERRAL_REQUEST = new ReferralRequest();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ReferralRequestRecord> getRecordType() {
        return ReferralRequestRecord.class;
    }

    /**
     * The column <code>subscriber_pi.referral_request.id</code>.
     */
    public final TableField<ReferralRequestRecord, Long> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>subscriber_pi.referral_request.organization_id</code>.
     */
    public final TableField<ReferralRequestRecord, Long> ORGANIZATION_ID = createField(DSL.name("organization_id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>subscriber_pi.referral_request.patient_id</code>.
     */
    public final TableField<ReferralRequestRecord, Long> PATIENT_ID = createField(DSL.name("patient_id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>subscriber_pi.referral_request.person_id</code>.
     */
    public final TableField<ReferralRequestRecord, Long> PERSON_ID = createField(DSL.name("person_id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>subscriber_pi.referral_request.encounter_id</code>.
     */
    public final TableField<ReferralRequestRecord, Long> ENCOUNTER_ID = createField(DSL.name("encounter_id"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>subscriber_pi.referral_request.practitioner_id</code>.
     */
    public final TableField<ReferralRequestRecord, Long> PRACTITIONER_ID = createField(DSL.name("practitioner_id"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>subscriber_pi.referral_request.clinical_effective_date</code>.
     */
    public final TableField<ReferralRequestRecord, Date> CLINICAL_EFFECTIVE_DATE = createField(DSL.name("clinical_effective_date"), org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>subscriber_pi.referral_request.date_precision_concept_id</code>.
     */
    public final TableField<ReferralRequestRecord, Integer> DATE_PRECISION_CONCEPT_ID = createField(DSL.name("date_precision_concept_id"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>subscriber_pi.referral_request.requester_organization_id</code>.
     */
    public final TableField<ReferralRequestRecord, Long> REQUESTER_ORGANIZATION_ID = createField(DSL.name("requester_organization_id"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>subscriber_pi.referral_request.recipient_organization_id</code>.
     */
    public final TableField<ReferralRequestRecord, Long> RECIPIENT_ORGANIZATION_ID = createField(DSL.name("recipient_organization_id"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>subscriber_pi.referral_request.referral_request_priority_concept_id</code>.
     */
    public final TableField<ReferralRequestRecord, Integer> REFERRAL_REQUEST_PRIORITY_CONCEPT_ID = createField(DSL.name("referral_request_priority_concept_id"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>subscriber_pi.referral_request.referral_request_type_concept_id</code>.
     */
    public final TableField<ReferralRequestRecord, Integer> REFERRAL_REQUEST_TYPE_CONCEPT_ID = createField(DSL.name("referral_request_type_concept_id"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>subscriber_pi.referral_request.mode</code>.
     */
    public final TableField<ReferralRequestRecord, String> MODE = createField(DSL.name("mode"), org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>subscriber_pi.referral_request.outgoing_referral</code>.
     */
    public final TableField<ReferralRequestRecord, Byte> OUTGOING_REFERRAL = createField(DSL.name("outgoing_referral"), org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * The column <code>subscriber_pi.referral_request.is_review</code>.
     */
    public final TableField<ReferralRequestRecord, Byte> IS_REVIEW = createField(DSL.name("is_review"), org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * The column <code>subscriber_pi.referral_request.core_concept_id</code>.
     */
    public final TableField<ReferralRequestRecord, Integer> CORE_CONCEPT_ID = createField(DSL.name("core_concept_id"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>subscriber_pi.referral_request.non_core_concept_id</code>.
     */
    public final TableField<ReferralRequestRecord, Integer> NON_CORE_CONCEPT_ID = createField(DSL.name("non_core_concept_id"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>subscriber_pi.referral_request.age_at_event</code>.
     */
    public final TableField<ReferralRequestRecord, BigDecimal> AGE_AT_EVENT = createField(DSL.name("age_at_event"), org.jooq.impl.SQLDataType.DECIMAL(5, 2), this, "");

    /**
     * Create a <code>subscriber_pi.referral_request</code> table reference
     */
    public ReferralRequest() {
        this(DSL.name("referral_request"), null);
    }

    /**
     * Create an aliased <code>subscriber_pi.referral_request</code> table reference
     */
    public ReferralRequest(String alias) {
        this(DSL.name(alias), REFERRAL_REQUEST);
    }

    /**
     * Create an aliased <code>subscriber_pi.referral_request</code> table reference
     */
    public ReferralRequest(Name alias) {
        this(alias, REFERRAL_REQUEST);
    }

    private ReferralRequest(Name alias, Table<ReferralRequestRecord> aliased) {
        this(alias, aliased, null);
    }

    private ReferralRequest(Name alias, Table<ReferralRequestRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ReferralRequest(Table<O> child, ForeignKey<O, ReferralRequestRecord> key) {
        super(child, key, REFERRAL_REQUEST);
    }

    @Override
    public Schema getSchema() {
        return SubscriberPi.SUBSCRIBER_PI;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.REFERRAL_REQUEST_FK_REFERRAL_REQUEST_ENCOUNTER_ID, Indexes.REFERRAL_REQUEST_FK_REFERRAL_REQUEST_PATIENT_ID_ORGANIZATION_ID, Indexes.REFERRAL_REQUEST_FK_REFERRAL_REQUEST_PRACTITIONER_ID, Indexes.REFERRAL_REQUEST_FK_REFERRAL_REQUEST_RECIPIENT_ORGANIZATION_ID, Indexes.REFERRAL_REQUEST_FK_REFERRAL_REQUEST_REQUESTER_ORGANIZATION_ID, Indexes.REFERRAL_REQUEST_PRIMARY, Indexes.REFERRAL_REQUEST_REFERRAL_REQUEST_CORE_CONCEPT_ID, Indexes.REFERRAL_REQUEST_REFERRAL_REQUEST_ID, Indexes.REFERRAL_REQUEST_REFERRAL_REQUEST_PATIENT_ID);
    }

    @Override
    public UniqueKey<ReferralRequestRecord> getPrimaryKey() {
        return Keys.KEY_REFERRAL_REQUEST_PRIMARY;
    }

    @Override
    public List<UniqueKey<ReferralRequestRecord>> getKeys() {
        return Arrays.<UniqueKey<ReferralRequestRecord>>asList(Keys.KEY_REFERRAL_REQUEST_PRIMARY, Keys.KEY_REFERRAL_REQUEST_REFERRAL_REQUEST_ID);
    }

    @Override
    public List<ForeignKey<ReferralRequestRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ReferralRequestRecord, ?>>asList(Keys.FK_REFERRAL_REQUEST_PATIENT_ID_ORGANIZATION_ID, Keys.FK_REFERRAL_REQUEST_ENCOUNTER_ID, Keys.FK_REFERRAL_REQUEST_PRACTITIONER_ID, Keys.FK_REFERRAL_REQUEST_REQUESTER_ORGANIZATION_ID, Keys.FK_REFERRAL_REQUEST_RECIPIENT_ORGANIZATION_ID);
    }

    public Patient patient() {
        return new Patient(this, Keys.FK_REFERRAL_REQUEST_PATIENT_ID_ORGANIZATION_ID);
    }

    public Encounter encounter() {
        return new Encounter(this, Keys.FK_REFERRAL_REQUEST_ENCOUNTER_ID);
    }

    public Practitioner practitioner() {
        return new Practitioner(this, Keys.FK_REFERRAL_REQUEST_PRACTITIONER_ID);
    }

    public Organization fkReferralRequestRequesterOrganizationId() {
        return new Organization(this, Keys.FK_REFERRAL_REQUEST_REQUESTER_ORGANIZATION_ID);
    }

    public Organization fkReferralRequestRecipientOrganizationId() {
        return new Organization(this, Keys.FK_REFERRAL_REQUEST_RECIPIENT_ORGANIZATION_ID);
    }

    @Override
    public ReferralRequest as(String alias) {
        return new ReferralRequest(DSL.name(alias), this);
    }

    @Override
    public ReferralRequest as(Name alias) {
        return new ReferralRequest(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ReferralRequest rename(String name) {
        return new ReferralRequest(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ReferralRequest rename(Name name) {
        return new ReferralRequest(name, null);
    }

    // -------------------------------------------------------------------------
    // Row18 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row18<Long, Long, Long, Long, Long, Long, Date, Integer, Long, Long, Integer, Integer, String, Byte, Byte, Integer, Integer, BigDecimal> fieldsRow() {
        return (Row18) super.fieldsRow();
    }
}

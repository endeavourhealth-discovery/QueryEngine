/*
 * This file is generated by jOOQ.
 */
package org.endeavour.queryengine.db.tables.records;


import java.sql.Date;

import javax.annotation.Generated;

import org.endeavour.queryengine.db.tables.EpisodeOfCare;
import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


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
public class EpisodeOfCareRecord extends UpdatableRecordImpl<EpisodeOfCareRecord> implements Record9<Long, Long, Long, Long, Integer, Integer, Date, Date, Long> {

    private static final long serialVersionUID = 341991985;

    /**
     * Setter for <code>subscriber_pi.episode_of_care.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>subscriber_pi.episode_of_care.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>subscriber_pi.episode_of_care.organization_id</code>.
     */
    public void setOrganizationId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>subscriber_pi.episode_of_care.organization_id</code>.
     */
    public Long getOrganizationId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>subscriber_pi.episode_of_care.patient_id</code>.
     */
    public void setPatientId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>subscriber_pi.episode_of_care.patient_id</code>.
     */
    public Long getPatientId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>subscriber_pi.episode_of_care.person_id</code>.
     */
    public void setPersonId(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>subscriber_pi.episode_of_care.person_id</code>.
     */
    public Long getPersonId() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>subscriber_pi.episode_of_care.registration_type_concept_id</code>.
     */
    public void setRegistrationTypeConceptId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>subscriber_pi.episode_of_care.registration_type_concept_id</code>.
     */
    public Integer getRegistrationTypeConceptId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>subscriber_pi.episode_of_care.registration_status_concept_id</code>.
     */
    public void setRegistrationStatusConceptId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>subscriber_pi.episode_of_care.registration_status_concept_id</code>.
     */
    public Integer getRegistrationStatusConceptId() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>subscriber_pi.episode_of_care.date_registered</code>.
     */
    public void setDateRegistered(Date value) {
        set(6, value);
    }

    /**
     * Getter for <code>subscriber_pi.episode_of_care.date_registered</code>.
     */
    public Date getDateRegistered() {
        return (Date) get(6);
    }

    /**
     * Setter for <code>subscriber_pi.episode_of_care.date_registered_end</code>.
     */
    public void setDateRegisteredEnd(Date value) {
        set(7, value);
    }

    /**
     * Getter for <code>subscriber_pi.episode_of_care.date_registered_end</code>.
     */
    public Date getDateRegisteredEnd() {
        return (Date) get(7);
    }

    /**
     * Setter for <code>subscriber_pi.episode_of_care.usual_gp_practitioner_id</code>.
     */
    public void setUsualGpPractitionerId(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>subscriber_pi.episode_of_care.usual_gp_practitioner_id</code>.
     */
    public Long getUsualGpPractitionerId() {
        return (Long) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record3<Long, Long, Long> key() {
        return (Record3) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<Long, Long, Long, Long, Integer, Integer, Date, Date, Long> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<Long, Long, Long, Long, Integer, Integer, Date, Date, Long> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return EpisodeOfCare.EPISODE_OF_CARE.ID;
    }

    @Override
    public Field<Long> field2() {
        return EpisodeOfCare.EPISODE_OF_CARE.ORGANIZATION_ID;
    }

    @Override
    public Field<Long> field3() {
        return EpisodeOfCare.EPISODE_OF_CARE.PATIENT_ID;
    }

    @Override
    public Field<Long> field4() {
        return EpisodeOfCare.EPISODE_OF_CARE.PERSON_ID;
    }

    @Override
    public Field<Integer> field5() {
        return EpisodeOfCare.EPISODE_OF_CARE.REGISTRATION_TYPE_CONCEPT_ID;
    }

    @Override
    public Field<Integer> field6() {
        return EpisodeOfCare.EPISODE_OF_CARE.REGISTRATION_STATUS_CONCEPT_ID;
    }

    @Override
    public Field<Date> field7() {
        return EpisodeOfCare.EPISODE_OF_CARE.DATE_REGISTERED;
    }

    @Override
    public Field<Date> field8() {
        return EpisodeOfCare.EPISODE_OF_CARE.DATE_REGISTERED_END;
    }

    @Override
    public Field<Long> field9() {
        return EpisodeOfCare.EPISODE_OF_CARE.USUAL_GP_PRACTITIONER_ID;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public Long component2() {
        return getOrganizationId();
    }

    @Override
    public Long component3() {
        return getPatientId();
    }

    @Override
    public Long component4() {
        return getPersonId();
    }

    @Override
    public Integer component5() {
        return getRegistrationTypeConceptId();
    }

    @Override
    public Integer component6() {
        return getRegistrationStatusConceptId();
    }

    @Override
    public Date component7() {
        return getDateRegistered();
    }

    @Override
    public Date component8() {
        return getDateRegisteredEnd();
    }

    @Override
    public Long component9() {
        return getUsualGpPractitionerId();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public Long value2() {
        return getOrganizationId();
    }

    @Override
    public Long value3() {
        return getPatientId();
    }

    @Override
    public Long value4() {
        return getPersonId();
    }

    @Override
    public Integer value5() {
        return getRegistrationTypeConceptId();
    }

    @Override
    public Integer value6() {
        return getRegistrationStatusConceptId();
    }

    @Override
    public Date value7() {
        return getDateRegistered();
    }

    @Override
    public Date value8() {
        return getDateRegisteredEnd();
    }

    @Override
    public Long value9() {
        return getUsualGpPractitionerId();
    }

    @Override
    public EpisodeOfCareRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public EpisodeOfCareRecord value2(Long value) {
        setOrganizationId(value);
        return this;
    }

    @Override
    public EpisodeOfCareRecord value3(Long value) {
        setPatientId(value);
        return this;
    }

    @Override
    public EpisodeOfCareRecord value4(Long value) {
        setPersonId(value);
        return this;
    }

    @Override
    public EpisodeOfCareRecord value5(Integer value) {
        setRegistrationTypeConceptId(value);
        return this;
    }

    @Override
    public EpisodeOfCareRecord value6(Integer value) {
        setRegistrationStatusConceptId(value);
        return this;
    }

    @Override
    public EpisodeOfCareRecord value7(Date value) {
        setDateRegistered(value);
        return this;
    }

    @Override
    public EpisodeOfCareRecord value8(Date value) {
        setDateRegisteredEnd(value);
        return this;
    }

    @Override
    public EpisodeOfCareRecord value9(Long value) {
        setUsualGpPractitionerId(value);
        return this;
    }

    @Override
    public EpisodeOfCareRecord values(Long value1, Long value2, Long value3, Long value4, Integer value5, Integer value6, Date value7, Date value8, Long value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EpisodeOfCareRecord
     */
    public EpisodeOfCareRecord() {
        super(EpisodeOfCare.EPISODE_OF_CARE);
    }

    /**
     * Create a detached, initialised EpisodeOfCareRecord
     */
    public EpisodeOfCareRecord(Long id, Long organizationId, Long patientId, Long personId, Integer registrationTypeConceptId, Integer registrationStatusConceptId, Date dateRegistered, Date dateRegisteredEnd, Long usualGpPractitionerId) {
        super(EpisodeOfCare.EPISODE_OF_CARE);

        set(0, id);
        set(1, organizationId);
        set(2, patientId);
        set(3, personId);
        set(4, registrationTypeConceptId);
        set(5, registrationStatusConceptId);
        set(6, dateRegistered);
        set(7, dateRegisteredEnd);
        set(8, usualGpPractitionerId);
    }
}

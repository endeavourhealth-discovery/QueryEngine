/*
 * This file is generated by jOOQ.
 */
package org.endeavour.queryengine.db.tables.records;


import java.sql.Date;

import javax.annotation.Generated;

import org.endeavour.queryengine.db.tables.PatientContact;
import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * stores contact details (e.g. phone) for patients
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PatientContactRecord extends UpdatableRecordImpl<PatientContactRecord> implements Record9<Long, Long, Long, Long, Integer, Integer, Date, Date, String> {

    private static final long serialVersionUID = -170298952;

    /**
     * Setter for <code>subscriber_pi.patient_contact.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>subscriber_pi.patient_contact.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>subscriber_pi.patient_contact.organization_id</code>.
     */
    public void setOrganizationId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>subscriber_pi.patient_contact.organization_id</code>.
     */
    public Long getOrganizationId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>subscriber_pi.patient_contact.patient_id</code>.
     */
    public void setPatientId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>subscriber_pi.patient_contact.patient_id</code>.
     */
    public Long getPatientId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>subscriber_pi.patient_contact.person_id</code>.
     */
    public void setPersonId(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>subscriber_pi.patient_contact.person_id</code>.
     */
    public Long getPersonId() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>subscriber_pi.patient_contact.use_concept_id</code>. use of contact (e.g. mobile, home, work)
     */
    public void setUseConceptId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>subscriber_pi.patient_contact.use_concept_id</code>. use of contact (e.g. mobile, home, work)
     */
    public Integer getUseConceptId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>subscriber_pi.patient_contact.type_concept_id</code>. type of contact (e.g. phone, email)
     */
    public void setTypeConceptId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>subscriber_pi.patient_contact.type_concept_id</code>. type of contact (e.g. phone, email)
     */
    public Integer getTypeConceptId() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>subscriber_pi.patient_contact.start_date</code>.
     */
    public void setStartDate(Date value) {
        set(6, value);
    }

    /**
     * Getter for <code>subscriber_pi.patient_contact.start_date</code>.
     */
    public Date getStartDate() {
        return (Date) get(6);
    }

    /**
     * Setter for <code>subscriber_pi.patient_contact.end_date</code>.
     */
    public void setEndDate(Date value) {
        set(7, value);
    }

    /**
     * Getter for <code>subscriber_pi.patient_contact.end_date</code>.
     */
    public Date getEndDate() {
        return (Date) get(7);
    }

    /**
     * Setter for <code>subscriber_pi.patient_contact.value</code>. the actual phone number or email address
     */
    public void setValue(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>subscriber_pi.patient_contact.value</code>. the actual phone number or email address
     */
    public String getValue() {
        return (String) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record4<Long, Long, Long, Long> key() {
        return (Record4) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<Long, Long, Long, Long, Integer, Integer, Date, Date, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<Long, Long, Long, Long, Integer, Integer, Date, Date, String> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return PatientContact.PATIENT_CONTACT.ID;
    }

    @Override
    public Field<Long> field2() {
        return PatientContact.PATIENT_CONTACT.ORGANIZATION_ID;
    }

    @Override
    public Field<Long> field3() {
        return PatientContact.PATIENT_CONTACT.PATIENT_ID;
    }

    @Override
    public Field<Long> field4() {
        return PatientContact.PATIENT_CONTACT.PERSON_ID;
    }

    @Override
    public Field<Integer> field5() {
        return PatientContact.PATIENT_CONTACT.USE_CONCEPT_ID;
    }

    @Override
    public Field<Integer> field6() {
        return PatientContact.PATIENT_CONTACT.TYPE_CONCEPT_ID;
    }

    @Override
    public Field<Date> field7() {
        return PatientContact.PATIENT_CONTACT.START_DATE;
    }

    @Override
    public Field<Date> field8() {
        return PatientContact.PATIENT_CONTACT.END_DATE;
    }

    @Override
    public Field<String> field9() {
        return PatientContact.PATIENT_CONTACT.VALUE;
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
        return getUseConceptId();
    }

    @Override
    public Integer component6() {
        return getTypeConceptId();
    }

    @Override
    public Date component7() {
        return getStartDate();
    }

    @Override
    public Date component8() {
        return getEndDate();
    }

    @Override
    public String component9() {
        return getValue();
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
        return getUseConceptId();
    }

    @Override
    public Integer value6() {
        return getTypeConceptId();
    }

    @Override
    public Date value7() {
        return getStartDate();
    }

    @Override
    public Date value8() {
        return getEndDate();
    }

    @Override
    public String value9() {
        return getValue();
    }

    @Override
    public PatientContactRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public PatientContactRecord value2(Long value) {
        setOrganizationId(value);
        return this;
    }

    @Override
    public PatientContactRecord value3(Long value) {
        setPatientId(value);
        return this;
    }

    @Override
    public PatientContactRecord value4(Long value) {
        setPersonId(value);
        return this;
    }

    @Override
    public PatientContactRecord value5(Integer value) {
        setUseConceptId(value);
        return this;
    }

    @Override
    public PatientContactRecord value6(Integer value) {
        setTypeConceptId(value);
        return this;
    }

    @Override
    public PatientContactRecord value7(Date value) {
        setStartDate(value);
        return this;
    }

    @Override
    public PatientContactRecord value8(Date value) {
        setEndDate(value);
        return this;
    }

    @Override
    public PatientContactRecord value9(String value) {
        setValue(value);
        return this;
    }

    @Override
    public PatientContactRecord values(Long value1, Long value2, Long value3, Long value4, Integer value5, Integer value6, Date value7, Date value8, String value9) {
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
     * Create a detached PatientContactRecord
     */
    public PatientContactRecord() {
        super(PatientContact.PATIENT_CONTACT);
    }

    /**
     * Create a detached, initialised PatientContactRecord
     */
    public PatientContactRecord(Long id, Long organizationId, Long patientId, Long personId, Integer useConceptId, Integer typeConceptId, Date startDate, Date endDate, String value) {
        super(PatientContact.PATIENT_CONTACT);

        set(0, id);
        set(1, organizationId);
        set(2, patientId);
        set(3, personId);
        set(4, useConceptId);
        set(5, typeConceptId);
        set(6, startDate);
        set(7, endDate);
        set(8, value);
    }
}

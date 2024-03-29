/*
 * This file is generated by jOOQ.
 */
package org.endeavour.queryengine.db.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.endeavour.queryengine.db.tables.Appointment;
import org.jooq.Field;
import org.jooq.Record16;
import org.jooq.Record3;
import org.jooq.Row16;
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
public class AppointmentRecord extends UpdatableRecordImpl<AppointmentRecord> implements Record16<Long, Long, Long, Long, Long, Long, Timestamp, Integer, Integer, Integer, Integer, Integer, Timestamp, Timestamp, String, Timestamp> {

    private static final long serialVersionUID = -745349479;

    /**
     * Setter for <code>subscriber_pi.appointment.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>subscriber_pi.appointment.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>subscriber_pi.appointment.organization_id</code>.
     */
    public void setOrganizationId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>subscriber_pi.appointment.organization_id</code>.
     */
    public Long getOrganizationId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>subscriber_pi.appointment.patient_id</code>.
     */
    public void setPatientId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>subscriber_pi.appointment.patient_id</code>.
     */
    public Long getPatientId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>subscriber_pi.appointment.person_id</code>.
     */
    public void setPersonId(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>subscriber_pi.appointment.person_id</code>.
     */
    public Long getPersonId() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>subscriber_pi.appointment.practitioner_id</code>.
     */
    public void setPractitionerId(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>subscriber_pi.appointment.practitioner_id</code>.
     */
    public Long getPractitionerId() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>subscriber_pi.appointment.schedule_id</code>.
     */
    public void setScheduleId(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>subscriber_pi.appointment.schedule_id</code>.
     */
    public Long getScheduleId() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>subscriber_pi.appointment.start_date</code>.
     */
    public void setStartDate(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>subscriber_pi.appointment.start_date</code>.
     */
    public Timestamp getStartDate() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>subscriber_pi.appointment.planned_duration</code>.
     */
    public void setPlannedDuration(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>subscriber_pi.appointment.planned_duration</code>.
     */
    public Integer getPlannedDuration() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>subscriber_pi.appointment.actual_duration</code>.
     */
    public void setActualDuration(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>subscriber_pi.appointment.actual_duration</code>.
     */
    public Integer getActualDuration() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>subscriber_pi.appointment.appointment_status_concept_id</code>.
     */
    public void setAppointmentStatusConceptId(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>subscriber_pi.appointment.appointment_status_concept_id</code>.
     */
    public Integer getAppointmentStatusConceptId() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>subscriber_pi.appointment.patient_wait</code>.
     */
    public void setPatientWait(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>subscriber_pi.appointment.patient_wait</code>.
     */
    public Integer getPatientWait() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>subscriber_pi.appointment.patient_delay</code>.
     */
    public void setPatientDelay(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>subscriber_pi.appointment.patient_delay</code>.
     */
    public Integer getPatientDelay() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>subscriber_pi.appointment.date_time_sent_in</code>.
     */
    public void setDateTimeSentIn(Timestamp value) {
        set(12, value);
    }

    /**
     * Getter for <code>subscriber_pi.appointment.date_time_sent_in</code>.
     */
    public Timestamp getDateTimeSentIn() {
        return (Timestamp) get(12);
    }

    /**
     * Setter for <code>subscriber_pi.appointment.date_time_left</code>.
     */
    public void setDateTimeLeft(Timestamp value) {
        set(13, value);
    }

    /**
     * Getter for <code>subscriber_pi.appointment.date_time_left</code>.
     */
    public Timestamp getDateTimeLeft() {
        return (Timestamp) get(13);
    }

    /**
     * Setter for <code>subscriber_pi.appointment.source_id</code>.
     */
    public void setSourceId(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>subscriber_pi.appointment.source_id</code>.
     */
    public String getSourceId() {
        return (String) get(14);
    }

    /**
     * Setter for <code>subscriber_pi.appointment.cancelled_date</code>.
     */
    public void setCancelledDate(Timestamp value) {
        set(15, value);
    }

    /**
     * Getter for <code>subscriber_pi.appointment.cancelled_date</code>.
     */
    public Timestamp getCancelledDate() {
        return (Timestamp) get(15);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record3<Long, Long, Long> key() {
        return (Record3) super.key();
    }

    // -------------------------------------------------------------------------
    // Record16 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row16<Long, Long, Long, Long, Long, Long, Timestamp, Integer, Integer, Integer, Integer, Integer, Timestamp, Timestamp, String, Timestamp> fieldsRow() {
        return (Row16) super.fieldsRow();
    }

    @Override
    public Row16<Long, Long, Long, Long, Long, Long, Timestamp, Integer, Integer, Integer, Integer, Integer, Timestamp, Timestamp, String, Timestamp> valuesRow() {
        return (Row16) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Appointment.APPOINTMENT.ID;
    }

    @Override
    public Field<Long> field2() {
        return Appointment.APPOINTMENT.ORGANIZATION_ID;
    }

    @Override
    public Field<Long> field3() {
        return Appointment.APPOINTMENT.PATIENT_ID;
    }

    @Override
    public Field<Long> field4() {
        return Appointment.APPOINTMENT.PERSON_ID;
    }

    @Override
    public Field<Long> field5() {
        return Appointment.APPOINTMENT.PRACTITIONER_ID;
    }

    @Override
    public Field<Long> field6() {
        return Appointment.APPOINTMENT.SCHEDULE_ID;
    }

    @Override
    public Field<Timestamp> field7() {
        return Appointment.APPOINTMENT.START_DATE;
    }

    @Override
    public Field<Integer> field8() {
        return Appointment.APPOINTMENT.PLANNED_DURATION;
    }

    @Override
    public Field<Integer> field9() {
        return Appointment.APPOINTMENT.ACTUAL_DURATION;
    }

    @Override
    public Field<Integer> field10() {
        return Appointment.APPOINTMENT.APPOINTMENT_STATUS_CONCEPT_ID;
    }

    @Override
    public Field<Integer> field11() {
        return Appointment.APPOINTMENT.PATIENT_WAIT;
    }

    @Override
    public Field<Integer> field12() {
        return Appointment.APPOINTMENT.PATIENT_DELAY;
    }

    @Override
    public Field<Timestamp> field13() {
        return Appointment.APPOINTMENT.DATE_TIME_SENT_IN;
    }

    @Override
    public Field<Timestamp> field14() {
        return Appointment.APPOINTMENT.DATE_TIME_LEFT;
    }

    @Override
    public Field<String> field15() {
        return Appointment.APPOINTMENT.SOURCE_ID;
    }

    @Override
    public Field<Timestamp> field16() {
        return Appointment.APPOINTMENT.CANCELLED_DATE;
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
    public Long component5() {
        return getPractitionerId();
    }

    @Override
    public Long component6() {
        return getScheduleId();
    }

    @Override
    public Timestamp component7() {
        return getStartDate();
    }

    @Override
    public Integer component8() {
        return getPlannedDuration();
    }

    @Override
    public Integer component9() {
        return getActualDuration();
    }

    @Override
    public Integer component10() {
        return getAppointmentStatusConceptId();
    }

    @Override
    public Integer component11() {
        return getPatientWait();
    }

    @Override
    public Integer component12() {
        return getPatientDelay();
    }

    @Override
    public Timestamp component13() {
        return getDateTimeSentIn();
    }

    @Override
    public Timestamp component14() {
        return getDateTimeLeft();
    }

    @Override
    public String component15() {
        return getSourceId();
    }

    @Override
    public Timestamp component16() {
        return getCancelledDate();
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
    public Long value5() {
        return getPractitionerId();
    }

    @Override
    public Long value6() {
        return getScheduleId();
    }

    @Override
    public Timestamp value7() {
        return getStartDate();
    }

    @Override
    public Integer value8() {
        return getPlannedDuration();
    }

    @Override
    public Integer value9() {
        return getActualDuration();
    }

    @Override
    public Integer value10() {
        return getAppointmentStatusConceptId();
    }

    @Override
    public Integer value11() {
        return getPatientWait();
    }

    @Override
    public Integer value12() {
        return getPatientDelay();
    }

    @Override
    public Timestamp value13() {
        return getDateTimeSentIn();
    }

    @Override
    public Timestamp value14() {
        return getDateTimeLeft();
    }

    @Override
    public String value15() {
        return getSourceId();
    }

    @Override
    public Timestamp value16() {
        return getCancelledDate();
    }

    @Override
    public AppointmentRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public AppointmentRecord value2(Long value) {
        setOrganizationId(value);
        return this;
    }

    @Override
    public AppointmentRecord value3(Long value) {
        setPatientId(value);
        return this;
    }

    @Override
    public AppointmentRecord value4(Long value) {
        setPersonId(value);
        return this;
    }

    @Override
    public AppointmentRecord value5(Long value) {
        setPractitionerId(value);
        return this;
    }

    @Override
    public AppointmentRecord value6(Long value) {
        setScheduleId(value);
        return this;
    }

    @Override
    public AppointmentRecord value7(Timestamp value) {
        setStartDate(value);
        return this;
    }

    @Override
    public AppointmentRecord value8(Integer value) {
        setPlannedDuration(value);
        return this;
    }

    @Override
    public AppointmentRecord value9(Integer value) {
        setActualDuration(value);
        return this;
    }

    @Override
    public AppointmentRecord value10(Integer value) {
        setAppointmentStatusConceptId(value);
        return this;
    }

    @Override
    public AppointmentRecord value11(Integer value) {
        setPatientWait(value);
        return this;
    }

    @Override
    public AppointmentRecord value12(Integer value) {
        setPatientDelay(value);
        return this;
    }

    @Override
    public AppointmentRecord value13(Timestamp value) {
        setDateTimeSentIn(value);
        return this;
    }

    @Override
    public AppointmentRecord value14(Timestamp value) {
        setDateTimeLeft(value);
        return this;
    }

    @Override
    public AppointmentRecord value15(String value) {
        setSourceId(value);
        return this;
    }

    @Override
    public AppointmentRecord value16(Timestamp value) {
        setCancelledDate(value);
        return this;
    }

    @Override
    public AppointmentRecord values(Long value1, Long value2, Long value3, Long value4, Long value5, Long value6, Timestamp value7, Integer value8, Integer value9, Integer value10, Integer value11, Integer value12, Timestamp value13, Timestamp value14, String value15, Timestamp value16) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AppointmentRecord
     */
    public AppointmentRecord() {
        super(Appointment.APPOINTMENT);
    }

    /**
     * Create a detached, initialised AppointmentRecord
     */
    public AppointmentRecord(Long id, Long organizationId, Long patientId, Long personId, Long practitionerId, Long scheduleId, Timestamp startDate, Integer plannedDuration, Integer actualDuration, Integer appointmentStatusConceptId, Integer patientWait, Integer patientDelay, Timestamp dateTimeSentIn, Timestamp dateTimeLeft, String sourceId, Timestamp cancelledDate) {
        super(Appointment.APPOINTMENT);

        set(0, id);
        set(1, organizationId);
        set(2, patientId);
        set(3, personId);
        set(4, practitionerId);
        set(5, scheduleId);
        set(6, startDate);
        set(7, plannedDuration);
        set(8, actualDuration);
        set(9, appointmentStatusConceptId);
        set(10, patientWait);
        set(11, patientDelay);
        set(12, dateTimeSentIn);
        set(13, dateTimeLeft);
        set(14, sourceId);
        set(15, cancelledDate);
    }
}

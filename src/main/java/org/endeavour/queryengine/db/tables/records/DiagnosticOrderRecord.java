/*
 * This file is generated by jOOQ.
 */
package org.endeavour.queryengine.db.tables.records;


import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;

import org.endeavour.queryengine.db.tables.DiagnosticOrder;
import org.jooq.Field;
import org.jooq.Record22;
import org.jooq.Record3;
import org.jooq.Row22;
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
public class DiagnosticOrderRecord extends UpdatableRecordImpl<DiagnosticOrderRecord> implements Record22<Long, Long, Long, Long, Long, Long, Date, Integer, Double, String, Date, String, Integer, Byte, Byte, Date, Long, Integer, Integer, BigDecimal, Integer, Byte> {

    private static final long serialVersionUID = 1697215018;

    /**
     * Setter for <code>subscriber_pi.diagnostic_order.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>subscriber_pi.diagnostic_order.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>subscriber_pi.diagnostic_order.organization_id</code>.
     */
    public void setOrganizationId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>subscriber_pi.diagnostic_order.organization_id</code>.
     */
    public Long getOrganizationId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>subscriber_pi.diagnostic_order.patient_id</code>.
     */
    public void setPatientId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>subscriber_pi.diagnostic_order.patient_id</code>.
     */
    public Long getPatientId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>subscriber_pi.diagnostic_order.person_id</code>.
     */
    public void setPersonId(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>subscriber_pi.diagnostic_order.person_id</code>.
     */
    public Long getPersonId() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>subscriber_pi.diagnostic_order.encounter_id</code>.
     */
    public void setEncounterId(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>subscriber_pi.diagnostic_order.encounter_id</code>.
     */
    public Long getEncounterId() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>subscriber_pi.diagnostic_order.practitioner_id</code>.
     */
    public void setPractitionerId(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>subscriber_pi.diagnostic_order.practitioner_id</code>.
     */
    public Long getPractitionerId() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>subscriber_pi.diagnostic_order.clinical_effective_date</code>.
     */
    public void setClinicalEffectiveDate(Date value) {
        set(6, value);
    }

    /**
     * Getter for <code>subscriber_pi.diagnostic_order.clinical_effective_date</code>.
     */
    public Date getClinicalEffectiveDate() {
        return (Date) get(6);
    }

    /**
     * Setter for <code>subscriber_pi.diagnostic_order.date_precision_concept_id</code>.
     */
    public void setDatePrecisionConceptId(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>subscriber_pi.diagnostic_order.date_precision_concept_id</code>.
     */
    public Integer getDatePrecisionConceptId() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>subscriber_pi.diagnostic_order.result_value</code>.
     */
    public void setResultValue(Double value) {
        set(8, value);
    }

    /**
     * Getter for <code>subscriber_pi.diagnostic_order.result_value</code>.
     */
    public Double getResultValue() {
        return (Double) get(8);
    }

    /**
     * Setter for <code>subscriber_pi.diagnostic_order.result_value_units</code>.
     */
    public void setResultValueUnits(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>subscriber_pi.diagnostic_order.result_value_units</code>.
     */
    public String getResultValueUnits() {
        return (String) get(9);
    }

    /**
     * Setter for <code>subscriber_pi.diagnostic_order.result_date</code>.
     */
    public void setResultDate(Date value) {
        set(10, value);
    }

    /**
     * Getter for <code>subscriber_pi.diagnostic_order.result_date</code>.
     */
    public Date getResultDate() {
        return (Date) get(10);
    }

    /**
     * Setter for <code>subscriber_pi.diagnostic_order.result_text</code>.
     */
    public void setResultText(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>subscriber_pi.diagnostic_order.result_text</code>.
     */
    public String getResultText() {
        return (String) get(11);
    }

    /**
     * Setter for <code>subscriber_pi.diagnostic_order.result_concept_id</code>.
     */
    public void setResultConceptId(Integer value) {
        set(12, value);
    }

    /**
     * Getter for <code>subscriber_pi.diagnostic_order.result_concept_id</code>.
     */
    public Integer getResultConceptId() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>subscriber_pi.diagnostic_order.is_problem</code>.
     */
    public void setIsProblem(Byte value) {
        set(13, value);
    }

    /**
     * Getter for <code>subscriber_pi.diagnostic_order.is_problem</code>.
     */
    public Byte getIsProblem() {
        return (Byte) get(13);
    }

    /**
     * Setter for <code>subscriber_pi.diagnostic_order.is_review</code>.
     */
    public void setIsReview(Byte value) {
        set(14, value);
    }

    /**
     * Getter for <code>subscriber_pi.diagnostic_order.is_review</code>.
     */
    public Byte getIsReview() {
        return (Byte) get(14);
    }

    /**
     * Setter for <code>subscriber_pi.diagnostic_order.problem_end_date</code>.
     */
    public void setProblemEndDate(Date value) {
        set(15, value);
    }

    /**
     * Getter for <code>subscriber_pi.diagnostic_order.problem_end_date</code>.
     */
    public Date getProblemEndDate() {
        return (Date) get(15);
    }

    /**
     * Setter for <code>subscriber_pi.diagnostic_order.parent_observation_id</code>.
     */
    public void setParentObservationId(Long value) {
        set(16, value);
    }

    /**
     * Getter for <code>subscriber_pi.diagnostic_order.parent_observation_id</code>.
     */
    public Long getParentObservationId() {
        return (Long) get(16);
    }

    /**
     * Setter for <code>subscriber_pi.diagnostic_order.core_concept_id</code>.
     */
    public void setCoreConceptId(Integer value) {
        set(17, value);
    }

    /**
     * Getter for <code>subscriber_pi.diagnostic_order.core_concept_id</code>.
     */
    public Integer getCoreConceptId() {
        return (Integer) get(17);
    }

    /**
     * Setter for <code>subscriber_pi.diagnostic_order.non_core_concept_id</code>.
     */
    public void setNonCoreConceptId(Integer value) {
        set(18, value);
    }

    /**
     * Getter for <code>subscriber_pi.diagnostic_order.non_core_concept_id</code>.
     */
    public Integer getNonCoreConceptId() {
        return (Integer) get(18);
    }

    /**
     * Setter for <code>subscriber_pi.diagnostic_order.age_at_event</code>.
     */
    public void setAgeAtEvent(BigDecimal value) {
        set(19, value);
    }

    /**
     * Getter for <code>subscriber_pi.diagnostic_order.age_at_event</code>.
     */
    public BigDecimal getAgeAtEvent() {
        return (BigDecimal) get(19);
    }

    /**
     * Setter for <code>subscriber_pi.diagnostic_order.episodicity_concept_id</code>.
     */
    public void setEpisodicityConceptId(Integer value) {
        set(20, value);
    }

    /**
     * Getter for <code>subscriber_pi.diagnostic_order.episodicity_concept_id</code>.
     */
    public Integer getEpisodicityConceptId() {
        return (Integer) get(20);
    }

    /**
     * Setter for <code>subscriber_pi.diagnostic_order.is_primary</code>.
     */
    public void setIsPrimary(Byte value) {
        set(21, value);
    }

    /**
     * Getter for <code>subscriber_pi.diagnostic_order.is_primary</code>.
     */
    public Byte getIsPrimary() {
        return (Byte) get(21);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record3<Long, Long, Long> key() {
        return (Record3) super.key();
    }

    // -------------------------------------------------------------------------
    // Record22 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row22<Long, Long, Long, Long, Long, Long, Date, Integer, Double, String, Date, String, Integer, Byte, Byte, Date, Long, Integer, Integer, BigDecimal, Integer, Byte> fieldsRow() {
        return (Row22) super.fieldsRow();
    }

    @Override
    public Row22<Long, Long, Long, Long, Long, Long, Date, Integer, Double, String, Date, String, Integer, Byte, Byte, Date, Long, Integer, Integer, BigDecimal, Integer, Byte> valuesRow() {
        return (Row22) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return DiagnosticOrder.DIAGNOSTIC_ORDER.ID;
    }

    @Override
    public Field<Long> field2() {
        return DiagnosticOrder.DIAGNOSTIC_ORDER.ORGANIZATION_ID;
    }

    @Override
    public Field<Long> field3() {
        return DiagnosticOrder.DIAGNOSTIC_ORDER.PATIENT_ID;
    }

    @Override
    public Field<Long> field4() {
        return DiagnosticOrder.DIAGNOSTIC_ORDER.PERSON_ID;
    }

    @Override
    public Field<Long> field5() {
        return DiagnosticOrder.DIAGNOSTIC_ORDER.ENCOUNTER_ID;
    }

    @Override
    public Field<Long> field6() {
        return DiagnosticOrder.DIAGNOSTIC_ORDER.PRACTITIONER_ID;
    }

    @Override
    public Field<Date> field7() {
        return DiagnosticOrder.DIAGNOSTIC_ORDER.CLINICAL_EFFECTIVE_DATE;
    }

    @Override
    public Field<Integer> field8() {
        return DiagnosticOrder.DIAGNOSTIC_ORDER.DATE_PRECISION_CONCEPT_ID;
    }

    @Override
    public Field<Double> field9() {
        return DiagnosticOrder.DIAGNOSTIC_ORDER.RESULT_VALUE;
    }

    @Override
    public Field<String> field10() {
        return DiagnosticOrder.DIAGNOSTIC_ORDER.RESULT_VALUE_UNITS;
    }

    @Override
    public Field<Date> field11() {
        return DiagnosticOrder.DIAGNOSTIC_ORDER.RESULT_DATE;
    }

    @Override
    public Field<String> field12() {
        return DiagnosticOrder.DIAGNOSTIC_ORDER.RESULT_TEXT;
    }

    @Override
    public Field<Integer> field13() {
        return DiagnosticOrder.DIAGNOSTIC_ORDER.RESULT_CONCEPT_ID;
    }

    @Override
    public Field<Byte> field14() {
        return DiagnosticOrder.DIAGNOSTIC_ORDER.IS_PROBLEM;
    }

    @Override
    public Field<Byte> field15() {
        return DiagnosticOrder.DIAGNOSTIC_ORDER.IS_REVIEW;
    }

    @Override
    public Field<Date> field16() {
        return DiagnosticOrder.DIAGNOSTIC_ORDER.PROBLEM_END_DATE;
    }

    @Override
    public Field<Long> field17() {
        return DiagnosticOrder.DIAGNOSTIC_ORDER.PARENT_OBSERVATION_ID;
    }

    @Override
    public Field<Integer> field18() {
        return DiagnosticOrder.DIAGNOSTIC_ORDER.CORE_CONCEPT_ID;
    }

    @Override
    public Field<Integer> field19() {
        return DiagnosticOrder.DIAGNOSTIC_ORDER.NON_CORE_CONCEPT_ID;
    }

    @Override
    public Field<BigDecimal> field20() {
        return DiagnosticOrder.DIAGNOSTIC_ORDER.AGE_AT_EVENT;
    }

    @Override
    public Field<Integer> field21() {
        return DiagnosticOrder.DIAGNOSTIC_ORDER.EPISODICITY_CONCEPT_ID;
    }

    @Override
    public Field<Byte> field22() {
        return DiagnosticOrder.DIAGNOSTIC_ORDER.IS_PRIMARY;
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
        return getEncounterId();
    }

    @Override
    public Long component6() {
        return getPractitionerId();
    }

    @Override
    public Date component7() {
        return getClinicalEffectiveDate();
    }

    @Override
    public Integer component8() {
        return getDatePrecisionConceptId();
    }

    @Override
    public Double component9() {
        return getResultValue();
    }

    @Override
    public String component10() {
        return getResultValueUnits();
    }

    @Override
    public Date component11() {
        return getResultDate();
    }

    @Override
    public String component12() {
        return getResultText();
    }

    @Override
    public Integer component13() {
        return getResultConceptId();
    }

    @Override
    public Byte component14() {
        return getIsProblem();
    }

    @Override
    public Byte component15() {
        return getIsReview();
    }

    @Override
    public Date component16() {
        return getProblemEndDate();
    }

    @Override
    public Long component17() {
        return getParentObservationId();
    }

    @Override
    public Integer component18() {
        return getCoreConceptId();
    }

    @Override
    public Integer component19() {
        return getNonCoreConceptId();
    }

    @Override
    public BigDecimal component20() {
        return getAgeAtEvent();
    }

    @Override
    public Integer component21() {
        return getEpisodicityConceptId();
    }

    @Override
    public Byte component22() {
        return getIsPrimary();
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
        return getEncounterId();
    }

    @Override
    public Long value6() {
        return getPractitionerId();
    }

    @Override
    public Date value7() {
        return getClinicalEffectiveDate();
    }

    @Override
    public Integer value8() {
        return getDatePrecisionConceptId();
    }

    @Override
    public Double value9() {
        return getResultValue();
    }

    @Override
    public String value10() {
        return getResultValueUnits();
    }

    @Override
    public Date value11() {
        return getResultDate();
    }

    @Override
    public String value12() {
        return getResultText();
    }

    @Override
    public Integer value13() {
        return getResultConceptId();
    }

    @Override
    public Byte value14() {
        return getIsProblem();
    }

    @Override
    public Byte value15() {
        return getIsReview();
    }

    @Override
    public Date value16() {
        return getProblemEndDate();
    }

    @Override
    public Long value17() {
        return getParentObservationId();
    }

    @Override
    public Integer value18() {
        return getCoreConceptId();
    }

    @Override
    public Integer value19() {
        return getNonCoreConceptId();
    }

    @Override
    public BigDecimal value20() {
        return getAgeAtEvent();
    }

    @Override
    public Integer value21() {
        return getEpisodicityConceptId();
    }

    @Override
    public Byte value22() {
        return getIsPrimary();
    }

    @Override
    public DiagnosticOrderRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public DiagnosticOrderRecord value2(Long value) {
        setOrganizationId(value);
        return this;
    }

    @Override
    public DiagnosticOrderRecord value3(Long value) {
        setPatientId(value);
        return this;
    }

    @Override
    public DiagnosticOrderRecord value4(Long value) {
        setPersonId(value);
        return this;
    }

    @Override
    public DiagnosticOrderRecord value5(Long value) {
        setEncounterId(value);
        return this;
    }

    @Override
    public DiagnosticOrderRecord value6(Long value) {
        setPractitionerId(value);
        return this;
    }

    @Override
    public DiagnosticOrderRecord value7(Date value) {
        setClinicalEffectiveDate(value);
        return this;
    }

    @Override
    public DiagnosticOrderRecord value8(Integer value) {
        setDatePrecisionConceptId(value);
        return this;
    }

    @Override
    public DiagnosticOrderRecord value9(Double value) {
        setResultValue(value);
        return this;
    }

    @Override
    public DiagnosticOrderRecord value10(String value) {
        setResultValueUnits(value);
        return this;
    }

    @Override
    public DiagnosticOrderRecord value11(Date value) {
        setResultDate(value);
        return this;
    }

    @Override
    public DiagnosticOrderRecord value12(String value) {
        setResultText(value);
        return this;
    }

    @Override
    public DiagnosticOrderRecord value13(Integer value) {
        setResultConceptId(value);
        return this;
    }

    @Override
    public DiagnosticOrderRecord value14(Byte value) {
        setIsProblem(value);
        return this;
    }

    @Override
    public DiagnosticOrderRecord value15(Byte value) {
        setIsReview(value);
        return this;
    }

    @Override
    public DiagnosticOrderRecord value16(Date value) {
        setProblemEndDate(value);
        return this;
    }

    @Override
    public DiagnosticOrderRecord value17(Long value) {
        setParentObservationId(value);
        return this;
    }

    @Override
    public DiagnosticOrderRecord value18(Integer value) {
        setCoreConceptId(value);
        return this;
    }

    @Override
    public DiagnosticOrderRecord value19(Integer value) {
        setNonCoreConceptId(value);
        return this;
    }

    @Override
    public DiagnosticOrderRecord value20(BigDecimal value) {
        setAgeAtEvent(value);
        return this;
    }

    @Override
    public DiagnosticOrderRecord value21(Integer value) {
        setEpisodicityConceptId(value);
        return this;
    }

    @Override
    public DiagnosticOrderRecord value22(Byte value) {
        setIsPrimary(value);
        return this;
    }

    @Override
    public DiagnosticOrderRecord values(Long value1, Long value2, Long value3, Long value4, Long value5, Long value6, Date value7, Integer value8, Double value9, String value10, Date value11, String value12, Integer value13, Byte value14, Byte value15, Date value16, Long value17, Integer value18, Integer value19, BigDecimal value20, Integer value21, Byte value22) {
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
        value17(value17);
        value18(value18);
        value19(value19);
        value20(value20);
        value21(value21);
        value22(value22);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DiagnosticOrderRecord
     */
    public DiagnosticOrderRecord() {
        super(DiagnosticOrder.DIAGNOSTIC_ORDER);
    }

    /**
     * Create a detached, initialised DiagnosticOrderRecord
     */
    public DiagnosticOrderRecord(Long id, Long organizationId, Long patientId, Long personId, Long encounterId, Long practitionerId, Date clinicalEffectiveDate, Integer datePrecisionConceptId, Double resultValue, String resultValueUnits, Date resultDate, String resultText, Integer resultConceptId, Byte isProblem, Byte isReview, Date problemEndDate, Long parentObservationId, Integer coreConceptId, Integer nonCoreConceptId, BigDecimal ageAtEvent, Integer episodicityConceptId, Byte isPrimary) {
        super(DiagnosticOrder.DIAGNOSTIC_ORDER);

        set(0, id);
        set(1, organizationId);
        set(2, patientId);
        set(3, personId);
        set(4, encounterId);
        set(5, practitionerId);
        set(6, clinicalEffectiveDate);
        set(7, datePrecisionConceptId);
        set(8, resultValue);
        set(9, resultValueUnits);
        set(10, resultDate);
        set(11, resultText);
        set(12, resultConceptId);
        set(13, isProblem);
        set(14, isReview);
        set(15, problemEndDate);
        set(16, parentObservationId);
        set(17, coreConceptId);
        set(18, nonCoreConceptId);
        set(19, ageAtEvent);
        set(20, episodicityConceptId);
        set(21, isPrimary);
    }
}
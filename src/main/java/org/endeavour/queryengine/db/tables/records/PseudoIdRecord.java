/*
 * This file is generated by jOOQ.
 */
package org.endeavour.queryengine.db.tables.records;


import javax.annotation.Generated;

import org.endeavour.queryengine.db.tables.PseudoId;
import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record4;
import org.jooq.Row4;
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
public class PseudoIdRecord extends UpdatableRecordImpl<PseudoIdRecord> implements Record4<Long, String, String, String> {

    private static final long serialVersionUID = -1421126590;

    /**
     * Setter for <code>subscriber_pi.pseudo_id.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>subscriber_pi.pseudo_id.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>subscriber_pi.pseudo_id.patient_id</code>.
     */
    public void setPatientId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>subscriber_pi.pseudo_id.patient_id</code>.
     */
    public String getPatientId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>subscriber_pi.pseudo_id.salt_key_name</code>.
     */
    public void setSaltKeyName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>subscriber_pi.pseudo_id.salt_key_name</code>.
     */
    public String getSaltKeyName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>subscriber_pi.pseudo_id.pseudo_id</code>.
     */
    public void setPseudoId(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>subscriber_pi.pseudo_id.pseudo_id</code>.
     */
    public String getPseudoId() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<String, String> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Long, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Long, String, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return PseudoId.PSEUDO_ID.ID;
    }

    @Override
    public Field<String> field2() {
        return PseudoId.PSEUDO_ID.PATIENT_ID;
    }

    @Override
    public Field<String> field3() {
        return PseudoId.PSEUDO_ID.SALT_KEY_NAME;
    }

    @Override
    public Field<String> field4() {
        return PseudoId.PSEUDO_ID.PSEUDO_ID_;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getPatientId();
    }

    @Override
    public String component3() {
        return getSaltKeyName();
    }

    @Override
    public String component4() {
        return getPseudoId();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getPatientId();
    }

    @Override
    public String value3() {
        return getSaltKeyName();
    }

    @Override
    public String value4() {
        return getPseudoId();
    }

    @Override
    public PseudoIdRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public PseudoIdRecord value2(String value) {
        setPatientId(value);
        return this;
    }

    @Override
    public PseudoIdRecord value3(String value) {
        setSaltKeyName(value);
        return this;
    }

    @Override
    public PseudoIdRecord value4(String value) {
        setPseudoId(value);
        return this;
    }

    @Override
    public PseudoIdRecord values(Long value1, String value2, String value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PseudoIdRecord
     */
    public PseudoIdRecord() {
        super(PseudoId.PSEUDO_ID);
    }

    /**
     * Create a detached, initialised PseudoIdRecord
     */
    public PseudoIdRecord(Long id, String patientId, String saltKeyName, String pseudoId) {
        super(PseudoId.PSEUDO_ID);

        set(0, id);
        set(1, patientId);
        set(2, saltKeyName);
        set(3, pseudoId);
    }
}

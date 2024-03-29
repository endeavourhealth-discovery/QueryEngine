/*
 * This file is generated by jOOQ.
 */
package org.endeavour.queryengine.db.tables.records;


import javax.annotation.Generated;

import org.endeavour.queryengine.db.tables.Concept;
import org.jooq.Field;
import org.jooq.Record1;
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
public class ConceptRecord extends UpdatableRecordImpl<ConceptRecord> implements Record9<Integer, Integer, String, Byte, String, String, String, String, Long> {

    private static final long serialVersionUID = 325726390;

    /**
     * Setter for <code>subscriber_pi.concept.dbid</code>. Unique concept int DB identifier
     */
    public void setDbid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>subscriber_pi.concept.dbid</code>. Unique concept int DB identifier
     */
    public Integer getDbid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>subscriber_pi.concept.document</code>. Document this concept originated from
     */
    public void setDocument(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>subscriber_pi.concept.document</code>. Document this concept originated from
     */
    public Integer getDocument() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>subscriber_pi.concept.id</code>. Unique human-readable concept id
     */
    public void setId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>subscriber_pi.concept.id</code>. Unique human-readable concept id
     */
    public String getId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>subscriber_pi.concept.draft</code>.
     */
    public void setDraft(Byte value) {
        set(3, value);
    }

    /**
     * Getter for <code>subscriber_pi.concept.draft</code>.
     */
    public Byte getDraft() {
        return (Byte) get(3);
    }

    /**
     * Setter for <code>subscriber_pi.concept.name</code>.
     */
    public void setName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>subscriber_pi.concept.name</code>.
     */
    public String getName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>subscriber_pi.concept.description</code>.
     */
    public void setDescription(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>subscriber_pi.concept.description</code>.
     */
    public String getDescription() {
        return (String) get(5);
    }

    /**
     * Setter for <code>subscriber_pi.concept.scheme</code>.
     */
    public void setScheme(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>subscriber_pi.concept.scheme</code>.
     */
    public String getScheme() {
        return (String) get(6);
    }

    /**
     * Setter for <code>subscriber_pi.concept.code</code>.
     */
    public void setCode(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>subscriber_pi.concept.code</code>.
     */
    public String getCode() {
        return (String) get(7);
    }

    /**
     * Setter for <code>subscriber_pi.concept.use_count</code>.
     */
    public void setUseCount(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>subscriber_pi.concept.use_count</code>.
     */
    public Long getUseCount() {
        return (Long) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<Integer, Integer, String, Byte, String, String, String, String, Long> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<Integer, Integer, String, Byte, String, String, String, String, Long> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Concept.CONCEPT.DBID;
    }

    @Override
    public Field<Integer> field2() {
        return Concept.CONCEPT.DOCUMENT;
    }

    @Override
    public Field<String> field3() {
        return Concept.CONCEPT.ID;
    }

    @Override
    public Field<Byte> field4() {
        return Concept.CONCEPT.DRAFT;
    }

    @Override
    public Field<String> field5() {
        return Concept.CONCEPT.NAME;
    }

    @Override
    public Field<String> field6() {
        return Concept.CONCEPT.DESCRIPTION;
    }

    @Override
    public Field<String> field7() {
        return Concept.CONCEPT.SCHEME;
    }

    @Override
    public Field<String> field8() {
        return Concept.CONCEPT.CODE;
    }

    @Override
    public Field<Long> field9() {
        return Concept.CONCEPT.USE_COUNT;
    }

    @Override
    public Integer component1() {
        return getDbid();
    }

    @Override
    public Integer component2() {
        return getDocument();
    }

    @Override
    public String component3() {
        return getId();
    }

    @Override
    public Byte component4() {
        return getDraft();
    }

    @Override
    public String component5() {
        return getName();
    }

    @Override
    public String component6() {
        return getDescription();
    }

    @Override
    public String component7() {
        return getScheme();
    }

    @Override
    public String component8() {
        return getCode();
    }

    @Override
    public Long component9() {
        return getUseCount();
    }

    @Override
    public Integer value1() {
        return getDbid();
    }

    @Override
    public Integer value2() {
        return getDocument();
    }

    @Override
    public String value3() {
        return getId();
    }

    @Override
    public Byte value4() {
        return getDraft();
    }

    @Override
    public String value5() {
        return getName();
    }

    @Override
    public String value6() {
        return getDescription();
    }

    @Override
    public String value7() {
        return getScheme();
    }

    @Override
    public String value8() {
        return getCode();
    }

    @Override
    public Long value9() {
        return getUseCount();
    }

    @Override
    public ConceptRecord value1(Integer value) {
        setDbid(value);
        return this;
    }

    @Override
    public ConceptRecord value2(Integer value) {
        setDocument(value);
        return this;
    }

    @Override
    public ConceptRecord value3(String value) {
        setId(value);
        return this;
    }

    @Override
    public ConceptRecord value4(Byte value) {
        setDraft(value);
        return this;
    }

    @Override
    public ConceptRecord value5(String value) {
        setName(value);
        return this;
    }

    @Override
    public ConceptRecord value6(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public ConceptRecord value7(String value) {
        setScheme(value);
        return this;
    }

    @Override
    public ConceptRecord value8(String value) {
        setCode(value);
        return this;
    }

    @Override
    public ConceptRecord value9(Long value) {
        setUseCount(value);
        return this;
    }

    @Override
    public ConceptRecord values(Integer value1, Integer value2, String value3, Byte value4, String value5, String value6, String value7, String value8, Long value9) {
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
     * Create a detached ConceptRecord
     */
    public ConceptRecord() {
        super(Concept.CONCEPT);
    }

    /**
     * Create a detached, initialised ConceptRecord
     */
    public ConceptRecord(Integer dbid, Integer document, String id, Byte draft, String name, String description, String scheme, String code, Long useCount) {
        super(Concept.CONCEPT);

        set(0, dbid);
        set(1, document);
        set(2, id);
        set(3, draft);
        set(4, name);
        set(5, description);
        set(6, scheme);
        set(7, code);
        set(8, useCount);
    }
}

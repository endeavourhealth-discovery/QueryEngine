/*
 * This file is generated by jOOQ.
 */
package org.endeavour.queryengine.db.tables.records;


import javax.annotation.Generated;

import org.endeavour.queryengine.db.tables.Organization;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
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
public class OrganizationRecord extends UpdatableRecordImpl<OrganizationRecord> implements Record7<Long, String, String, String, String, String, Long> {

    private static final long serialVersionUID = 533173197;

    /**
     * Setter for <code>subscriber_pi.organization.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>subscriber_pi.organization.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>subscriber_pi.organization.ods_code</code>.
     */
    public void setOdsCode(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>subscriber_pi.organization.ods_code</code>.
     */
    public String getOdsCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>subscriber_pi.organization.name</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>subscriber_pi.organization.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>subscriber_pi.organization.type_code</code>.
     */
    public void setTypeCode(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>subscriber_pi.organization.type_code</code>.
     */
    public String getTypeCode() {
        return (String) get(3);
    }

    /**
     * Setter for <code>subscriber_pi.organization.type_desc</code>.
     */
    public void setTypeDesc(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>subscriber_pi.organization.type_desc</code>.
     */
    public String getTypeDesc() {
        return (String) get(4);
    }

    /**
     * Setter for <code>subscriber_pi.organization.postcode</code>.
     */
    public void setPostcode(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>subscriber_pi.organization.postcode</code>.
     */
    public String getPostcode() {
        return (String) get(5);
    }

    /**
     * Setter for <code>subscriber_pi.organization.parent_organization_id</code>.
     */
    public void setParentOrganizationId(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>subscriber_pi.organization.parent_organization_id</code>.
     */
    public Long getParentOrganizationId() {
        return (Long) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<Long, String, String, String, String, String, Long> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<Long, String, String, String, String, String, Long> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Organization.ORGANIZATION.ID;
    }

    @Override
    public Field<String> field2() {
        return Organization.ORGANIZATION.ODS_CODE;
    }

    @Override
    public Field<String> field3() {
        return Organization.ORGANIZATION.NAME;
    }

    @Override
    public Field<String> field4() {
        return Organization.ORGANIZATION.TYPE_CODE;
    }

    @Override
    public Field<String> field5() {
        return Organization.ORGANIZATION.TYPE_DESC;
    }

    @Override
    public Field<String> field6() {
        return Organization.ORGANIZATION.POSTCODE;
    }

    @Override
    public Field<Long> field7() {
        return Organization.ORGANIZATION.PARENT_ORGANIZATION_ID;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getOdsCode();
    }

    @Override
    public String component3() {
        return getName();
    }

    @Override
    public String component4() {
        return getTypeCode();
    }

    @Override
    public String component5() {
        return getTypeDesc();
    }

    @Override
    public String component6() {
        return getPostcode();
    }

    @Override
    public Long component7() {
        return getParentOrganizationId();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getOdsCode();
    }

    @Override
    public String value3() {
        return getName();
    }

    @Override
    public String value4() {
        return getTypeCode();
    }

    @Override
    public String value5() {
        return getTypeDesc();
    }

    @Override
    public String value6() {
        return getPostcode();
    }

    @Override
    public Long value7() {
        return getParentOrganizationId();
    }

    @Override
    public OrganizationRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public OrganizationRecord value2(String value) {
        setOdsCode(value);
        return this;
    }

    @Override
    public OrganizationRecord value3(String value) {
        setName(value);
        return this;
    }

    @Override
    public OrganizationRecord value4(String value) {
        setTypeCode(value);
        return this;
    }

    @Override
    public OrganizationRecord value5(String value) {
        setTypeDesc(value);
        return this;
    }

    @Override
    public OrganizationRecord value6(String value) {
        setPostcode(value);
        return this;
    }

    @Override
    public OrganizationRecord value7(Long value) {
        setParentOrganizationId(value);
        return this;
    }

    @Override
    public OrganizationRecord values(Long value1, String value2, String value3, String value4, String value5, String value6, Long value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached OrganizationRecord
     */
    public OrganizationRecord() {
        super(Organization.ORGANIZATION);
    }

    /**
     * Create a detached, initialised OrganizationRecord
     */
    public OrganizationRecord(Long id, String odsCode, String name, String typeCode, String typeDesc, String postcode, Long parentOrganizationId) {
        super(Organization.ORGANIZATION);

        set(0, id);
        set(1, odsCode);
        set(2, name);
        set(3, typeCode);
        set(4, typeDesc);
        set(5, postcode);
        set(6, parentOrganizationId);
    }
}

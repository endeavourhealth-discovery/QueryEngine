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
import org.endeavour.queryengine.db.tables.records.OrganizationRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row7;
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
public class Organization extends TableImpl<OrganizationRecord> {

    private static final long serialVersionUID = -419170425;

    /**
     * The reference instance of <code>subscriber_pi.organization</code>
     */
    public static final Organization ORGANIZATION = new Organization();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OrganizationRecord> getRecordType() {
        return OrganizationRecord.class;
    }

    /**
     * The column <code>subscriber_pi.organization.id</code>.
     */
    public final TableField<OrganizationRecord, Long> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>subscriber_pi.organization.ods_code</code>.
     */
    public final TableField<OrganizationRecord, String> ODS_CODE = createField(DSL.name("ods_code"), org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>subscriber_pi.organization.name</code>.
     */
    public final TableField<OrganizationRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>subscriber_pi.organization.type_code</code>.
     */
    public final TableField<OrganizationRecord, String> TYPE_CODE = createField(DSL.name("type_code"), org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>subscriber_pi.organization.type_desc</code>.
     */
    public final TableField<OrganizationRecord, String> TYPE_DESC = createField(DSL.name("type_desc"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>subscriber_pi.organization.postcode</code>.
     */
    public final TableField<OrganizationRecord, String> POSTCODE = createField(DSL.name("postcode"), org.jooq.impl.SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>subscriber_pi.organization.parent_organization_id</code>.
     */
    public final TableField<OrganizationRecord, Long> PARENT_ORGANIZATION_ID = createField(DSL.name("parent_organization_id"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>subscriber_pi.organization</code> table reference
     */
    public Organization() {
        this(DSL.name("organization"), null);
    }

    /**
     * Create an aliased <code>subscriber_pi.organization</code> table reference
     */
    public Organization(String alias) {
        this(DSL.name(alias), ORGANIZATION);
    }

    /**
     * Create an aliased <code>subscriber_pi.organization</code> table reference
     */
    public Organization(Name alias) {
        this(alias, ORGANIZATION);
    }

    private Organization(Name alias, Table<OrganizationRecord> aliased) {
        this(alias, aliased, null);
    }

    private Organization(Name alias, Table<OrganizationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Organization(Table<O> child, ForeignKey<O, OrganizationRecord> key) {
        super(child, key, ORGANIZATION);
    }

    @Override
    public Schema getSchema() {
        return SubscriberPi.SUBSCRIBER_PI;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.ORGANIZATION_FKI_ORGANIZATION_PARENT_ORGANIZATION_ID, Indexes.ORGANIZATION_ORGANIZATION_ID, Indexes.ORGANIZATION_PRIMARY);
    }

    @Override
    public UniqueKey<OrganizationRecord> getPrimaryKey() {
        return Keys.KEY_ORGANIZATION_PRIMARY;
    }

    @Override
    public List<UniqueKey<OrganizationRecord>> getKeys() {
        return Arrays.<UniqueKey<OrganizationRecord>>asList(Keys.KEY_ORGANIZATION_PRIMARY, Keys.KEY_ORGANIZATION_ORGANIZATION_ID);
    }

    @Override
    public Organization as(String alias) {
        return new Organization(DSL.name(alias), this);
    }

    @Override
    public Organization as(Name alias) {
        return new Organization(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Organization rename(String name) {
        return new Organization(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Organization rename(Name name) {
        return new Organization(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<Long, String, String, String, String, String, Long> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}

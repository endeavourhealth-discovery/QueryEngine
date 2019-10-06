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
import org.endeavour.queryengine.db.tables.records.ConceptRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row9;
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
public class Concept extends TableImpl<ConceptRecord> {

    private static final long serialVersionUID = -889363868;

    /**
     * The reference instance of <code>subscriber_pi.concept</code>
     */
    public static final Concept CONCEPT = new Concept();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ConceptRecord> getRecordType() {
        return ConceptRecord.class;
    }

    /**
     * The column <code>subscriber_pi.concept.dbid</code>. Unique concept int DB identifier
     */
    public final TableField<ConceptRecord, Integer> DBID = createField(DSL.name("dbid"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "Unique concept int DB identifier");

    /**
     * The column <code>subscriber_pi.concept.document</code>. Document this concept originated from
     */
    public final TableField<ConceptRecord, Integer> DOCUMENT = createField(DSL.name("document"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "Document this concept originated from");

    /**
     * The column <code>subscriber_pi.concept.id</code>. Unique human-readable concept id
     */
    public final TableField<ConceptRecord, String> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.VARCHAR(150).nullable(false), this, "Unique human-readable concept id");

    /**
     * The column <code>subscriber_pi.concept.draft</code>.
     */
    public final TableField<ConceptRecord, Byte> DRAFT = createField(DSL.name("draft"), org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>subscriber_pi.concept.name</code>.
     */
    public final TableField<ConceptRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>subscriber_pi.concept.description</code>.
     */
    public final TableField<ConceptRecord, String> DESCRIPTION = createField(DSL.name("description"), org.jooq.impl.SQLDataType.VARCHAR(400), this, "");

    /**
     * The column <code>subscriber_pi.concept.scheme</code>.
     */
    public final TableField<ConceptRecord, String> SCHEME = createField(DSL.name("scheme"), org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>subscriber_pi.concept.code</code>.
     */
    public final TableField<ConceptRecord, String> CODE = createField(DSL.name("code"), org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>subscriber_pi.concept.use_count</code>.
     */
    public final TableField<ConceptRecord, Long> USE_COUNT = createField(DSL.name("use_count"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>subscriber_pi.concept</code> table reference
     */
    public Concept() {
        this(DSL.name("concept"), null);
    }

    /**
     * Create an aliased <code>subscriber_pi.concept</code> table reference
     */
    public Concept(String alias) {
        this(DSL.name(alias), CONCEPT);
    }

    /**
     * Create an aliased <code>subscriber_pi.concept</code> table reference
     */
    public Concept(Name alias) {
        this(alias, CONCEPT);
    }

    private Concept(Name alias, Table<ConceptRecord> aliased) {
        this(alias, aliased, null);
    }

    private Concept(Name alias, Table<ConceptRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Concept(Table<O> child, ForeignKey<O, ConceptRecord> key) {
        super(child, key, CONCEPT);
    }

    @Override
    public Schema getSchema() {
        return SubscriberPi.SUBSCRIBER_PI;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.CONCEPT_CONCEPT_DRAFT, Indexes.CONCEPT_CONCEPT_ID_UQ, Indexes.CONCEPT_CONCEPT_SCHEME_CODE_IDX, Indexes.CONCEPT_PRIMARY);
    }

    @Override
    public Identity<ConceptRecord, Integer> getIdentity() {
        return Keys.IDENTITY_CONCEPT;
    }

    @Override
    public UniqueKey<ConceptRecord> getPrimaryKey() {
        return Keys.KEY_CONCEPT_PRIMARY;
    }

    @Override
    public List<UniqueKey<ConceptRecord>> getKeys() {
        return Arrays.<UniqueKey<ConceptRecord>>asList(Keys.KEY_CONCEPT_PRIMARY, Keys.KEY_CONCEPT_CONCEPT_ID_UQ, Keys.KEY_CONCEPT_CONCEPT_SCHEME_CODE_IDX);
    }

    @Override
    public Concept as(String alias) {
        return new Concept(DSL.name(alias), this);
    }

    @Override
    public Concept as(Name alias) {
        return new Concept(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Concept rename(String name) {
        return new Concept(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Concept rename(Name name) {
        return new Concept(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<Integer, Integer, String, Byte, String, String, String, String, Long> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}
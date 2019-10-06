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
import org.endeavour.queryengine.db.tables.records.ConceptMapRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row2;
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
public class ConceptMap extends TableImpl<ConceptMapRecord> {

    private static final long serialVersionUID = 379947770;

    /**
     * The reference instance of <code>subscriber_pi.concept_map</code>
     */
    public static final ConceptMap CONCEPT_MAP = new ConceptMap();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ConceptMapRecord> getRecordType() {
        return ConceptMapRecord.class;
    }

    /**
     * The column <code>subscriber_pi.concept_map.legacy</code>. Concept DBID
     */
    public final TableField<ConceptMapRecord, Integer> LEGACY = createField(DSL.name("legacy"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "Concept DBID");

    /**
     * The column <code>subscriber_pi.concept_map.core</code>. Property value concept dbid
     */
    public final TableField<ConceptMapRecord, Integer> CORE = createField(DSL.name("core"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "Property value concept dbid");

    /**
     * Create a <code>subscriber_pi.concept_map</code> table reference
     */
    public ConceptMap() {
        this(DSL.name("concept_map"), null);
    }

    /**
     * Create an aliased <code>subscriber_pi.concept_map</code> table reference
     */
    public ConceptMap(String alias) {
        this(DSL.name(alias), CONCEPT_MAP);
    }

    /**
     * Create an aliased <code>subscriber_pi.concept_map</code> table reference
     */
    public ConceptMap(Name alias) {
        this(alias, CONCEPT_MAP);
    }

    private ConceptMap(Name alias, Table<ConceptMapRecord> aliased) {
        this(alias, aliased, null);
    }

    private ConceptMap(Name alias, Table<ConceptMapRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ConceptMap(Table<O> child, ForeignKey<O, ConceptMapRecord> key) {
        super(child, key, CONCEPT_MAP);
    }

    @Override
    public Schema getSchema() {
        return SubscriberPi.SUBSCRIBER_PI;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.CONCEPT_MAP_IX_CORE, Indexes.CONCEPT_MAP_PRIMARY);
    }

    @Override
    public UniqueKey<ConceptMapRecord> getPrimaryKey() {
        return Keys.KEY_CONCEPT_MAP_PRIMARY;
    }

    @Override
    public List<UniqueKey<ConceptMapRecord>> getKeys() {
        return Arrays.<UniqueKey<ConceptMapRecord>>asList(Keys.KEY_CONCEPT_MAP_PRIMARY);
    }

    @Override
    public ConceptMap as(String alias) {
        return new ConceptMap(DSL.name(alias), this);
    }

    @Override
    public ConceptMap as(Name alias) {
        return new ConceptMap(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ConceptMap rename(String name) {
        return new ConceptMap(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ConceptMap rename(Name name) {
        return new ConceptMap(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, Integer> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}

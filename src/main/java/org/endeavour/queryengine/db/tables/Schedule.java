/*
 * This file is generated by jOOQ.
 */
package org.endeavour.queryengine.db.tables;


import java.sql.Date;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.endeavour.queryengine.db.Indexes;
import org.endeavour.queryengine.db.Keys;
import org.endeavour.queryengine.db.SubscriberPi;
import org.endeavour.queryengine.db.tables.records.ScheduleRecord;
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
public class Schedule extends TableImpl<ScheduleRecord> {

    private static final long serialVersionUID = 1450844474;

    /**
     * The reference instance of <code>subscriber_pi.schedule</code>
     */
    public static final Schedule SCHEDULE = new Schedule();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ScheduleRecord> getRecordType() {
        return ScheduleRecord.class;
    }

    /**
     * The column <code>subscriber_pi.schedule.id</code>.
     */
    public final TableField<ScheduleRecord, Long> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>subscriber_pi.schedule.organization_id</code>.
     */
    public final TableField<ScheduleRecord, Long> ORGANIZATION_ID = createField(DSL.name("organization_id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>subscriber_pi.schedule.practitioner_id</code>.
     */
    public final TableField<ScheduleRecord, Long> PRACTITIONER_ID = createField(DSL.name("practitioner_id"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>subscriber_pi.schedule.start_date</code>.
     */
    public final TableField<ScheduleRecord, Date> START_DATE = createField(DSL.name("start_date"), org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>subscriber_pi.schedule.type</code>.
     */
    public final TableField<ScheduleRecord, String> TYPE = createField(DSL.name("type"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>subscriber_pi.schedule.location</code>.
     */
    public final TableField<ScheduleRecord, String> LOCATION = createField(DSL.name("location"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>subscriber_pi.schedule.name</code>.
     */
    public final TableField<ScheduleRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(150), this, "");

    /**
     * Create a <code>subscriber_pi.schedule</code> table reference
     */
    public Schedule() {
        this(DSL.name("schedule"), null);
    }

    /**
     * Create an aliased <code>subscriber_pi.schedule</code> table reference
     */
    public Schedule(String alias) {
        this(DSL.name(alias), SCHEDULE);
    }

    /**
     * Create an aliased <code>subscriber_pi.schedule</code> table reference
     */
    public Schedule(Name alias) {
        this(alias, SCHEDULE);
    }

    private Schedule(Name alias, Table<ScheduleRecord> aliased) {
        this(alias, aliased, null);
    }

    private Schedule(Name alias, Table<ScheduleRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Schedule(Table<O> child, ForeignKey<O, ScheduleRecord> key) {
        super(child, key, SCHEDULE);
    }

    @Override
    public Schema getSchema() {
        return SubscriberPi.SUBSCRIBER_PI;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.SCHEDULE_PRIMARY, Indexes.SCHEDULE_SCHEDULE_ID);
    }

    @Override
    public UniqueKey<ScheduleRecord> getPrimaryKey() {
        return Keys.KEY_SCHEDULE_PRIMARY;
    }

    @Override
    public List<UniqueKey<ScheduleRecord>> getKeys() {
        return Arrays.<UniqueKey<ScheduleRecord>>asList(Keys.KEY_SCHEDULE_PRIMARY, Keys.KEY_SCHEDULE_SCHEDULE_ID);
    }

    @Override
    public List<ForeignKey<ScheduleRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ScheduleRecord, ?>>asList(Keys.FK_SCHEDULE_ORGANIZATION_ID);
    }

    public Organization organization() {
        return new Organization(this, Keys.FK_SCHEDULE_ORGANIZATION_ID);
    }

    @Override
    public Schedule as(String alias) {
        return new Schedule(DSL.name(alias), this);
    }

    @Override
    public Schedule as(Name alias) {
        return new Schedule(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Schedule rename(String name) {
        return new Schedule(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Schedule rename(Name name) {
        return new Schedule(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<Long, Long, Long, Date, String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}

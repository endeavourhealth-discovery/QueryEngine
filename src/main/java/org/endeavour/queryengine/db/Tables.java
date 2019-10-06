/*
 * This file is generated by jOOQ.
 */
package org.endeavour.queryengine.db;


import javax.annotation.Generated;

import org.endeavour.queryengine.db.tables.AllergyIntolerance;
import org.endeavour.queryengine.db.tables.Appointment;
import org.endeavour.queryengine.db.tables.Concept;
import org.endeavour.queryengine.db.tables.ConceptMap;
import org.endeavour.queryengine.db.tables.DiagnosticOrder;
import org.endeavour.queryengine.db.tables.Encounter;
import org.endeavour.queryengine.db.tables.EpisodeOfCare;
import org.endeavour.queryengine.db.tables.EventLog;
import org.endeavour.queryengine.db.tables.Flag;
import org.endeavour.queryengine.db.tables.Location;
import org.endeavour.queryengine.db.tables.MedicationOrder;
import org.endeavour.queryengine.db.tables.MedicationStatement;
import org.endeavour.queryengine.db.tables.Observation;
import org.endeavour.queryengine.db.tables.Organization;
import org.endeavour.queryengine.db.tables.Patient;
import org.endeavour.queryengine.db.tables.PatientAddress;
import org.endeavour.queryengine.db.tables.PatientContact;
import org.endeavour.queryengine.db.tables.PatientUprn;
import org.endeavour.queryengine.db.tables.Person;
import org.endeavour.queryengine.db.tables.Practitioner;
import org.endeavour.queryengine.db.tables.ProcedureRequest;
import org.endeavour.queryengine.db.tables.PseudoId;
import org.endeavour.queryengine.db.tables.ReferralRequest;
import org.endeavour.queryengine.db.tables.Schedule;
import org.endeavour.queryengine.db.tables.TableCounts;


/**
 * Convenience access to all tables in subscriber_pi
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>subscriber_pi.allergy_intolerance</code>.
     */
    public static final AllergyIntolerance ALLERGY_INTOLERANCE = AllergyIntolerance.ALLERGY_INTOLERANCE;

    /**
     * The table <code>subscriber_pi.appointment</code>.
     */
    public static final Appointment APPOINTMENT = Appointment.APPOINTMENT;

    /**
     * The table <code>subscriber_pi.concept</code>.
     */
    public static final Concept CONCEPT = Concept.CONCEPT;

    /**
     * The table <code>subscriber_pi.concept_map</code>.
     */
    public static final ConceptMap CONCEPT_MAP = ConceptMap.CONCEPT_MAP;

    /**
     * The table <code>subscriber_pi.diagnostic_order</code>.
     */
    public static final DiagnosticOrder DIAGNOSTIC_ORDER = DiagnosticOrder.DIAGNOSTIC_ORDER;

    /**
     * The table <code>subscriber_pi.encounter</code>.
     */
    public static final Encounter ENCOUNTER = Encounter.ENCOUNTER;

    /**
     * The table <code>subscriber_pi.episode_of_care</code>.
     */
    public static final EpisodeOfCare EPISODE_OF_CARE = EpisodeOfCare.EPISODE_OF_CARE;

    /**
     * The table <code>subscriber_pi.event_log</code>.
     */
    public static final EventLog EVENT_LOG = EventLog.EVENT_LOG;

    /**
     * The table <code>subscriber_pi.flag</code>.
     */
    public static final Flag FLAG = Flag.FLAG;

    /**
     * The table <code>subscriber_pi.location</code>.
     */
    public static final Location LOCATION = Location.LOCATION;

    /**
     * The table <code>subscriber_pi.medication_order</code>.
     */
    public static final MedicationOrder MEDICATION_ORDER = MedicationOrder.MEDICATION_ORDER;

    /**
     * The table <code>subscriber_pi.medication_statement</code>.
     */
    public static final MedicationStatement MEDICATION_STATEMENT = MedicationStatement.MEDICATION_STATEMENT;

    /**
     * The table <code>subscriber_pi.observation</code>.
     */
    public static final Observation OBSERVATION = Observation.OBSERVATION;

    /**
     * The table <code>subscriber_pi.organization</code>.
     */
    public static final Organization ORGANIZATION = Organization.ORGANIZATION;

    /**
     * The table <code>subscriber_pi.patient</code>.
     */
    public static final Patient PATIENT = Patient.PATIENT;

    /**
     * stores address details for patients
     */
    public static final PatientAddress PATIENT_ADDRESS = PatientAddress.PATIENT_ADDRESS;

    /**
     * stores contact details (e.g. phone) for patients
     */
    public static final PatientContact PATIENT_CONTACT = PatientContact.PATIENT_CONTACT;

    /**
     * The table <code>subscriber_pi.patient_uprn</code>.
     */
    public static final PatientUprn PATIENT_UPRN = PatientUprn.PATIENT_UPRN;

    /**
     * The table <code>subscriber_pi.person</code>.
     */
    public static final Person PERSON = Person.PERSON;

    /**
     * The table <code>subscriber_pi.practitioner</code>.
     */
    public static final Practitioner PRACTITIONER = Practitioner.PRACTITIONER;

    /**
     * The table <code>subscriber_pi.procedure_request</code>.
     */
    public static final ProcedureRequest PROCEDURE_REQUEST = ProcedureRequest.PROCEDURE_REQUEST;

    /**
     * The table <code>subscriber_pi.pseudo_id</code>.
     */
    public static final PseudoId PSEUDO_ID = PseudoId.PSEUDO_ID;

    /**
     * The table <code>subscriber_pi.referral_request</code>.
     */
    public static final ReferralRequest REFERRAL_REQUEST = ReferralRequest.REFERRAL_REQUEST;

    /**
     * The table <code>subscriber_pi.schedule</code>.
     */
    public static final Schedule SCHEDULE = Schedule.SCHEDULE;

    /**
     * The table <code>subscriber_pi.table_counts</code>.
     */
    public static final TableCounts TABLE_COUNTS = TableCounts.TABLE_COUNTS;
}
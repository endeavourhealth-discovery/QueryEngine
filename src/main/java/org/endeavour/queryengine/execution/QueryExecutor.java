package org.endeavour.queryengine.execution;

import com.sun.corba.se.impl.orbutil.RepositoryIdStrings;
import lombok.extern.slf4j.Slf4j;
import org.endeavour.queryengine.db.*;
import static org.endeavour.queryengine.db.tables.Observation.OBSERVATION;
import static org.endeavour.queryengine.db.tables.Patient.PATIENT;

import org.endeavour.queryengine.im.ModelDocument;
import org.endeavour.queryengine.repository.Repository;
import org.jooq.*;
import org.jooq.impl.DSL;

import java.sql.SQLException;

@Slf4j
public class QueryExecutor implements AutoCloseable {

    private final QueryEngine queryEngine;
    private Repository repository;
    private ModelDocument modelDocument;

    public QueryExecutor(ModelDocument modelDocument, Repository repository) {
        super();
        this.modelDocument = modelDocument;
        this.repository = repository;
        this.queryEngine = new JooqQueryEngine();
    }

    public void execute() throws SQLException {

        queryEngine.prepare(modelDocument);

        QueryExecutionPlan queryExecutionPlan = queryEngine.getQueryExecutionPlan();

        queryExecutionPlan.log();

        repository.execute( queryExecutionPlan );
    }

    @Override
    public void close() throws Exception {
        repository.close();
    }
}

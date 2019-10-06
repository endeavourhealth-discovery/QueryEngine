package org.endeavour.queryengine.repository;


import org.endeavour.queryengine.execution.QueryExecutionPlan;

import java.sql.SQLException;

public interface Repository extends AutoCloseable {

    void execute(QueryExecutionPlan queryExecutionPlan) throws SQLException;
}


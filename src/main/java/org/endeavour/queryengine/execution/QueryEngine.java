package org.endeavour.queryengine.execution;

import org.endeavour.queryengine.im.ModelDocument;

interface QueryEngine {

    void prepare(ModelDocument modelDocument);

    QueryExecutionPlan getQueryExecutionPlan();
}

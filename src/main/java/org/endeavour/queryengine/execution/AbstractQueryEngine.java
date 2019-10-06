package org.endeavour.queryengine.execution;

import lombok.Getter;

public abstract class AbstractQueryEngine implements QueryEngine {

    @Getter
    private QueryExecutionPlan queryExecutionPlan = new QueryExecutionPlan();

    protected void addExecutionStepToPlan(ExecutionStep executionStep) {
        this.queryExecutionPlan.add(executionStep);
    }
}

package org.endeavour.queryengine.execution;

import org.endeavour.queryengine.execution.builder.SQLBuilder;

public abstract class SqlQueryEngine extends AbstractQueryEngine {

//    protected SQLBuilder sqlBuilder;

    protected void addSqlToExecutionPlan(SQLBuilder sqlBuilder) {

        ExecutionStep executionStep = new ExecutionStep();
        executionStep.setSql( sqlBuilder.getSql() );
        executionStep.setBindValues( sqlBuilder.getBindValues() );
        executionStep.setParams( sqlBuilder.getParams() );

        super.addExecutionStepToPlan( executionStep );
    }


}

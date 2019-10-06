package org.endeavour.queryengine.execution;

import lombok.extern.slf4j.Slf4j;
import org.endeavour.queryengine.execution.builder.SQLBuilder;
import org.endeavour.queryengine.im.*;

@Slf4j
public class JooqQueryEngine extends SqlQueryEngine {


    @Override
    public void prepare(ModelDocument modelDocument) {

        SQLBuilder sqlBuilder = new SQLBuilder( modelDocument );

        sqlBuilder.log();

        addJooqToExecutionPlan( sqlBuilder );
    }

    protected void addJooqToExecutionPlan(SQLBuilder sqlBuilder) {

        ExecutionStep executionStep = new ExecutionStep();
        executionStep.setSelect( sqlBuilder.getSelect() );

        super.addExecutionStepToPlan( executionStep );
    }

}

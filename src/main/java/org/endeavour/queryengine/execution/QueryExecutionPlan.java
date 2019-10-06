package org.endeavour.queryengine.execution;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Slf4j
public class QueryExecutionPlan {

    private List<ExecutionStep> executionStepList = new ArrayList<>();

    public void add(ExecutionStep executionStep) {
        this.executionStepList.add(executionStep);
    }

    public List<ExecutionStep> getExecutionStepList() {
        return Collections.unmodifiableList( executionStepList );
    }

    public void log() {

        Integer counter = 0;

        for(ExecutionStep executionStep : executionStepList) {
            log.info("Step {} : {}", counter++, executionStep);
        }

    }
}

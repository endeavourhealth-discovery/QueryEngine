package org.endeavour.queryengine.execution;

import lombok.Data;
import lombok.Getter;
import org.jooq.Param;
import org.jooq.Select;

import java.util.List;
import java.util.Map;

@Data
public class ExecutionStep {

    private String sql;

    private String storedProcedureName;

    private List<Object> bindValues;

    private Map<String, Param<?>> params;

    private Select<?> select;

    public ExecutionStepType getType() {
        if(sql != null || select != null) return ExecutionStepType.SQL;

//        if(storedProcedureName != null) return ExecutionStepType.STORED_PROC;

        throw new UnsupportedOperationException("Only ExecutionStepType.SQL supported at present");
    }

}

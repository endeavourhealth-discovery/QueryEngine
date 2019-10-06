package org.endeavour.queryengine.repository;

import com.mysql.cj.jdbc.MysqlDataSource;
import lombok.extern.slf4j.Slf4j;
import org.endeavour.queryengine.execution.ExecutionStep;
import org.endeavour.queryengine.execution.ExecutionStepType;
import org.endeavour.queryengine.execution.QueryExecutionPlan;
import org.jooq.*;
import org.jooq.impl.DSL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Map;
import java.util.Properties;

@Slf4j
public class JOOQRepository implements Repository {

    private DSLContext create;

//    private Connection connection;

    public JOOQRepository(Properties properties) throws SQLException {
        init(properties);
    }

    @Override
    public void execute(QueryExecutionPlan queryExecutionPlan) throws SQLException {

        for (ExecutionStep executionStep : queryExecutionPlan.getExecutionStepList()) {

            log.info("Executing {}", executionStep);

            if (!executionStep.getType().equals(ExecutionStepType.SQL)) {
                log.info("Skipping because not of ExecutionStepType.SQL type");
                continue;
            }

            Select<?> select = executionStep.getSelect();

            create.attach(select);

            Result<?> fetch = select.fetch();

            select.close();
        }
    }

    private void init(Properties props) throws SQLException {
        MysqlDataSource dataSource = new MysqlDataSource();

        dataSource.setURL(props.getProperty("url"));
        dataSource.setUser(props.getProperty("user"));
        dataSource.setPassword(props.getProperty("password"));
        dataSource.setReadOnlyPropagatesToServer(true);

        Connection connection = dataSource.getConnection();
        connection.setReadOnly( true );

        create = DSL.using(connection, SQLDialect.MYSQL);
    }

    public void close() throws SQLException {
//        connection.close();
        create.close();;
    }
}


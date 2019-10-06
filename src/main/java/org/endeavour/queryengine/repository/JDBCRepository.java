package org.endeavour.queryengine.repository;

import com.mysql.cj.jdbc.MysqlDataSource;
import lombok.extern.slf4j.Slf4j;
import org.endeavour.queryengine.execution.ExecutionStep;
import org.endeavour.queryengine.execution.ExecutionStepType;
import org.endeavour.queryengine.execution.QueryExecutionPlan;
import org.jooq.Param;

import java.sql.*;
import java.util.Map;
import java.util.Properties;

@Slf4j
public class JDBCRepository implements Repository {


    private MysqlDataSource dataSource;

    private Connection connection;

    public JDBCRepository(Properties properties) throws SQLException {
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

            PreparedStatement preparedStatement = connection.prepareStatement( executionStep.getSql() );


            Map<String, Param<?>> params = executionStep.getParams();

            params.forEach( (k, v) -> {
                try {
                    preparedStatement.setObject(Integer.parseInt(k), v.getValue(), v.getDataType().getSQLType());
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            });


//            for(int i = 0; i < bindValues.size(); i++) {
//                log.info("i {}",  i );
//                select.bind(i + 1, bindValues.get(i));
//                log.info("Bind {}", bind.getSQL());
//            }

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                log.info("Resultset {}", rs);
            }


            preparedStatement.close();
        }

    }

    private void init(Properties props) throws SQLException {

        dataSource = new MysqlDataSource();

        dataSource.setURL(props.getProperty("url"));
        dataSource.setUser(props.getProperty("user"));
        dataSource.setPassword(props.getProperty("password"));

        dataSource.setReadOnlyPropagatesToServer(true);

        connection = dataSource.getConnection();

        connection.setReadOnly(true);
    }

    public void close() throws SQLException {
        connection.close();
    }
}


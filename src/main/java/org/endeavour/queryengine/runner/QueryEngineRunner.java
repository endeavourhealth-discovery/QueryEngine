package org.endeavour.queryengine.runner;

import lombok.extern.slf4j.Slf4j;
import org.endeavour.queryengine.execution.QueryExecutor;
import org.endeavour.queryengine.im.ModelDocument;
import org.endeavour.queryengine.repository.JDBCRepository;
import org.endeavour.queryengine.repository.JOOQRepository;
import org.endeavour.queryengine.repository.Repository;
import org.endeavour.queryengine.util.IMMapper;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.Properties;

@Slf4j
public class QueryEngineRunner {

    public static void main(String[] args) throws IOException, SQLException {

        Properties properties = loadProperties(args);

        ModelDocument modelDocument = getModelDocument(properties);

        Repository repository = new JDBCRepository(properties);
        Repository jooqRepository = new JOOQRepository(properties);

        try (QueryExecutor queryExecutor = new QueryExecutor(modelDocument, jooqRepository)) {

            queryExecutor.execute();

        } catch (Exception e) {
            log.error("Error has occurred during query execution", e);
        }

    }

    private static ModelDocument getModelDocument(Properties properties) throws IOException {
        IMMapper imMapper = IMMapper.builder().build();

        String jsonFilename = properties.getProperty("jsonFilename");

        log.info("Loading from file {}", jsonFilename);

        ModelDocument modelDocument = imMapper.parseFile(jsonFilename);

        log.info(modelDocument.toString());

        return modelDocument;
    }

    private static Properties loadProperties(String[] args) throws IOException {

        Properties properties = new Properties();

        InputStream inputStream = QueryEngineRunner.class.getClassLoader().getResourceAsStream("query-engine.properties");

        properties.load(inputStream);

        return properties;
    }
}

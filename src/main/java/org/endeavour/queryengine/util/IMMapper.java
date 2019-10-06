package org.endeavour.queryengine.util;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Builder;
import org.endeavour.queryengine.im.ModelDocument;

import java.io.IOException;
import java.io.InputStream;

@Builder
public class IMMapper {

    public ModelDocument parseFile(String filename) throws IOException {

        InputStream inputStream = IMMapper.class.getClassLoader().getResourceAsStream(filename);

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.UNWRAP_ROOT_VALUE, true);

        ModelDocument modelDocument = objectMapper.readValue( inputStream, ModelDocument.class );

        return modelDocument;
    }
}

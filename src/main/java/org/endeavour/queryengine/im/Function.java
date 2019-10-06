
package org.endeavour.queryengine.im;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@Data
public class Function {

    private String name;

    private String baseFunction;

    private List<Parameter> parameter = null;
}

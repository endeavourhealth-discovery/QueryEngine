
package org.endeavour.queryengine.im;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "baseFunction",
    "parameter"
})
public class ValueFunction_ {

    @JsonProperty("baseFunction")
    private String baseFunction;
    @JsonProperty("parameter")
    private List<Parameter__> parameter = null;

    @JsonProperty("baseFunction")
    public String getBaseFunction() {
        return baseFunction;
    }

    @JsonProperty("baseFunction")
    public void setBaseFunction(String baseFunction) {
        this.baseFunction = baseFunction;
    }

    @JsonProperty("parameter")
    public List<Parameter__> getParameter() {
        return parameter;
    }

    @JsonProperty("parameter")
    public void setParameter(List<Parameter__> parameter) {
        this.parameter = parameter;
    }

}

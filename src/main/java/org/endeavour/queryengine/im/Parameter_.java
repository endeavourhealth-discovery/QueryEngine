
package org.endeavour.queryengine.im;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "parameterToken",
    "variable",
    "valueNumeric"
})
public class Parameter_ {

    @JsonProperty("parameterToken")
    private String parameterToken;
    @JsonProperty("variable")
    private String variable;
    @JsonProperty("valueNumeric")
    private Integer valueNumeric;

    @JsonProperty("parameterToken")
    public String getParameterToken() {
        return parameterToken;
    }

    @JsonProperty("parameterToken")
    public void setParameterToken(String parameterToken) {
        this.parameterToken = parameterToken;
    }

    @JsonProperty("variable")
    public String getVariable() {
        return variable;
    }

    @JsonProperty("variable")
    public void setVariable(String variable) {
        this.variable = variable;
    }

    @JsonProperty("valueNumeric")
    public Integer getValueNumeric() {
        return valueNumeric;
    }

    @JsonProperty("valueNumeric")
    public void setValueNumeric(Integer valueNumeric) {
        this.valueNumeric = valueNumeric;
    }

}

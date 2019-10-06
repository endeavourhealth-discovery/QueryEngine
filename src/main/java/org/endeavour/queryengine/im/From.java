
package org.endeavour.queryengine.im;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "operator",
    "valueFunction"
})
public class From {

    @JsonProperty("operator")
    private String operator;
    @JsonProperty("valueFunction")
    private ValueFunction valueFunction;

    @JsonProperty("operator")
    public String getOperator() {
        return operator;
    }

    @JsonProperty("operator")
    public void setOperator(String operator) {
        this.operator = operator;
    }

    @JsonProperty("valueFunction")
    public ValueFunction getValueFunction() {
        return valueFunction;
    }

    @JsonProperty("valueFunction")
    public void setValueFunction(ValueFunction valueFunction) {
        this.valueFunction = valueFunction;
    }

}

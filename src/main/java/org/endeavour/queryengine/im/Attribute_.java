
package org.endeavour.queryengine.im;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "property",
    "valueRange",
    "assignedProperty"
})
public class Attribute_ {

    @JsonProperty("property")
    private String property;
    @JsonProperty("valueRange")
    private ValueRange valueRange;
    @JsonProperty("assignedProperty")
    private String assignedProperty;

    @JsonProperty("property")
    public String getProperty() {
        return property;
    }

    @JsonProperty("property")
    public void setProperty(String property) {
        this.property = property;
    }

    @JsonProperty("valueRange")
    public ValueRange getValueRange() {
        return valueRange;
    }

    @JsonProperty("valueRange")
    public void setValueRange(ValueRange valueRange) {
        this.valueRange = valueRange;
    }

    @JsonProperty("assignedProperty")
    public String getAssignedProperty() {
        return assignedProperty;
    }

    @JsonProperty("assignedProperty")
    public void setAssignedProperty(String assignedProperty) {
        this.assignedProperty = assignedProperty;
    }

}

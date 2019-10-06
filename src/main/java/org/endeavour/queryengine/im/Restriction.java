
package org.endeavour.queryengine.im;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "property",
    "order",
    "count"
})
public class Restriction {

    @JsonProperty("property")
    private String property;
    @JsonProperty("order")
    private String order;
    @JsonProperty("count")
    private Integer count;

    @JsonProperty("property")
    public String getProperty() {
        return property;
    }

    @JsonProperty("property")
    public void setProperty(String property) {
        this.property = property;
    }

    @JsonProperty("order")
    public String getOrder() {
        return order;
    }

    @JsonProperty("order")
    public void setOrder(String order) {
        this.order = order;
    }

    @JsonProperty("count")
    public Integer getCount() {
        return count;
    }

    @JsonProperty("count")
    public void setCount(Integer count) {
        this.count = count;
    }

}

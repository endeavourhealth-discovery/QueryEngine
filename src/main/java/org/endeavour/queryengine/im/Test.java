
package org.endeavour.queryengine.im;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "attribute"
})
public class Test {

    @JsonProperty("attribute")
    private Attribute_ attribute;

    @JsonProperty("attribute")
    public Attribute_ getAttribute() {
        return attribute;
    }

    @JsonProperty("attribute")
    public void setAttribute(Attribute_ attribute) {
        this.attribute = attribute;
    }

}

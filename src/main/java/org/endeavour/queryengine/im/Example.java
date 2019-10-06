
package org.endeavour.queryengine.im;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ModelDocument"
})
public class Example {

    @JsonProperty("ModelDocument")
    private ModelDocument modelDocument;

    @JsonProperty("ModelDocument")
    public ModelDocument getModelDocument() {
        return modelDocument;
    }

    @JsonProperty("ModelDocument")
    public void setModelDocument(ModelDocument modelDocument) {
        this.modelDocument = modelDocument;
    }

}

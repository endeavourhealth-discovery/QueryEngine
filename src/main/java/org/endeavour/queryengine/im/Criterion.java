
package org.endeavour.queryengine.im;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@Data
public class Criterion {

    private String description;

    private String operator;

    @JsonProperty("class")
    private String clazz;

    private Filter filter;

    private Restriction restriction;

    private Test test;
}

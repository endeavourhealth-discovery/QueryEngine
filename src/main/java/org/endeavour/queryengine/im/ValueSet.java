
package org.endeavour.queryengine.im;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;
import lombok.ToString;

@Data
public class ValueSet {

    private String id;

    private String name;

    private List<Expression> expression = null;
}

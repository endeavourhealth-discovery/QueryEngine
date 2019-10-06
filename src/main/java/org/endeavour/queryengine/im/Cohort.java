
package org.endeavour.queryengine.im;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@Data
public class Cohort {

    private String id;

    private String name;

    private String authoredDate;

    private String authoredBy;

    private String dataSubject;

    private List<Criterion> criterion;

    private String baseCohort;
}

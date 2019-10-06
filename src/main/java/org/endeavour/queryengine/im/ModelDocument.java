
package org.endeavour.queryengine.im;

import java.util.List;
import lombok.Data;

@Data
public class ModelDocument {

    private DocumentInfo documentInfo;

    private List<Cohort> cohort;

    private List<ValueSet> valueSet ;
}

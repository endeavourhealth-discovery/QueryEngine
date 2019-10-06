
package org.endeavour.queryengine.im;

import java.util.List;
import lombok.Data;


@Data
public class DocumentInfo {

    private String documentId;

    private String documentIri;

    private String modelIri;

    private String effectiveDate;

    private String publisher;

    private String purpose;

    private String baseModelVersion;

    private String documentStatus;

    private List<Prefix> prefix;
}

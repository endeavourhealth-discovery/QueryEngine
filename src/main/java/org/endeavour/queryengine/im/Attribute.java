
package org.endeavour.queryengine.im;

import lombok.Data;

@Data
public class Attribute {

    private Function function;

    private Value value;

    private String operator;

    private String property;

    private String valueCode;

    private String valueSet;

    private String assignedProperty;
}

package org.endeavour.queryengine.execution.bean;

import lombok.Data;

import java.util.Date;

@Data
public class DateRange {

    private Date from;

    private Date to;
}

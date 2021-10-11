package com.ist012m.evee.Core.Job;

import java.util.*;

public class JobRequest {
    public String id;
    public Date startJobTime;
    public String description;

    public JobRequest() {
    }

    public JobRequest(final String id, final Date startJobTime, final String description) {
        this.id = id;
        this.startJobTime = startJobTime;
        this.description = description;
    }
}

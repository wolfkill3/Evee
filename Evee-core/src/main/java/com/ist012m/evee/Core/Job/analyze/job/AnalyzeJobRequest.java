package com.ist012m.evee.Core.Job.analyze.job;

import java.util.*;

import com.ist012m.evee.Core.Job.JobRequest;

public class AnalyzeJobRequest extends JobRequest {
    public byte[] photo;

    public AnalyzeJobRequest() {
        photo = new byte[0];
    }

    public AnalyzeJobRequest(final byte[] photo) {
        this.photo = photo;
    }

    public AnalyzeJobRequest(final String id, final Date startJobTime, final String description, final byte[] photo) {
        super(id, startJobTime, description);
        this.photo = photo;
    }
}

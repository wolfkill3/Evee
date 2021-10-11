package com.ist012m.evee.Core.Job.support;

import java.util.*;

import com.ist012m.evee.Core.Job.Job;

public class TestJob extends Job {
    public TestJob(final String id, final Date startJobTime, final String description) {
        super(id, startJobTime, description);
    }

    @Override
    protected synchronized String run() throws Exception {
        return null;
    }
}

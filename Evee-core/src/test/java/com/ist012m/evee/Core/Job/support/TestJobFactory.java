package com.ist012m.evee.Core.Job.support;

import java.util.*;

import com.ist012m.evee.Core.Factories.AbstractJobFactory;
import com.ist012m.evee.Core.Job.Job;
import com.ist012m.evee.Core.Job.JobRequest;

public final class TestJobFactory extends AbstractJobFactory {
    private static TestJobFactory testJobFactory;

    @Override
    public Job create(JobRequest request) {
        String id = UUID.randomUUID().toString();
        return new TestJob(id, request.startJobTime, request.description);
    }

    public static TestJobFactory getInstance() {
        if (testJobFactory == null) {
            testJobFactory = new TestJobFactory();
        }
        return testJobFactory;
    }
}

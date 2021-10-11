package com.ist012m.evee.Core.Factories;

import com.ist012m.evee.Core.Job.Job;
import com.ist012m.evee.Core.Job.JobRequest;

public abstract class AbstractJobFactory {
    public abstract Job create(JobRequest request);
}

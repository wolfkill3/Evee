package com.ist012m.evee.Core.Job;

import java.util.*;

import com.ist012m.evee.Core.Factories.AbstractJobFactory;
import com.ist012m.evee.Core.Factories.AnalyzeJobFactory;
import com.ist012m.evee.Core.Job.analyze.job.AnalyzeJobRequest;
import com.ist012m.evee.Core.Job.support.TestJob;
import com.ist012m.evee.Core.Job.support.TestJobFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class JobManagerTest {
    private static final AbstractJobFactory FACTORY = TestJobFactory.getInstance();
    private static final JobManager MANAGER = new JobManager();

    @BeforeAll
    public static void init() {
        MANAGER.submit(FACTORY.create(new JobRequest()));
    }

    @Test
    public void createJobTest() {
        String jobId = MANAGER.submit(FACTORY.create(new JobRequest()));
        Job job = MANAGER.getClosedJobs().get(0);
        System.out.println(jobId);
        Assertions.assertFalse(job.isCanceled());
        Assertions.assertNotEquals("", job.getId());
    }

    @Test
    public void getAllJobs() {
        MANAGER.submit(FACTORY.create(new JobRequest()));
        List<Job> jobs = MANAGER.getClosedJobs();
        jobs.forEach(System.out::println);
        Assertions.assertTrue(jobs.size() > 1);
    }
}
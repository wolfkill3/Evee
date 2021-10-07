package com.ist012m.evee.Core.Job;

import java.util.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class JobManagerTest {
    private static final TrainJobFactory MONITOR = TrainJobFactory.getInstance();
    private static final JobManager MANAGER = new JobManager();

    @BeforeAll
    public static void init() {
        MANAGER.submit(MONITOR);
    }

    @Test
    void createJobTest() {
        String jobId = MANAGER.submit(MONITOR);
        Job job = MANAGER.getActiveJobById(jobId);
        System.out.println(jobId);
        Assertions.assertFalse(job.isCanceled());
        Assertions.assertNotEquals(job.getId(), "");
    }

    @Test
    void getAllJobs() {
        MANAGER.submit(MONITOR);
        List<Job> activeJobs = MANAGER.getActiveJobs();
        activeJobs.forEach(System.out::println);
        Assertions.assertTrue(activeJobs.size() > 1);
    }

    @Test
    void deleteJobTest() {
        String jobId = MANAGER.submit(MONITOR);
        Job job = MANAGER.getActiveJobById(jobId);
        System.out.println("----------Before delete------------");
        MANAGER.getActiveJobs().forEach(activeJob -> System.out.println(activeJob.getId()));
        MANAGER.cancel(job);
        List<Job> activeJobs = MANAGER.getActiveJobs();
        System.out.println("----------After delete------------");
        System.out.println(job.getId());
        Assertions.assertEquals(1, activeJobs.size());
        Assertions.assertEquals(1, MANAGER.getClosedJobs().size());
    }
}
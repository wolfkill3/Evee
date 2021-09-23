package com.ist012m.evee.Core.Job;

import java.util.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.ist012m.evee.Core.Job.Job;
import com.ist012m.evee.Core.Job.JobMonitor;

class JobMonitorTest {
    private static final JobMonitor MONITOR = JobMonitor.getInstance();

    @BeforeAll
    public static void init() {
        MONITOR.create(null);
    }

    @Test
    void createJobTest() {
        Job job = MONITOR.create(null);
        System.out.println(job.getId());
        Assertions.assertTrue(job.isActive());
        Assertions.assertNotEquals(job.getId(), "");
    }

    @Test
    void getAllJobs() {
        MONITOR.create(null);
        List<String> activeJobs = MONITOR.getActiveJobs();
        activeJobs.forEach(System.out::println);
        Assertions.assertTrue(activeJobs.size() > 1);
    }

    @Test
    void deleteJobTest() {
        Job job = MONITOR.create(null);
        MONITOR.getActiveJobs().forEach(System.out::println);
        MONITOR.delete(job);
        List<String> activeJobs = MONITOR.getActiveJobs();
        System.out.println("----------After delete------------");
        System.out.println(job.getId());
        Assertions.assertEquals(1, activeJobs.size());
    }
}
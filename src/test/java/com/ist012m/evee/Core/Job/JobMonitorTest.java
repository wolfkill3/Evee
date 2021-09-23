package com.ist012m.evee.Core.Job;

import java.util.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

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
}
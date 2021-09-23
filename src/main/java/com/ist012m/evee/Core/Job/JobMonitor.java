package com.ist012m.evee.Core.Job;

import java.util.*;
import java.util.function.Supplier;

import com.fasterxml.jackson.databind.ObjectMapper;

public final class JobMonitor extends AbstractJobFactory {
    private static final ObjectMapper MAPPER = new ObjectMapper();
    private static final List<String> ACTIVE_JOBS = new ArrayList<>();
    private static JobMonitor jobMonitor;
    private static Supplier<Job> jobs = Job::new;

    @Override
    public Job create(final Object response) {
        jobs = () -> {
            String id = UUID.randomUUID().toString();
            ACTIVE_JOBS.add(id);
            return new Job(id, true, new Date());
        };
        return jobs.get();
    }

    public static JobMonitor getInstance() {
        if (jobMonitor == null) {
            jobMonitor = new JobMonitor();
        }
        return jobMonitor;
    }

    public String getJobId() {
        return jobs.get().getId();
    }

    public List<String> getActiveJobs() {
        return ACTIVE_JOBS;
    }

    // try {
    //     String jsonResponse = MAPPER.writeValueAsString(response);
    //     return MAPPER.readValue(jsonResponse, Job.class);
    // } catch (JsonProcessingException e) {
    //     throw new RuntimeException("Exception while creating job");
    // }
}

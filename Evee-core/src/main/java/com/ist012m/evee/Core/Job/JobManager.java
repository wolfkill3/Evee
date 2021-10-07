package com.ist012m.evee.Core.Job;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class JobManager {
    private static final Map<String, Job> ACTIVE_JOBS = new ConcurrentHashMap<>(25);
    private static final Map<String, Job> CLOSED_JOBS = new HashMap<>();

    public String submit(AbstractJobFactory factory) {
        Job job = factory.create();
        ACTIVE_JOBS.put(job.getId(), job);
        return job.getId();
    }

    public boolean cancel(Job job) {
        ACTIVE_JOBS.remove(job.getId());
        CLOSED_JOBS.put(job.getId(), job);
        return true;
    }

    public List<Job> getActiveJobs() {
        return new ArrayList<>(ACTIVE_JOBS.values());
    }

    public List<Job> getClosedJobs() {
        return new ArrayList<>(CLOSED_JOBS.values());
    }

    public Job getActiveJobById(String id) {
        return ACTIVE_JOBS.get(id);
    }

    public Job getClosedJobById(String id) {
        return CLOSED_JOBS.get(id);
    }
}

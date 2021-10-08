package com.ist012m.evee.Core.Job;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.stereotype.Component;

@Component
public class JobManager {
    private static final Map<String, Job> ACTIVE_JOBS = new ConcurrentHashMap<>(25);
    private static final List<Job> CLOSED_JOBS = new CopyOnWriteArrayList<>();

    public String submit(Job job) {
        String jobId = job.getId();
        try {
            ACTIVE_JOBS.put(jobId, job);
            job.run();
            updateStatistic(job, jobId);
            return job.getId();
        } catch (Exception e) {
            updateStatistic(job, jobId);
            throw new RuntimeException(e);
        }
    }

    private void updateStatistic(final Job job, final String jobId) {
        ACTIVE_JOBS.remove(jobId);
        CLOSED_JOBS.add(job);
        if (CLOSED_JOBS.size() > 25) {
            CLOSED_JOBS.remove(0);
        }
    }

    public List<Job> getActiveJobs() {
        return new ArrayList<>(ACTIVE_JOBS.values());
    }

    public List<Job> getClosedJobs() {
        return new ArrayList<>(CLOSED_JOBS);
    }

    public Job getActiveJobById(String id) {
        return ACTIVE_JOBS.get(id);
    }

    // public Job getClosedJobById(String id) {
    //     return CLOSED_JOBS.get(id);
    // }
}

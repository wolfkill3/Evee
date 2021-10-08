package com.ist012m.evee.Core.Job;

import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class Job {
    private final AtomicBoolean isCanceled;
    private final String id;
    private final Date startJobTime;
    private final String description;
    protected Date endJobTime;
    protected String jobResult;
    protected JobStatus status;

    public Job(final String id, final Date startJobTime, final String description) {
        this.id = id;
        this.startJobTime = startJobTime;
        this.description = description;
        isCanceled = new AtomicBoolean(false);
    }

    public boolean isCanceled() {
        return isCanceled.get();
    }

    public Date getStartJobTime() {
        return startJobTime;
    }

    public Date getEndJobTime() {
        return endJobTime;
    }

    protected JobStatus getStatus() {
        return status;
    }

    protected String getJobResult() {
        return jobResult;
    }

    protected abstract String run() throws Exception;

    protected boolean cancel() {
        endJobTime = new Date();
        isCanceled.set(true);
        return true;
    }

    public String getId() {
        return id;
    }
}

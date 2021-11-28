package com.ist012m.evee.Core.Job;

import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class Job {
    private final AtomicBoolean isCanceled;
    private final String id;
    private final Date startJobTime;
    private Date endJobTime;

    public Job(final String id, final Date startJobTime) {
        this.id = id;
        this.startJobTime = startJobTime;
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

    protected abstract String run();

    public boolean cancel() {
        endJobTime = new Date();
        isCanceled.set(true);
        return true;
    }

    public String getId() {
        return id;
    }
}

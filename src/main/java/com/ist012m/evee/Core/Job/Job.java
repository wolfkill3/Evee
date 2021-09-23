package com.ist012m.evee.Core.Job;

import java.util.*;
import java.util.function.Supplier;

public class Job implements Supplier<Job> {
    private String id;
    private boolean isActive;
    public Date startJobTime;

    public Job() {
    }

    public Job(final String id, final boolean isActive, final Date startJobTime) {
        this.id = id;
        this.isActive = isActive;
        this.startJobTime = startJobTime;
    }

    public String getId() {
        return id;
    }

    public boolean isActive() {
        return isActive;
    }

    public void stop() {
        this.isActive = false;
    }

    @Override
    public Job get() {
        return this;
    }
}

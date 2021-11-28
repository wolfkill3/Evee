package com.ist012m.evee.Core.Job;

import java.util.*;

import com.ist012m.evee.Core.Job.analyze.job.AnalyzeJob;

public final class AnalizeJobFactory extends AbstractJobFactory {
    private static AnalizeJobFactory analizeJobFactory;

    @Override
    public Job create() {
        String id = UUID.randomUUID().toString();
        return new AnalyzeJob(id, new Date());
    }

    public static AnalizeJobFactory getInstance() {
        if (analizeJobFactory == null) {
            analizeJobFactory = new AnalizeJobFactory();
        }
        return analizeJobFactory;
    }
}

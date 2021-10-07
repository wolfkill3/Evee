package com.ist012m.evee.Core.Job;

import java.util.*;

import com.ist012m.evee.Core.Job.analyze.job.AnalyzeJob;

public final class TrainJobFactory extends AbstractJobFactory {
    private static TrainJobFactory trainJobFactory;

    @Override
    public Job create() {
        String id = UUID.randomUUID().toString();
        return new AnalyzeJob(id, new Date());
    }

    public static TrainJobFactory getInstance() {
        if (trainJobFactory == null) {
            trainJobFactory = new TrainJobFactory();
        }
        return trainJobFactory;
    }
}

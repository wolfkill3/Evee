package com.ist012m.evee.Core.Factories;

import java.util.*;

import com.ist012m.evee.Core.Job.Job;
import com.ist012m.evee.Core.Job.JobRequest;
import com.ist012m.evee.Core.Job.analyze.job.AnalyzeJob;
import com.ist012m.evee.Core.Job.analyze.job.AnalyzeJobRequest;

public final class AnalyzeJobFactory extends AbstractJobFactory {
    private static AnalyzeJobFactory analyzeJobFactory;

    @Override
    public Job create(JobRequest request) {
        AnalyzeJobRequest analyzeJobRequest = (AnalyzeJobRequest) request;
        String id = UUID.randomUUID().toString();
        return new AnalyzeJob(id, analyzeJobRequest);
    }

    public static AnalyzeJobFactory getInstance() {
        if (analyzeJobFactory == null) {
            analyzeJobFactory = new AnalyzeJobFactory();
        }
        return analyzeJobFactory;
    }
}

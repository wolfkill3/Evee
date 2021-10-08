package com.ist012m.evee.Core.Controller;

import com.ist012m.evee.Core.Factories.AnalyzeJobFactory;
import com.ist012m.evee.Core.Job.Job;
import com.ist012m.evee.Core.Job.JobManager;
import com.ist012m.evee.Core.Job.analyze.job.AnalyzeJobRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/")
public class JobController {
    private final AnalyzeJobFactory analyzeJobFactory = AnalyzeJobFactory.getInstance();
    @Autowired
    private JobManager manager;

    @PostMapping("/startAnalyze")
    public String startTrain(AnalyzeJobRequest request) {
        Job job = analyzeJobFactory.create(request);
        manager.submit(job);
        return job.getId();
    }
}

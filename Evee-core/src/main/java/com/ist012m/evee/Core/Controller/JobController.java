package com.ist012m.evee.Core.Controller;

import com.ist012m.evee.Core.Job.Job;
import com.ist012m.evee.Core.Job.JobManager;
import com.ist012m.evee.Core.Job.JobRequest;
import com.ist012m.evee.Core.Job.AnalizeJobFactory;
import com.ist012m.evee.Core.Job.analyze.job.AnalyzeJob;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/")
public class JobController {
    private final AnalizeJobFactory analizeJobFactory = AnalizeJobFactory.getInstance();
    @Autowired
    private final JobManager jobManager;

    public JobController(final JobManager jobManager) {this.jobManager = jobManager;}

    @PostMapping("/startTrain")
    public void startTrain(JobRequest request) {
        String job = jobManager.submit(analizeJobFactory);
    }
}

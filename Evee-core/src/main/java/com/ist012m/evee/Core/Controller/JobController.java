package com.ist012m.evee.Core.Controller;

import com.ist012m.evee.Core.Job.JobRequest;
import com.ist012m.evee.Core.Job.TrainJobFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/")
public class JobController {
    private final TrainJobFactory trainJobFactory = TrainJobFactory.getInstance();
    @PostMapping("/startTrain")
    public void startTrain(JobRequest request) {

    }
}

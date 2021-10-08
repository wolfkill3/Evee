package com.ist012m.evee.Core.Job.analyze.job;

import java.io.*;
import java.net.*;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ist012m.evee.Core.Job.Job;
import com.ist012m.evee.Core.Job.JobStatus;

public class AnalyzeJob extends Job {
    private static final String URI = "http://localhost:8082/startAnalyze";
    private static final ObjectMapper MAPPER = new ObjectMapper();
    private final byte[] photo;

    public AnalyzeJob(String id, final AnalyzeJobRequest request) {
        super(id, request.startJobTime, request.description);
        this.photo = request.photo;
        status = JobStatus.PENDING;
    }

    @Override
    public String run() {
        status = JobStatus.RUNNING;
        try {
            HttpResponse<String> response = getAnalyzeResult();
            jobResult = response.body();
            status = JobStatus.COMPLETED;
            return "OK";
        } catch (URISyntaxException | IOException | InterruptedException e) {
            status = JobStatus.FAILED;
            throw new RuntimeException(e);
        }
    }

    private HttpResponse<String> getAnalyzeResult() throws URISyntaxException, IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                                         .uri(new URI(URI))
                                         .headers("Content-Type", "text/plain;charset=UTF-8")
                                         .POST(HttpRequest.BodyPublishers.ofByteArray(photo))
                                         .build();
        return client.send(request, HttpResponse.BodyHandlers.ofString());
    }
}

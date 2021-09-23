package com.ist012m.evee.Core.Connectors;

import java.io.*;
import java.net.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ist012m.evee.Core.Job.Job;

public class NeuralNetworkConnector {
    private static final ObjectMapper MAPPER = new ObjectMapper();
    private ServerSocket serverSocket;
    private Socket clientSocket;
    private PrintWriter writer;
    private BufferedReader reader;

    public void start(int port) {
        try {
            serverSocket = new ServerSocket(port);
            clientSocket = serverSocket.accept();
            writer = new PrintWriter(clientSocket.getOutputStream(), true);
            reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            try {
                String jsonResponse = MAPPER.writeValueAsString(reader.read());
                MAPPER.readValue(jsonResponse, Job.class);
            } catch (JsonProcessingException e) {
                throw new RuntimeException("Exception while creating job");
            }
        } catch (IOException e) {
            throw new RuntimeException("Exception while start connection.\n" + e);
        }
    }

    public void stop() throws IOException {
        reader.close();
        writer.close();
        clientSocket.close();
        serverSocket.close();
    }
}

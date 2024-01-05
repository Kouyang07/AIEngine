package dev.kouyang.OpenAI.GPT;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;

import static dev.kouyang.Config.API_KEY;

@Data
public class GPT {

    public Response chat(String prompt, Model model){
        Messages[] messages = new Messages[1];
        messages[0] = new Messages("user", prompt);
        Request requestBody = new Request(messages, model.getModelName(), 100, 1);
        return httpConnection(requestBody);
    }

    public Response chat(Request requestBody){
        return httpConnection(requestBody);
    }


    private Response httpConnection(Request requestBody) {
        long startTime = System.nanoTime();
        ObjectMapper mapper = new ObjectMapper();
        HttpClient client = HttpClient.newHttpClient();
        String requestJson = "";
        try{
            requestJson = mapper.writeValueAsString(requestBody);
        }catch (IOException e){
            e.printStackTrace();
        }
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(dev.kouyang.Config.OpenAIEndPoint))
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + API_KEY)
                .POST(HttpRequest.BodyPublishers.ofString(requestJson))
                .build();
        String responseBody = "";
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            int statusCode = response.statusCode();
            responseBody = response.body();
            if (statusCode == 200) {
                Response responseObject = mapper.readValue(responseBody, Response.class);
                responseObject.setTime(System.nanoTime() - startTime);
                return responseObject;
            } else {
                System.out.println(responseBody);
                return null;
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }
}

package dev.kouyang.OpenAI.GPT;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Request {
    @JsonProperty("messages")
    private Messages[] message;
    @JsonProperty("model")
    private String model;
    @JsonProperty("max_tokens")
    private int max_tokens;
    @JsonProperty("n")
    private int n;

public Request(Messages[] message, String model, int max_tokens, int n) {
        this.message = message;
        this.model = model;
        this.max_tokens = max_tokens;
        this.n = n;
    }

}

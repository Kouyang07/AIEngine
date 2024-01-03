package dev.kouyang.OpenAI.GPT;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
//  "id": "chatcmpl-8bN5fZ3HvHvzMpwFJjphg3qZFMbEh",
//  "object": "chat.completion",
//  "created": 1703917587,
//  "model": "gpt-3.5-turbo-0613",
//  "choices": [
//    {
//      "index": 0,
//      "message": {
//        "role": "assistant",
//        "content": "Hello Kouyang! How can I assist you today?"
//      },
//      "logprobs": null,
//      "finish_reason": "stop"
//    }
//  ],
//  "usage": {
//    "prompt_tokens": 14,
//    "completion_tokens": 11,
//    "total_tokens": 25
//  },
//  "system_fingerprint": null
//}
@Data
public class Response {
   @JsonProperty("id")
    private String id;
    @JsonProperty("object")
    private String object;
    @JsonProperty("created")
    private String created;
    @JsonProperty("model")
    private String model;
    @JsonProperty("choices")
    private Choices[] choices;
    @JsonProperty("usage")
    private Usage usage;
    @JsonProperty("system_fingerprint")
    private String system_fingerprint;
    private double time;

    public String getResponse(){
        return this.choices[choices.length-1].getMessage().getContent();
    }

    public double getTimeSeconds(){
        return this.time/1_000_000_000;
    }
}


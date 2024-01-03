package dev.kouyang.OpenAI.GPT;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Choices {
    //"choices": [
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
    @JsonProperty("index")
    private int index;
    @JsonProperty("message")
    private Messages message;
    @JsonProperty("logprobs")
    private String logprobs;
    @JsonProperty("finish_reason")
    private String finish_reason;
}

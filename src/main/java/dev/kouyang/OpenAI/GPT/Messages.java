package dev.kouyang.OpenAI.GPT;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data
public class Messages {
    @JsonProperty("role")
    private String role;
    @JsonProperty("content")
    private String content;

    public Messages(String user, String prompt) {
        this.role = user;
        this.content = prompt;
    }
    public Messages() {
    }
}

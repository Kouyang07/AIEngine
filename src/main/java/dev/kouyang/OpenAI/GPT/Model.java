package dev.kouyang.OpenAI.GPT;

import lombok.Getter;

@Getter
public enum Model {
    GPT_3_5_TURBO("gpt-3.5-turbo"),
    GPT_4("gpt-4");

    private final String modelName;

    Model(String modelName) {
        this.modelName = modelName;
    }
}

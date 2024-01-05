package dev.kouyang.OpenAI.GPT;

import lombok.Getter;

@Getter
public enum Model {
    GPT_3_5_TURBO("gpt-3.5-turbo"),
    GPT_4("gpt-4-1106-preview"),
    GPT_4_VISION("gpt-4-vision-preview");

    private final String modelName;

    Model(String modelName) {
        this.modelName = modelName;
    }
}

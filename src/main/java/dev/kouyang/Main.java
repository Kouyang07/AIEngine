package dev.kouyang;

import dev.kouyang.OpenAI.GPT.GPT;
import dev.kouyang.OpenAI.GPT.Model;

public class Main {
    public static void main(String[] args) {
        GPT gpt = new GPT("");
        System.out.println(gpt.chat("What is the price of a raspberry pi 5?", Model.GPT_4).getResponse());
    }
}
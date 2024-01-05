package dev.kouyang;

import dev.kouyang.OpenAI.GPT.GPT;
import dev.kouyang.OpenAI.GPT.Model;

public class Main {
    public static void main(String[] args) {
        GPT gpt = new GPT();
        String prompt = "Fabric Blend: Cotton with unique weaving technique\n" +
                "Weight: A perfect 290GSM for an ideal weight-to-comfort ratio.\n" +
                "Fit: True to size with a relaxed fit. Size up for an oversized fit.\n" +
                "Design: Premium multiple layers of screen print design for durability and sohpistication.\n" +
                "Tags: Printed tag for itch-free wear.\n" +
                "Wrinkle Resistant: Durable and wrinkle-resistant for a polished look every time. \n" +
                "final\n Question: What is the fabric?s";
        System.out.println(gpt.chat("You have 2 functions.\n" +
                "CMD: run a command in for the window command prompt\n" +
                "SAY: outputs text\n" +
                "\n" +
                "To run a command, it has to follow the format Command(Value). For example, to output the text \"Hello World\", you have to return \n" +
                "SAY(Hello World)\n" +
                "\n" +
                "Based on the following provided information, use the functions appropriately to help the user." +
                "\n"
                + prompt, Model.GPT_4).getResponse());
    }
}
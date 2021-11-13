package com.brideglabz.analyser;

public class MoodAnalyzer {
    private String message;

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyseMood() {
        try {
        if (message.contains("Sad"))
            return "SAD";
        else {
            return "HAPPY";
        }
        } catch (NullPointerException nullPointerException) {
            return "HAPPY";
        }
    }
}
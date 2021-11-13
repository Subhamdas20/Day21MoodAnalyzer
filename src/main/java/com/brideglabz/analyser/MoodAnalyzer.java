package com.brideglabz.analyser;

public class MoodAnalyzer {
    private String message;

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyseMood() throws MoodAnalysisException{
        try{
            if (message.length() < 1){
                throw new MoodAnalysisException("Message can not be Empty.");
            }
            if (message.contains("Sad")){
                return "SAD";
            }
            else {
                return "HAPPY";
            }
        } catch (NullPointerException nullPointerException){
            throw new MoodAnalysisException("Message can not be Null.");
        }
    }


}
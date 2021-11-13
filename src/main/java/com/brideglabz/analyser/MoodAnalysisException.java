package com.brideglabz.analyser;

public class MoodAnalysisException extends Exception{
    public String message;
    public MoodAnalysisException(String message) {
        if (message.contains("Null")){
            this.message = ExceptionType.NULL_MESSAGE + ": " + message;
        }
        else {
            this.message = ExceptionType.EMPTY_MESSAGE + ": " + message;
        }
    }
    @Override
    public String getMessage() {
        return message;
    }
}

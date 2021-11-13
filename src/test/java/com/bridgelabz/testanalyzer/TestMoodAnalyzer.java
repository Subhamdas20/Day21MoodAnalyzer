package com.bridgelabz.testanalyzer;

import com.brideglabz.analyser.MoodAnalyzer;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TestMoodAnalyzer {
    @Test
    public void whenGivenAMessageShouldAnalyzeAndRespondSad(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am In a Sad Mood");
        String mood = moodAnalyzer.analyseMood();
        Assert.assertEquals("SAD", mood);
    }
    @org.junit.Test
    public void whenGivenAMessageShouldAnalyzeAndRespondHappy(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am In a Any Mood");
        String mood = moodAnalyzer.analyseMood();
        Assert.assertEquals("HAPPY", mood);
    }
    @Test
    public void whenGivenAMessageShouldAnalyzeAndRespondHAPPY(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am In a Happy Mood");
        String mood = moodAnalyzer.analyseMood();
        Assert.assertEquals("HAPPY", mood);
    }
}

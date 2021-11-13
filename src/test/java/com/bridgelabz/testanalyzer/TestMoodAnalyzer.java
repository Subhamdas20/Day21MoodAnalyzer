package com.bridgelabz.testanalyzer;

import com.brideglabz.analyser.MoodAnalysisException;
import com.brideglabz.analyser.MoodAnalyzer;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TestMoodAnalyzer {
    @Test
    public void whenGivenAMessageShouldAnalyzeAndRespondSad() throws Exception{
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am In a Sad Mood");
        String mood = moodAnalyzer.analyseMood();
        Assert.assertEquals("SAD", mood);
    }
    @org.junit.Test
    public void whenGivenAMessageShouldAnalyzeAndRespondHappy() throws Exception{
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am In a Any Mood");
        String mood = moodAnalyzer.analyseMood();
        Assert.assertEquals("HAPPY", mood);
    }
    @Test
    public void whenGivenAMessageShouldAnalyzeAndRespondHAPPY() throws Exception{
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am In a Happy Mood");
        String mood = moodAnalyzer.analyseMood();
        Assert.assertEquals("HAPPY", mood);
    }


    @Test
    public void givenNullMoodShouldThrowException() {
        try {
            MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
            moodAnalyzer.analyseMood();
        } catch (MoodAnalysisException moodAnalysisException) {
            Assert.assertEquals("NULL_MESSAGE: Message can not be Null.",moodAnalysisException.getMessage());
        }
    }
    @Test
    public void givenMessageEmpty_shouldThrow_MoodAnalyserException(){
        try {
            MoodAnalyzer moodAnalyser = new MoodAnalyzer("");
            moodAnalyser.analyseMood();
        } catch (MoodAnalysisException moodAnalysisException) {
            Assert.assertEquals("EMPTY_MESSAGE: Message can not be Empty.",moodAnalysisException.getMessage());
        }
    }

}

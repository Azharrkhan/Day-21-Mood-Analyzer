package com.bl.moodanalyzer;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.bl.moodanalyzer.MoodAnalyzingException.ExceptionType;

public class TestMoodAnalyzer {
	
	@Test
	public void givenMessage_whenSad_shouldReturnSad() throws MoodAnalyzingException {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("This is a sad message");
		String mood = moodAnalyzer.analyzeMood();
		assertEquals("SAD", mood);
	}
	
	@Test
	public void givenMessage_whenNotSad_shouldReturnHappy() throws MoodAnalyzingException {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("This is a happy message");
		String mood = moodAnalyzer.analyzeMood();
		assertEquals("HAPPY", mood);
	}
	
	@Test
	public void givenMessage_whenNull_shouldThrowException() throws MoodAnalyzingException {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
		String mood;
		try {
			mood = moodAnalyzer.analyzeMood();
		} catch (MoodAnalyzingException e) {
			assertEquals(MoodAnalyzingException.ExceptionType.ENTERED_NULL, e.type);
		}
	}
	
	@Test
	public void givenMessage_whenEmpty_shouldThrowException() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer(" ");
		String mood = null;
		try {
			mood = moodAnalyzer.analyzeMood();
		} catch (MoodAnalyzingException e) {
			assertEquals(MoodAnalyzingException.ExceptionType.ENTERED_EMPTY, e.type);
		}	
	}
}


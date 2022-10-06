package com.bl.moodanalyzer;

public class MoodAnalyzingException extends Exception{
	ExceptionType type;
	
	enum ExceptionType{
		ENTERED_NULL, ENTERED_EMPTY
	}

	public MoodAnalyzingException() {

	}

	public MoodAnalyzingException(ExceptionType type, String message) {
		super(message);
		this.type = type;
	}
}

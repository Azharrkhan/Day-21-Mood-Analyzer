package com.bl.moodanalyzer;

import com.bl.moodanalyzer.MoodAnalyzingException.ExceptionType;

	public class MoodAnalyzer {	
		private String message;
		
		public MoodAnalyzer() {
		}

		public MoodAnalyzer(String message) {
			this.message = message;
		}

		public String analyzeMood() throws MoodAnalyzingException {
			try {
				if(message.length() == 0) {
					throw new MoodAnalyzingException(ExceptionType.ENTERED_EMPTY, "You entered an Invalid input!\\nPlease enter a non-empty input for mood.");
				}
					
				if(message.contains("sad"))
					return "SAD";
				else
					return "HAPPY";
			} catch (NullPointerException e) {
				throw new MoodAnalyzingException(ExceptionType.ENTERED_NULL, "You entered an Invalid input!\\nPlease enter a non-NULL input for mood.");
			}
		}	
}


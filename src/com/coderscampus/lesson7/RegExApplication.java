package com.coderscampus.lesson7;

public class RegExApplication {

	public static void main(String[] args) {
		// "valid" email address: fake.email@gmail.com
		// invalid email address: trevorcraftycodr.com
		// invalid email address: trevor@craftycodr.thisisntarealdomain
		// valid email address: trevor@craftycodr.com
		// valid email address: trevor-page.2@gmail.com
		// valid email address: Trevor@CrafyCodr.com
		
		// valid
		inputMatchesRegExPattern("fake.email@gmail.com");
		// invalid (missing an @ symbol)
		inputMatchesRegExPattern("trevorcraftycodr.com");
		// invalid (doamin extension is too long)
		inputMatchesRegExPattern("trevor@craftycodr.thisisntarealdomain");
		// valid
		inputMatchesRegExPattern("trevor@craftycodr.com");
		// valid
		inputMatchesRegExPattern("trevor-page.2@gmail.com");
		// valid
		inputMatchesRegExPattern("Trevor@CrafyCodr.com");

	}

	private static void inputMatchesRegExPattern(String input) {
		boolean matchFound = input.matches("^[a-zA-Z0-9][a-zA-Z0-9-]{0,}\\.?[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z]{1,5}$");
		System.out.println("For Input " + input + ", match found = " + matchFound);
	}

}

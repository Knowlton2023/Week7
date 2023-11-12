package com.coderscampus.lesson5;

import java.util.Arrays;

public class SortingApplication {

	public static void main(String[] args) {
		String[] names = new String[4];

		names[0] = "Josh Allen";
		names[1] = "Trevor Page";
		names[2] = "Elon Musk";
		names[3] = "Jordan Bellfast";
		System.out.println("Pre-sorting");
		for (String name : names) {
			System.out.println(name);
		}
		System.out.println("----");
		Arrays.sort(names);
		System.out.println("Post-sorting");
		for (String name : names) {
			System.out.println(name);
		}

		
	}

}

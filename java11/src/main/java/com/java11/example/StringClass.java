package com.java11.example;

/**
 * @author Kashif Rehman
 * Java 11 adds a few new methods to the String class: isBlank, lines, strip, stripLeading, stripTrailing, and repeat.
 */

import java.util.List;
import java.util.stream.Collectors;

public class StringClass {

	public static void main(String[] args) {
		String multilineString = "Kashif helps \n \n developers \n explore Java.";
		System.out.println(multilineString);
		List<String> lines = multilineString.lines()
		  .filter(line -> !line.isBlank())
		  .map(String::strip)
		  .collect(Collectors.toList());
		System.out.println(lines);
		System.out.println(multilineString);
	}
	
}

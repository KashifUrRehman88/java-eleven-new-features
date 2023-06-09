package com.java11.example;

/**
 * @author Kashif Rehman
 * A static not method has been added to the Predicate interface. 
 * We can use it to negate an existing predicate, much like the negate method.
 */

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class NotPredicateMethod {

	public static void main(String[] args) {
		List<String> sampleList = Arrays.asList("Java", "\n \n", "Kotlin", " ");
		List withoutBlanks = sampleList.stream()
		  .filter(Predicate.not(String::isBlank))
		  .collect(Collectors.toList());
		System.out.println(withoutBlanks);

	}

}

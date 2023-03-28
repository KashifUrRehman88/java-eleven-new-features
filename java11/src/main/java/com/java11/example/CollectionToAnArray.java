package com.java11.example;

/**
 * @author Kashif Rehman
 * The java.util.Collection interface contains a new default toArray method which takes an IntFunction argument.
 * This makes it easier to create an array of the right type from a collection.
 */

import java.util.Arrays;
import java.util.List;

public class CollectionToAnArray {

	public static void main(String[] args) {
		List sampleList = Arrays.asList("Java", "Kotlin");
		String[] sampleArray = (String[]) sampleList.toArray(String[]::new);
	}

}

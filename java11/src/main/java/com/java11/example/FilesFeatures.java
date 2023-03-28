package com.java11.example;

/**
 * @author Kashif Rehman
 * New File Methods : - t's now easier to read and write Strings from files.
 * We can use the new readString and writeString static methods from the Files class:
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesFeatures {

	public static void main(String[] args) {
		String directory = "D:\\eclpise\\learning\\java11\\src\\main\\resources\\pathToFile\\";
		Path tempDir = Paths.get(directory);
		Path filePath;
		String fileContent = null;
		try {
			filePath = Files.writeString(Files.createTempFile(tempDir, "demo", ".txt"), "Sample text");
			fileContent = Files.readString(filePath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(fileContent);
	}

}

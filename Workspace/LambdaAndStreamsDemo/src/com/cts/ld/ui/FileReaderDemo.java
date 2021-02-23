package com.cts.ld.ui;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class FileReaderDemo {

	public static void main(String[] args) {
	
		final String FILE_NAME="./test.txt";
		
		try(BufferedReader fin = new BufferedReader(new FileReader(FILE_NAME))){
			
			fin.lines().forEach(System.out::println);
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} 
	}

}

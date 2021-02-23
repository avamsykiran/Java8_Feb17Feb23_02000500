package com.cts.ld.ui;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class FileWriterDemo {

	public static void main(String[] args) {
	
		final String FILE_NAME="./test.txt";
		
		try(FileWriter fout = new FileWriter(FILE_NAME);){
			
			fout.write("This si a test message being printed @ " +LocalDate.now());

			System.out.println("data written");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} 
	}

}

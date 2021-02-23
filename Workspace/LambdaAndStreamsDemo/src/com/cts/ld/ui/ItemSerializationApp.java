package com.cts.ld.ui;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import com.cts.ld.model.Item;

public class ItemSerializationApp {

	public static void main(String[] args) {

		List<Item> items = new ArrayList<Item>(); 
		
		items.add(new Item(101, "A4 Sheets Box", 1024.0, true, LocalDate.now()));
		items.add(new Item(103, "A5 Sheets Box", 2024.0, true, LocalDate.now().plusDays(3)));
		items.add(new Item(105, "A3 Sheets Box", 1324.0, true, LocalDate.now().plusDays(2)));
		items.add(new Item(102, "B/W Ink Catridge", 4024.0, true, LocalDate.now().plusDays(30)));
		items.add(new Item(109, "Stapplers Box", 102.0, false, LocalDate.now().plusDays(13)));
		items.add(new Item(111, "Sticky Notes", 124.0, false, LocalDate.now().plusDays(16)));
		items.add(new Item(101, "A4 Sheets Box", 1024.0, true, LocalDate.now()));
	
		
		final String FILE_NAME = "./items.dat";
		try(ObjectOutputStream fout = new ObjectOutputStream(new FileOutputStream(FILE_NAME))){
			
			fout.writeObject(items);
			
			System.out.println("Data Writen");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

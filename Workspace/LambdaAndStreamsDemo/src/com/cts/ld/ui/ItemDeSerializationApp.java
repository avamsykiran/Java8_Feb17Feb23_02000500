package com.cts.ld.ui;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

import com.cts.ld.model.Item;

public class ItemDeSerializationApp {

	public static void main(String[] args) {
			
		final String FILE_NAME = "./items.dat";
		try(ObjectInputStream fin = new ObjectInputStream(new FileInputStream(FILE_NAME))){
			
			List<Item> items = (List<Item>)fin.readObject();
			
			items.stream().forEach(System.out::println);
			
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

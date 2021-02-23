package com.cts.jd.ui;

import com.cts.jd.dao.ItemRepo;
import com.cts.jd.dao.ItemRepoImpl;
import com.cts.jd.exception.DatabaseException;

public class InventoryApp {

	public static void main(String[] args) {
		
		ItemRepo repo = new ItemRepoImpl();
		
		try {
			repo.getAll().stream().forEach(System.out::println);
		} catch (DatabaseException e) {
			System.out.println(e.getMessage());
		}

	}

}

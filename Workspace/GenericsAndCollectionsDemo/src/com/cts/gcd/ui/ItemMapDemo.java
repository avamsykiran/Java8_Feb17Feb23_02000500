package com.cts.gcd.ui;

import java.time.LocalDate;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import com.cts.gcd.model.Category;
import com.cts.gcd.model.Item;

public class ItemMapDemo {

	public static void main(String[] args) {

		Map<Category, Set<Item>> items = new TreeMap<Category, Set<Item>>();
		
		Category papers = new Category(101, "PAPERS");
		Category inks = new Category(102, "INKS");
		Category others = new Category(103, "OTHERS");
		
		items.put(papers,new TreeSet<Item>());
		items.get(papers).add(new Item(101, "A4 Sheets Box", 1024.0, true, LocalDate.now()));
		items.get(papers).add(new Item(103, "A5 Sheets Box", 2024.0, true, LocalDate.now().plusDays(3)));
		items.get(papers).add(new Item(105, "A3 Sheets Box", 1324.0, true, LocalDate.now().plusDays(2)));
		
		items.put(inks,new TreeSet<>());
		items.get(inks).add(new Item(102, "B/W Ink Catridge", 4024.0, true, LocalDate.now().plusDays(30)));
		
		items.put(others,new TreeSet<>());
		items.get(others).add(new Item(109, "Stapplers Box", 102.0, false, LocalDate.now().plusDays(13)));
		items.get(others).add(new Item(111, "Sticky Notes", 124.0, false, LocalDate.now().plusDays(16)));
				
		for(Category c : items.keySet()) {
			System.out.println(c);
			System.out.println(items.get(c));
		}
	}
}

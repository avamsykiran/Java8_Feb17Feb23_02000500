package com.cts.ld.ui;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import com.cts.ld.model.Item;

public class ItemStreamApp {

	public static void main(String[] args) {

		List<Item> items = new ArrayList<Item>(); 
		
		items.add(new Item(101, "A4 Sheets Box", 1024.0, true, LocalDate.now()));
		items.add(new Item(103, "A5 Sheets Box", 2024.0, true, LocalDate.now().plusDays(3)));
		items.add(new Item(105, "A3 Sheets Box", 1324.0, true, LocalDate.now().plusDays(2)));
		items.add(new Item(102, "B/W Ink Catridge", 4024.0, true, LocalDate.now().plusDays(30)));
		items.add(new Item(109, "Stapplers Box", 102.0, false, LocalDate.now().plusDays(13)));
		items.add(new Item(111, "Sticky Notes", 124.0, false, LocalDate.now().plusDays(16)));
		items.add(new Item(101, "A4 Sheets Box", 1024.0, true, LocalDate.now()));
			
		items.stream().forEach(System.out::println);
		System.out.println("------------------------------------------");
		Optional<Item> item = items.stream().reduce((i1,i2)->i1.getPrice()>i2.getPrice()?i1:i2);
		System.out.println(item.get());
		System.out.println("------------------------------------------");
		List<String> names=items.stream().map(i->i.getName()).collect(Collectors.toList());
		System.out.println(names);
		System.out.println("------------------------------------------");
		Set<Item> fragileItemsOnly = items.stream().filter(i->i.isFragile()).collect(Collectors.toSet());
		System.out.println(fragileItemsOnly);
		System.out.println("------------------------------------------");
		Set<Item> nonFragileItemsOnly = items.stream().filter(i->!i.isFragile()).collect(Collectors.toSet());
		System.out.println(nonFragileItemsOnly);
		
	}

}

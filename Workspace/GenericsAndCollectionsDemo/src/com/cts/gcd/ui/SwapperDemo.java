package com.cts.gcd.ui;

import java.time.LocalDate;

import com.cts.gcd.model.Item;
import com.cts.gcd.service.Swapper;

public class SwapperDemo {

	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = "Hai";		
		Swapper<String> strSwaper =  new Swapper<String>();
		strSwaper.swap(s1, s2);
				
		Item i1 = new Item(101, "A4 Sheets", 5976, true, LocalDate.now());
		Item i2 = new Item(102, "A5 Sheets", 3976, true, LocalDate.now());
		Swapper<Item> itemSwaper =  new Swapper<>();
		itemSwaper.swap(i1, i2);
		
		int a=90,b=89;
		Swapper<Integer> intSwaper =  new Swapper<>();
		intSwaper.swap(a, b);
		
	}
}

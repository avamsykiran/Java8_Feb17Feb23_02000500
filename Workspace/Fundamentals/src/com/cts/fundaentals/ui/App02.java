package com.cts.fundaentals.ui;

import com.cts.fundaentals.model.Item;

public class App02 {

	public static void main(String[] args) {

		Item item1 = new Item();
		item1.setItemCode(101);
		item1.setItemName("Samsung Note 20 Mobile");
		item1.setPrice(72000.0);
		item1.setFragile(true);
		
		Item item2 = new Item(102,"Samsung Note 10 Mobile",68000.0,true);
		
		Item item3 = item2; //both refers to the same object.
		
		Item item4 = new Item(item1);
		
		
	}

}

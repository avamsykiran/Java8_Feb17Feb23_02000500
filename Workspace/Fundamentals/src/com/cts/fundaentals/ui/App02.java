package com.cts.fundaentals.ui;

import com.cts.fundaentals.model.Item;

public class App02 {

	public static void main(String[] args) {
		Item item1 = new Item();
		item1.setItemCode(101);
		item1.setItemName("Samsung Note 20 Mobile");
		item1.setPrice(72000.0);
		item1.setFragile(true);
		
		Item item2 = new Item();
		item2.setItemCode(102);
		item2.setItemName("Samsung Note 10 Mobile");
		item2.setPrice(68000.0);
		item2.setFragile(true);
		
		System.out.println(Item.totalPrice(item1, item2));
	}

}

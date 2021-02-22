package com.cts.ld.ui;

import java.time.LocalDate;

import com.cts.ld.model.Item;
import com.cts.ld.service.BiggestItem;
import com.cts.ld.service.MathTask;

import java.util.function.BinaryOperator;

public class LambdaDemoApp {

	public static void main(String[] args) {
		
		MathTask summer = (n1,n2) -> n1+n2;
		MathTask differencer = (n1,n2) -> n1-n2;
		MathTask producter = (n1,n2) -> n1*n2;
		
		System.out.println(summer.doTask(10,20));
		System.out.println(differencer.doTask(10,20));
		System.out.println(producter.doTask(10,20));
		
		Item item1 =new Item(102, "B/W Ink Catridge", 4024.0, true, LocalDate.now().plusDays(30));
		Item item2 =new Item(109, "Stapplers Box", 102.0, false, LocalDate.now().plusDays(13));
	
		printTheBiggest(item1, item2, (i1,i2)->i1.getIcode()>i2.getIcode()?i1:i2);
		printTheBiggest(item1, item2, (i1,i2)->i1.getPrice()>i2.getPrice()?i1:i2);
		
		printTheSmallest(item1, item2, (i1,i2)->i1.getIcode()<i2.getIcode()?i1:i2);
		printTheSmallest(item1, item2, (i1,i2)->i1.getPrice()<i2.getPrice()?i1:i2);
	}

	static void printTheBiggest(Item i1, Item i2, BiggestItem findBiggest) {
		Item biggest = findBiggest.getBiggest(i1, i2);
		System.out.println(biggest);
	}
	
	static void printTheSmallest(Item i1, Item i2, BinaryOperator<Item> findSmallest) {
		Item smallest = findSmallest.apply(i1, i2);
		System.out.println(smallest);
	}

}

package com.cts.fundaentals.model;

public class Item {
	
	static double SALES_TAX = 0.10;

	private int itemCode;
	private String itemName;
	private double price;
	private boolean isFragile;
	
	public Item() {
		System.out.println("an item created");
	}
			
	public Item(int itemCode, String itemName, double price, boolean isFragile) {	
		this();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.price = price;
		this.isFragile = isFragile;
	}
	
	public Item(Item item) {
		this(item.itemCode, item.itemName,item.price,item.isFragile);
	}
	
	public int getItemCode() {
		return itemCode;
	}
	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isFragile() {
		return isFragile;
	}
	public void setFragile(boolean isFragile) {
		this.isFragile = isFragile;
	}
	
	public static double totalPrice(Item i1,Item i2) {
		return i1.price+i2.price;
	}
}

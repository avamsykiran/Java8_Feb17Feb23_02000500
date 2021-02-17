package com.cts.fundaentals.model;

public class Item {
	
	static double SALES_TAX = 0.10;

	private int itemCode;
	private String itemName;
	private double price;
	private boolean isFragile;
	
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

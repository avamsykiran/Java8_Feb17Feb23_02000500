package com.cts.ld.model;

import java.io.Serializable;
import java.time.LocalDate;

public class Item implements Comparable<Item>,Serializable{

	private int icode;
	private String name;
	private double price;
	private boolean isFragile;
	private LocalDate packedDate;
	
	public Item(){
		
	}

	public Item(int icode, String name, double price, boolean isFragile, LocalDate packedDate) {
		super();
		this.icode = icode;
		this.name = name;
		this.price = price;
		this.isFragile = isFragile;
		this.packedDate = packedDate;
	}

	public int getIcode() {
		return icode;
	}

	public void setIcode(int icode) {
		this.icode = icode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public LocalDate getPackedDate() {
		return packedDate;
	}

	public void setPackedDate(LocalDate packedDate) {
		this.packedDate = packedDate;
	}

	@Override
	public String toString() {
		return "Item [icode=" + icode + ", name=" + name + ", price=" + price + ", isFragile=" + isFragile
				+ ", packedDate=" + packedDate + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + icode;
		result = prime * result + (isFragile ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((packedDate == null) ? 0 : packedDate.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (icode != other.icode)
			return false;
		if (isFragile != other.isFragile)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (packedDate == null) {
			if (other.packedDate != null)
				return false;
		} else if (!packedDate.equals(other.packedDate))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}

	@Override
	public int compareTo(Item o) {
		Integer i1 = this.icode;
		Integer i2 = o.icode;
		return i1.compareTo(i2);
	}
	
	
}

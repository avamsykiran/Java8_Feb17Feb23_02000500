package com.cts.gcd.model;

public class Category implements Comparable<Category> {
	
	private int ccode;
	private String category;
	
	public Category() {
		// TODO Auto-generated constructor stub
	}
	
	public Category(int ccode, String category) {
		super();
		this.ccode = ccode;
		this.category = category;
	}

	public int getCcode() {
		return ccode;
	}

	public void setCcode(int ccode) {
		this.ccode = ccode;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Category [ccode=" + ccode + ", category=" + category + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + ccode;
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
		Category other = (Category) obj;
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		if (ccode != other.ccode)
			return false;
		return true;
	}

	@Override
	public int compareTo(Category o) {
		return category.compareTo(o.category);
	}
	


}

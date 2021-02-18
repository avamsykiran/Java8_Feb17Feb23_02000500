package com.cts.fundaentals.ui;

import com.cts.fundaentals.model.Employee;
import com.cts.fundaentals.model.Manager;

public class InheretenceDemo {

	public static void main(String[] args) {

		Employee emp = new Employee(101, "Vansy", 5625.0);
		Manager mang = new Manager(102, "Suseela", 9856.0, 652.0);
		
		System.out.println(emp);
		System.out.println(mang);
		
		 
	}

}

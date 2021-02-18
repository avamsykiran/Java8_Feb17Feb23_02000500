package com.cts.fundaentals.model;

public class Employee {

	private int empId;
	private String name;
	private double basic;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int empId, String name, double basic) {
		super();
		this.empId = empId;
		this.name = name;
		this.basic = basic;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBasic() {
		return basic;
	}

	public void setBasic(double basic) {
		this.basic = basic;
	}

	@Override
	public String toString() {
		return "empId=" + empId + ", name=" + name + ", basic=" + basic;
	}
	
}

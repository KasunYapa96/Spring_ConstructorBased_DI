package com.hcl.beans;

public class Employee {

	private int eno;
	private String name;
	private int salary;
	private Address address;
	
	public Employee() {}

	
	
	public Employee(int eno, String name, int salary, Address address) {
		super();
		this.eno = eno;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return eno +"\t"+name+"\t"+salary+"\t"+address;
	}
	
	
}

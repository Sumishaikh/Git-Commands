package com.exponent.usermangemnet.model;

public class Users {

	private int  uid;
	
	private  String name;
	
	private String address;
	
	private double salary;

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Users [uid=" + uid + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}
	
	
}

package com.demo.Beans;

public class Person implements Comparable<Employee> {
	private String pname;
	private String Number;
	public Person() {
		super();
	}
	public Person(String pname, String number) {
		super();
		this.pname = pname;
		Number = number;
	}
	
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getNumber() {
		return Number;
	}
	public void setNumber(String number) {
		Number = number;
	}
	@Override
	public String toString() {
		return "Person [pname=" + pname + ", Number=" + Number + "]";
	}
	@Override
	public int compareTo(Employee o) {
		
		return this.getPname().compareTo(o.getPname());
	}
	
}

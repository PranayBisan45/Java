package com.demo.Beans;

import java.time.LocalDate;

abstract public class Employee extends Person{
	private int eid;
	private String dept;
	private String desg;
	private LocalDate doj;
	public Employee() {
		super();
	}
	
	public Employee(String pname, String number,int eid, String dept, String desg, LocalDate doj) {
		super(pname, number);
		this.eid = eid;
		this.dept = dept;
		this.desg = desg;
		this.doj = doj;
	}

	public double calSal() {
		return 0;
	}
	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	public LocalDate getDoj() {
		return doj;
	}

	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}

	@Override
	public String toString() {
		return super.toString()+"Employee [eid=" + eid + ", dept=" + dept + ", desg=" + desg + ", doj=" + doj + "]";
	}
	
}

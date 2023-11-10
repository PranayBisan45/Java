package com.demo.Beans;

import java.time.LocalDate;

public class SalariedEmp extends Employee{
	private double Sal;
	private double bonus;
	public SalariedEmp() {
		super();
	}

	public SalariedEmp(String pname, String number, int eid, String dept, String desg, LocalDate doj,double sal, double bonus) {
		super(pname, number, eid, dept, desg, doj);
		Sal = sal;
		this.bonus = bonus;
	}

	public double getSal() {
		return Sal;
	}

	public void setSal(double sal) {
		Sal = sal;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public double calSal() {
		return Sal+bonus;
	}
	@Override
	public String toString() {
		return super.toString()+"SalariedEmp [Sal=" + Sal + ", bonus=" + bonus + "]";
	}
}

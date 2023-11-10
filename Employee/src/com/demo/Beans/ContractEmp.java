package com.demo.Beans;

import java.time.LocalDate;

public class ContractEmp extends Employee {
		private int hrs;
		private double charges;
		public ContractEmp() {
			super();
		}

		public ContractEmp(String pname, String number, int eid, String dept, String desg, LocalDate doj,int hrs, double charges) {
			super(pname, number, eid, dept, desg, doj);
			this.hrs = hrs;
			this.charges = charges;
		}

		public int getHrs() {
			return hrs;
		}

		public void setHrs(int hrs) {
			this.hrs = hrs;
		}

		public double getCharges() {
			return charges;
		}

		public void setCharges(double charges) {
			this.charges = charges;
		}

		public double calSal() {
			return hrs*charges;
		}
		@Override
		public String toString() {
			return super.toString()+"ContractEmp [hrs=" + hrs + ", charges=" + charges + "]";
		}
		
		
}

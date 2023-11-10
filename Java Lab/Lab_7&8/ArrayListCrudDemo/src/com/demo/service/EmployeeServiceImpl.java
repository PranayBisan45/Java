package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import com.demo.beans.ContractEmp;
import com.demo.beans.Employee;
import com.demo.beans.SalariedEmp;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDao edao;
	public EmployeeServiceImpl() {
		edao=new EmployeeDaoImpl();
	}
	@Override
	public void AddNewEmp(int ch) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Id");
		int id=sc.nextInt();
		System.out.println("Enter Name");
		String nm=sc.next();
		System.out.println("Enter Mobile");
		String mo=sc.next();	
		System.out.println("Enter Email");
		String em=sc.next();
		System.out.println("Enter Department");
		String dept=sc.next();
		System.out.println("Enter Designation");
		String desg=sc.next();
		System.out.println("Enter Date (dd/MM/yyyy)");
		String dt=sc.next();
		LocalDate ldt=LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		Employee e=null;
		if(ch==1) {
			System.out.println("Enter Salary");
			double s=sc.nextDouble();
			System.out.println("Enter Bonus");
			double b=sc.nextDouble();
			e=new SalariedEmp(id,nm,mo,em,dept,desg,ldt,s,b);
		}
		else if(ch==2) {
			System.out.println("Enter Hours");
			int h=sc.nextInt();
			System.out.println("Enter Charges");
			double c=sc.nextDouble();
			e=new ContractEmp(id,nm,mo,em,dept,desg,ldt,h,c);
		}
		else {
			System.out.println("Enter No of Employee");
			int no=sc.nextInt();
			System.out.println("Enter Amount");
			double am=sc.nextDouble();
			e=new ContractEmp(id,nm,mo,em,dept,desg,ldt,no,am);
		}
		edao.save(e);
	}
	@Override
	public List<Employee> DisplayAll() {
		
		return edao.findall();
	}
	@Override
	public Employee DisplayById(int id) {
		return edao.getbyid(id);
	}
	@Override
	public boolean Deletebyid(int id) {
		
		return edao.removebyid(id);
	}
	@Override
	public boolean Modifiedsal(int id, double sal) {
		
		return edao.UpdateSalById(id,sal);
	}
	@Override
	public List<Employee> SortById() {
		// TODO Auto-generated method stub
		return edao.sortbyid();
	}
	@Override
	public List<Employee> SortByName() {
		return edao.sortbyname();
	}
	@Override
	public List<Employee> SortBySalary() {
		return edao.sortbysalary();
	}
	
	
}

package com.demo.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.service.*;
public class TestArrayList {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		EmployeeService es=new EmployeeServiceImpl();
		do {
			System.out.println("1. Add new Employee\n2. delete employee by id\n 3. modify salary");
			System.out.println("4. Display all\n 5.display by id\n 6. sort by salary\n 7. sort by id\n 8. sort by name\n 9.exit\n choice: ");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("1.Salaried Employee\n 2.Contract Employee\n 3.Vendor Employee\n enter choice:");
				int ch=sc.nextInt();
				es.AddNewEmp(ch);
				break;
			case 2:
				System.out.println("Enter Id for delete: ");
				int id=sc.nextInt();
				boolean status=es.Deletebyid(id);
				if(status) {
					System.out.println("Id deleted");
				}
				else {
					System.out.println("Not Found");
				}
				break;
			case 3:
				System.out.println("Enter Id for Modify salary: ");
				id=sc.nextInt();
				System.out.println("Enter Sal for modify: ");
				double sal=sc.nextDouble();
				status=es.Modifiedsal(id,sal);
				if(status) {
					System.out.println("Modified Successfuly");
				}
				else {
					System.out.println("Id not found");
				}
				break;
			case 4:
				List<Employee>elist=es.DisplayAll();
				if(elist!=null) {
					elist.stream().forEach(System.out::println);
				}
				break;
			case 5:
				System.out.println("Enter Id For Display: ");
				id=sc.nextInt();
				Employee e=es.DisplayById(id);
				if(e!=null) {
					System.out.println(e);
				}
				else
					System.out.println("Id Not Found");
				break;
			case 6:
				List<Employee> elst = EmployeeService.SortBySalary();
				elst.stream().forEach(System.out::println);
				break;
				break;
			case 7:
				List<Employee>elst=es.SortById();
				elst.stream().forEach(System.out::println);
				break;
			case 8:
				List<Employee>plst=es.SortByName();
				plst.stream().forEach(System.out::println);
				break;
			case 9:
				sc.close();
				System.out.println("Thank You For Visiting....");
				break;
			default:
				System.out.println("Invalid Choice");
			}
		}while(choice!=8);
		
	}
}

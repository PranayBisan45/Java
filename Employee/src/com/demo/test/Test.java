package com.demo.test;
import com.demo.Beans.Employee;
import com.demo.services.*;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Test {
	public static void main(String [] args) {
		Scanner sc=new Scanner (System.in);
		EmpServices es = new EmpServicesImpl();
		int choice;
		do {
			System.out.println("1.Display By Name\n2.Sort by Name\n3.Sort by Id\nEnter your choice");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				List <Employee> el=es.DisplayAll();
				el.stream().forEach(System.out::println);
				break;
			case 2:
				List<Employee> elist=es.sortByName();
				elist.stream().forEach(System.out::println);
				break;
			case 3:
				List<Employee> el2=es.sortbyid();
				el2.stream().forEach(System.out::println);
				break;
		} 
			
		} while(choice !=0);
	}
}

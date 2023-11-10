package com.demo.services;

import java.util.List;
import java.util.Set;
import com.demo.Beans.Employee;
//import com.demo.test;
 

public interface EmpServices {

	List<Employee> DisplayAll();

	List<Employee> sortByName();

	List<Employee> sortbyid();

	Set<Employee> sortbyid1();

}

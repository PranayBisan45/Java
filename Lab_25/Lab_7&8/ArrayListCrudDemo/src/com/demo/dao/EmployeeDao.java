package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeDao {


	void save(Employee e);

	

	List<Employee> findall();



	Employee getbyid(int id);



	boolean removebyid(int id);



	boolean UpdateSalById(int id, double sal);



	List<Employee> sortbyid();



	List<Employee> sortbyname();
	
	List<Employee> sortbysalary();

}
package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeService {

	void AddNewEmp(int ch);

	List<Employee> DisplayAll();

	Employee DisplayById(int id);

	boolean Deletebyid(int id);

	boolean Modifiedsal(int id, double sal);

	List<Employee> SortById();

	List<Employee> SortByName();

	List<Employee> SortBySalary();

}

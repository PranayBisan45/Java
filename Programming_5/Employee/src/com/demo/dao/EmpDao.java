package com.demo.dao;

import java.util.List;
import java.util.Set;

import com.demo.Beans.Employee;

public interface EmpDao {

	List<Employee> DisplayAll();

	List<Employee> sortByname();

	List<Employee> sortbyid();

	Set<Employee> sortbyid1();

}

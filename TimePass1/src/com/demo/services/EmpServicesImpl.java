package com.demo.services;
import java.util.List;
import java.util.Set;

import com.demo.Beans.Employee;
import com.demo.dao.*;
public class EmpServicesImpl implements EmpServices{
	EmpDao edao=new EmpDaoImpl();

	@Override
	public List<Employee> DisplayAll() {
		
		return edao.DisplayAll();
		
	}

	@Override
	public List<Employee> sortByName() {
		
		return edao.sortByname();
	}

	@Override
	public List<Employee> sortbyid() {
		// TODO Auto-generated method stub
		return edao.sortbyid();
	}

	@Override
	public Set<Employee> sortbyid1() {
		// TODO Auto-generated method stub
		return edao.sortbyid1();
	}

}

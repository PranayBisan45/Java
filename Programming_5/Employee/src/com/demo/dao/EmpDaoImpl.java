package com.demo.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.demo.Beans.ContractEmp;
import com.demo.Beans.Employee;
import com.demo.Beans.SalariedEmp;

public class EmpDaoImpl implements EmpDao{
	static List<Employee> elist;
	static {
		elist=new ArrayList<>();
		elist.add(new SalariedEmp("Pranay","96658",45,"manager","sales",LocalDate.of(2023, 12, 14),24234.0,3423.0));
		elist.add(new SalariedEmp("Bhupesh","94658",7,"manager","General",LocalDate.of(2024, 1, 14),2434.0,323.0));
		elist.add(new ContractEmp("Ganesh","67658",420,"manager","Orange",LocalDate.of(2023, 2, 14),2,33.0));
	}

	@Override
	public List<Employee> DisplayAll() {
		
		return elist;
		
	}

	@Override
	public List<Employee> sortByname() {
		Collections.sort(elist);
		return elist;
		// return elist.sort(null);
	}

	@Override
	public List<Employee> sortbyid() {
    
		Comparator<Employee> c=(a,b)->{
			int id1=0,id2=0;
			id1=a.getEid();
			id2=b.getEid();
			return id1-id2;
			};
			
			List<Employee> elis=new ArrayList<>();
			for(Employee e:elist) {
				elis.add(e);
			}
						elis.sort(c);

			return elis;
		
		
		
		}

	@Override
	public Set<Employee> sortbyid1() {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public Set<Employee> sortbyid1() {
//		
//		Comparator<Employee> c=(a,b)->{
//			int id1=0,id2=0;
//			id1=a.getEid();
//			id2=b.getEid();
//			return id1-id2;
//			};
//			Set<Employee> elis=new HashSet<>();
//			for(Employee e:elist) {
//				elis.add(e);
//			}
//				
//		// TODO Auto
//		Set<Employee> tlist=new TreeSet<>();
//		for(Employee e:elis) {
//		tlist.add(e);
//	}
//	return tlist;
//		
//	}
	
	}



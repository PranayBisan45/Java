package com.demo.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.demo.beans.ContractEmp;
import com.demo.beans.Employee;
import com.demo.beans.SalariedEmp;
import com.demo.beans.VendorEmp;

public class EmployeeDaoImpl implements EmployeeDao {
	
	static List <Employee>elist;
	static {
		elist=new ArrayList<>();
		elist.add(new SalariedEmp(12,"Rajat","4444","a@gmail.com","hr","associate",LocalDate.of(2002, 12,30),4556,345));
 		elist.add(new SalariedEmp(16,"Ajit","555","a22@gmail.com","admin","associate",LocalDate.of(2002, 10,30),4577,377));
 		elist.add(new ContractEmp(14,"Rajas","666","r345@gmail.com","admin","manager",LocalDate.of(2002, 12,30),30,4000));
 		elist.add(new ContractEmp(15,"Ashwini","777","ashu@gmail.com","hr","associate",LocalDate.of(2000, 12,30),40,5000));
	}
	@Override
	public void save(Employee e) {
		elist.add(e);
	}
	@Override
	public List<Employee> findall() {
		
		return elist;
	}
	@Override
	public Employee getbyid(int id) {
		int pos=elist.indexOf(new SalariedEmp(id));
		if (pos!=-1) {
			return elist.get(pos);
		}
		return null;
	}
	@Override
	public boolean removebyid(int id) {
		
		return elist.remove(new SalariedEmp(id));
	}
	@Override
	public boolean UpdateSalById(int id, double sal) {
		Employee e=getbyid(id);
		if(e!=null) {
			if(e instanceof  SalariedEmp) {
				((SalariedEmp)e).setSal(sal);
			}
			else if(e instanceof ContractEmp) {
				((ContractEmp)e).setCharges(sal);
			} 
			else if (e instanceof VendorEmp){
				((VendorEmp)e).setAmt(sal);
			}
			return true;
		}
		return false;
	}
	@Override
	public List<Employee> sortbyid() {
		List<Employee>elst=new ArrayList<>();
		for(Employee e:elist) {
			elst.add(e);
		}
		elst.sort(null);
		return elst;
	}
	@Override
	public List<Employee> sortbyname() {
		List<Employee>elst=new ArrayList<>();
		for(Employee e:elist) {
			elst.add(e);
		}
		Comparator<Employee>myname=(o1,o2)->{
			return o1.getPname().compareTo(o2.getPname());
		};
		elst.sort(myname);
		return elst;
	}
	@Override
	public List<Employee> sortbysalary() {
		List<Employee> elst=new ArrayList<>();
		for(Employee e: elist) {
			elst.add(e);
		}
		Comparator<Employee> mysalary=(s1,s2)->{
			return ((SalariedEmp)s1).getSal().compareTo((SalariedEmp)s2.getSal());
		};
		return 
	}
	

}

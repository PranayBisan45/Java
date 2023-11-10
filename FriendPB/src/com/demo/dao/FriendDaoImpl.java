package com.demo.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.demo.Beans.Friends;

public class FriendDaoImpl implements FriendDao{
	static List<Friends> Friend;
	static Set<String>Hobbie;
	static Set<String> Hobbie1;
	static {
		Friend=new ArrayList<>();
		Hobbie=new HashSet<>();
		Hobbie1=new HashSet<>();
		
		Hobbie.add("Swimming");
		Hobbie.add("Travelling");
		Hobbie.add("Hiking");
		
		Hobbie1.add("Reading");
		Hobbie1.add("Writing");
		Hobbie1.add("Swimming");
		
		Friend.add(new Friends(2,"Sanket","Sawarkar",Hobbie,"9552007193","ssawarkar5@gmail.com",LocalDate.of(2001, 12, 14),"Ramtek"));
		Friend.add(new Friends(1,"Pranay","Bisan",Hobbie,"9552007193","pranaybisan45@gmail.com",LocalDate.of(2001, 8, 13),"Ramtek"));
		Friend.add(new Friends(3,"Swaroop","Wajagi",Hobbie1,"9552007193","swajagi@gmail.com",LocalDate.of(2001, 6, 2),"Ramtek"));

	}
	@Override
	public List<Friends> ShowAll() {
		return Friend;
	}
	@Override
	public Friends getById(int id) {
		for(Friends f:Friend) {
			if(f.getId()==id) {
				return f;
			}
		}
		return null;
	}
	@Override
	public Friends getByname(String name) {
		for(Friends f:Friend) {
			if(f.getName().contains(name)){
			return f;
			}
		}
		return null;
	}
	@Override
	public List<Friends> getByhobbie(String hb) {
		List<Friends> fhb=new ArrayList<>();

			for(Friends f:Friend) {
//				if(f.getHobbies()!=null) {
			if(f.getHobbies().contains(hb)) {
				fhb.add(f);
			}
			
//			return null;
			
		}
			
		//return fhb!=null ? fhb :null;
//			if(fhb!=null) {
//				return fhb;
//			} else {
//				return null;
//			}
			return fhb;
	}
}

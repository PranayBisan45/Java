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
	
	static {
		Friend=new ArrayList<>();
		Hobbie=new HashSet<>();
		
		Hobbie.add("Cricket");
		Hobbie.add("Travelling");
		Hobbie.add("Hiking");
		
		Friend.add(new Friends(2,"Sanket","Sawarkar",Hobbie,"9552007193","ssawarkar5@gmail.com",LocalDate.of(2001, 12, 14),"Ramtek"));
		Friend.add(new Friends(1,"Pranay","Bisan",Hobbie,"9552007193","pranaybisan45@gmail.com",LocalDate.of(2001, 8, 13),"Ramtek"));
		Friend.add(new Friends(3,"Swaroop","Wajagi",Hobbie,"9552007193","swajagi@gmail.com",LocalDate.of(2001, 6, 2),"Ramtek"));

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

}

package com.demo.Service;
import com.demo.dao.*;

import java.util.List;

import com.demo.Beans.Friends;

public class FriendServiceImpl implements FriendService {
	FriendDao fdao= new FriendDaoImpl();
	@Override
	public List<Friends> DisplayAll() {
		return fdao.ShowAll();
	}
	@Override
	public Friends searchByid(int id) {
		return fdao.getById(id);
	}
	@Override
	public Friends SearchByName(String name) {
		return fdao.getByname(name);
	}
	@Override
	public List<Friends> searchByHobbie(String hb) {
		return fdao.getByhobbie(hb);
	}
	
}

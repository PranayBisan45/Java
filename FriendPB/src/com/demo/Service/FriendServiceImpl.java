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
	
}

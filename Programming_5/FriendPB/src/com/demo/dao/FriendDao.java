package com.demo.dao;

import java.util.List;

import com.demo.Beans.Friends;

public interface FriendDao {

	List<Friends> ShowAll();

	Friends getById(int id);

	Friends getByname(String name);

	List<Friends> getByhobbie(String hb);

}

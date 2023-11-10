package com.demo.Service;

import java.util.List;

import com.demo.Beans.Friends;

public interface FriendService {

	List<Friends> DisplayAll();

	Friends searchByid(int id);

	Friends SearchByName(String name);

	List<Friends> searchByHobbie(String hb);

}

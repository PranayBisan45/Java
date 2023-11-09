package com.demo.Service;

import java.util.List;

import com.demo.Beans.Friends;

public interface FriendService {

	List<Friends> DisplayAll();

	Friends searchByid(int id);

}

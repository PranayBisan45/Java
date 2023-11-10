package com.demo.test;
import com.demo.Beans.Friends;
import com.demo.Service.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestFriend {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int choice=0;
		FriendService fs = new FriendServiceImpl();
		do {
			System.out.println();
			System.out.println();
			System.out.println("1. Display All Friend\n2. Search by id\n3. Search by name");
			System.out.println("4. Display all friend with a particular hobby\n5. Exit");
			System.out.println("Enter Your Choice");
			choice=sc.nextInt();
		switch(choice) {
		case 1:
			List<Friends> friend=fs.DisplayAll();
			if(friend!=null) {
				System.out.println(friend);
			} else {
				System.out.println("Friend Not Found !!");
			}
			break;
		case 2:
			System.out.println("Enter the Id");
			int id=sc.nextInt();
			Friends f=fs.searchByid(id);
			if(f!=null) {
				System.out.println(f);
			} else {
				System.out.println("Id not Found");
			}
			break;
		case 3:
			System.out.println("Enter the Name");
			String name=sc.next();
			Friends fname=fs.SearchByName(name);
			if(fname!=null) {
				System.out.println(fname);
			} else {
				System.out.println("Name not Found");
			}
			break;
		case 4:
			System.out.println("Enter the Hobbie");
			String hb=sc.next();
			List<Friends> hobbie=fs.searchByHobbie(hb);
			if(!hobbie.isEmpty()) {
				System.out.println(hobbie);
			}
			else
			System.out.println("Hobby not found");
			break;
		case 5:
			System.out.println("Thank You for Visiting...");
			break;
		default:
			System.out.println("Invalid Choice !!");
		}
		} while(choice!=5);
	}

}

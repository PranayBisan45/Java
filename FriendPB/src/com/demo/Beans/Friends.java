package com.demo.Beans;

import java.time.LocalDate;
import java.util.Set;

public class Friends {
	private int id;
	private String name;
	private String lastname;
	private Set<String> hobbies;
	private String mob;
	private String email;
	private LocalDate bdate;
	private String address;
	
	public Friends() {
		super();
	}

	public Friends(int id, String name, String lastname, Set<String> hobbies, String mob, String email, LocalDate bdate,String address) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.hobbies = hobbies;
		this.mob = mob;
		this.email = email;
		this.bdate = bdate;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Set<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(Set<String> hobbies) {
		this.hobbies = hobbies;
	}

	public String getMob() {
		return mob;
	}

	public void setMob(String mob) {
		this.mob = mob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getBdate() {
		return bdate;
	}

	public void setBdate(LocalDate bdate) {
		this.bdate = bdate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Friends [id=" + id + ", name=" + name + ", lastname=" + lastname + ", hobbies=" + hobbies + ", mob="
				+ mob + ", email=" + email + ", bdate=" + bdate + ", address=" + address + "]";
	}
}

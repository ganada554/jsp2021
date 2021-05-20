package com.mycos.web.entity;

public class Manager {
	
	//'ID','USER_ID','PASSWORD'
	
	private int id;
	private int user_id;
	private String password;
	
	public Manager() {
		// TODO Auto-generated constructor stub
	}

	public Manager(int id, int user_id, String password) {
		this.id = id;
		this.user_id = user_id;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Manager [id=" + id + ", user_id=" + user_id + ", password=" + password + "]";
	}
	
	

}

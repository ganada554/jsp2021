package com.mycos.web.entity;

public class Manager {
	
	//'ID','USER_ID','PASSWORD'
	
	private int id;
	private int userId;
	private String password;
	
	public Manager() {
		// TODO Auto-generated constructor stub
	}

	public Manager(int id, int userId, String password) {
		this.id = id;
		this.userId = userId;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Manager [id=" + id + ", userId=" + userId + ", password=" + password + "]";
	}
	
	

}

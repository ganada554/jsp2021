package com.mycos.web.entity;

public class Group {
	
	//'ID','NAME','USER_ID'
	
	private int id;
	private String name;
	private int userId;
	
	public Group() {
		// TODO Auto-generated constructor stub
	}
	
	public Group(int id, String namep, int userId) {
		this.id = id;
		this.name = namep;
		this.userId = userId;
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
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Group [id=" + id + ", name=" + name + ", userId=" + userId + "]";
	}
	
	
}

package com.mycos.web.entity;

public class Group {
	
	//'ID','NAME','USER_ID'
	
	private int id;
	private String namep;
	private int user_id;
	
	public Group() {
		// TODO Auto-generated constructor stub
	}
	
	public Group(int id, String namep, int user_id) {
		this.id = id;
		this.namep = namep;
		this.user_id = user_id;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNamep() {
		return namep;
	}
	public void setNamep(String namep) {
		this.namep = namep;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	@Override
	public String toString() {
		return "Group [id=" + id + ", namep=" + namep + ", user_id=" + user_id + "]";
	}
	
	
}

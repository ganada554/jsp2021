package com.mycos.web.entity;

import java.util.Date;

public class Group {
	
	//'ID','NAME','USER_ID'
	
	private int id;
	private String name;
	private int memberId;
	
	public Group() {
		// TODO Auto-generated constructor stub
	}
	
	public Group(int id, String name, int memberId) {
		this.id = id;
		this.name = name;
		this.memberId = memberId;
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
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	@Override
	public String toString() {
		return "Group [id=" + id + ", name=" + name + ", memberId=" + memberId + "]";
	}
	
	
}

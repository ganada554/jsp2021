package com.mycos.web.entity;

import java.util.Date;

public class BookMark {
	
	//'USER_ID','COURSE_ID','REGDATE'
	private int user_id;
	private int course_id;
	private Date regdate;
	
	public BookMark() {
		// TODO Auto-generated constructor stub
	}
	
	
	public BookMark(int user_id, int course_id, Date regdate) {
		super();
		this.user_id = user_id;
		this.course_id = course_id;
		this.regdate = regdate;
	}


	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getCourse_id() {
		return course_id;
	}
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}


	@Override
	public String toString() {
		return "BookMark [user_id=" + user_id + ", course_id=" + course_id + ", regdate=" + regdate + "]";
	}
	
	
	

}

package com.mycos.web.entity;

import java.util.Date;

public class BookMark {
	
	//'USER_ID','COURSE_ID','REGDATE'
	private int userId;
	private int courseId;
	private Date regdate;
	
	public BookMark() {
		// TODO Auto-generated constructor stub
	}
	
	
	public BookMark(int userId, int courseId, Date regdate) {
		super();
		this.userId = userId;
		this.courseId = courseId;
		this.regdate = regdate;
	}


	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}


	@Override
	public String toString() {
		return "BookMark [userId=" + userId + ", courseId=" + courseId + ", regdate=" + regdate + "]";
	}
	
	
	

}

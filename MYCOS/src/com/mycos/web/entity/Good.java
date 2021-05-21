package com.mycos.web.entity;

public class Good {
 //'USER_ID','COURSE_ID'
	
	private int userId;
	private int courseId;
	
	public Good() {
		// TODO Auto-generated constructor stub
	}

	public Good(int userId, int courseId) {
		this.userId = userId;
		this.courseId = courseId;
	}

	public int getUser_id() {
		return userId;
	}

	public void setUser_id(int userId) {
		this.userId = userId;
	}

	public int getCourse_id() {
		return courseId;
	}

	public void setCourse_id(int courseId) {
		this.courseId = courseId;
	}

	@Override
	public String toString() {
		return "Good [userId=" + userId + ", courseId=" + courseId + "]";
	}
	
	
}

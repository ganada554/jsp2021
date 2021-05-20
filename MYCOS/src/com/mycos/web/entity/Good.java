package com.mycos.web.entity;

public class Good {
 //'USER_ID','COURSE_ID'
	
	private int user_id;
	private int course_id;
	
	public Good() {
		// TODO Auto-generated constructor stub
	}

	public Good(int user_id, int course_id) {
		this.user_id = user_id;
		this.course_id = course_id;
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

	@Override
	public String toString() {
		return "Good [user_id=" + user_id + ", course_id=" + course_id + "]";
	}
	
	
}

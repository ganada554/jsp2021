package com.mycos.web.entity;

import java.util.Date;

public class Comment {

	
	//'ID','CONTENT','REGDATE','USER_ID','COURSE_ID'
	
	private int id;
	private String content;
	private Date regdate;
	private String user_id;
	private int course_id;
	
	
	public Comment() {
		// TODO Auto-generated constructor stub
	}


	public Comment(int id, String content, Date regdate, String user_id, int course_id) {
		this.id = id;
		this.content = content;
		this.regdate = regdate;
		this.user_id = user_id;
		this.course_id = course_id;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public Date getRegdate() {
		return regdate;
	}


	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}


	public String getUser_id() {
		return user_id;
	}


	public void setUser_id(String user_id) {
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
		return "Comment [id=" + id + ", content=" + content + ", regdate=" + regdate + ", user_id=" + user_id
				+ ", course_id=" + course_id + "]";
	}
	
	
	
}

package com.mycos.web.entity;

import java.util.Date;

public class Comment {

	
	//'ID','CONTENT','REGDATE','USER_ID','COURSE_ID'
	
	private int id;
	private String content;
	private Date regdate;
	private String userId;
	private int courseId;
	
	
	public Comment() {
		// TODO Auto-generated constructor stub
	}


	public Comment(int id, String content, Date regdate, String userId, int courseId) {
		this.id = id;
		this.content = content;
		this.regdate = regdate;
		this.userId = userId;
		this.courseId = courseId;
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


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public int getCourseId() {
		return courseId;
	}


	public void setCourseId(int course_id) {
		this.courseId = course_id;
	}


	@Override
	public String toString() {
		return "Comment [id=" + id + ", content=" + content + ", regdate=" + regdate + ", userId=" + userId
				+ ", courseId=" + courseId + "]";
	}
	
	
	
}

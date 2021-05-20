package com.mycos.web.entity;

import java.util.Date;

public class Notice {
//'ID','TITLE','CONTENT','REGDATE','OPEN','USER_ID','HIT'
	
	private int id;
	private String title;
	private String content;
	private Date regdate;
	private int open;
	private int user_id;
	private int hit;
	
	public Notice() {
		// TODO Auto-generated constructor stub
	}

	public Notice(int id, String title, String content, Date regdate, int open, int user_id, int hit) {
		this.id = id;
		this.title = title;
		this.content = content;
		this.regdate = regdate;
		this.open = open;
		this.user_id = user_id;
		this.hit = hit;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public int getOpen() {
		return open;
	}

	public void setOpen(int open) {
		this.open = open;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	@Override
	public String toString() {
		return "Notice [id=" + id + ", title=" + title + ", content=" + content + ", regdate=" + regdate + ", open="
				+ open + ", user_id=" + user_id + ", hit=" + hit + "]";
	}
	
	
	
}

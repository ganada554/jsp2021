package com.mycos.web.entity;

import java.util.Date;

public class Course {
	
	//'MEMBER_ID','NICNAME','REGDATE','HIT','TITLE','OPEN','CONTENT','ID','PG_RATE'
	private int memberId;
	private String nicname;
	private Date regdate;
	private int hit;
	private String title;
	private int open;
	private String content;
	private int id;
	private int pgRate;
	
	public Course() {
		// TODO Auto-generated constructor stub
	}

	public Course(int memberId, String nicname, Date regdate, int hit, String title, int open, String content,
			int id, int pgRate) {
		this.nicname = nicname;
		this.regdate = regdate;
		this.hit = hit;
		this.title = title;
		this.open = open;
		this.content = content;
		this.id = id;
		this.pgRate = pgRate;
	}
	
	

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getNicname() {
		return nicname;
	}

	public void setNicname(String nicname) {
		this.nicname = nicname;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getOpen() {
		return open;
	}

	public void setOpen(int open) {
		this.open = open;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPgRate() {
		return pgRate;
	}

	public void setPgRate(int pgRate) {
		this.pgRate = pgRate;
	}
	
	

	@Override
	public String toString() {
		return "Course [ memberId="+ memberId  + ", nicname=" + nicname + ", regdate=" + regdate + ", hit=" + hit
				+ ", title=" + title + ", open=" + open + ", content=" + content + ", id=" + id + ", pgRate=" + pgRate
				+ "]";
	}
	
	
	
	
	
}

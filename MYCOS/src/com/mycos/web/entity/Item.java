package com.mycos.web.entity;

public class Item {
	
	//'ID','TEXT','USER_ID','COMPLETE','URL'
	
	private int id;
	private String text;
	private int userId;
	private int complete; 
	private String url;
	
	public Item() {
		// TODO Auto-generated constructor stub
	}

	public Item(int id, String text, int userId, int complete, String url) {
		this.id = id;
		this.text = text;
		this.userId = userId;
		this.complete = complete;
		this.url = url;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getComplete() {
		return complete;
	}

	public void setComplete(int complete) {
		this.complete = complete;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", text=" + text + ", userId=" + userId + ", complete=" + complete + ", url=" + url
				+ "]";
	}
	
	

}

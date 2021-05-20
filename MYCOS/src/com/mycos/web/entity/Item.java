package com.mycos.web.entity;

public class Item {
	
	//'ID','TEXT','USER_ID','COMPLETE','URL'
	
	private int id;
	private String text;
	private int user_id;
	private int complete; 
	private String url;
	
	public Item() {
		// TODO Auto-generated constructor stub
	}

	public Item(int id, String text, int user_id, int complete, String url) {
		this.id = id;
		this.text = text;
		this.user_id = user_id;
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

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
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
		return "Item [id=" + id + ", text=" + text + ", user_id=" + user_id + ", complete=" + complete + ", url=" + url
				+ "]";
	}
	
	

}

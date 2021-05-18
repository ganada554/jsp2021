package com.mycos.web.entity;

import java.util.Date;

public class Member {
	
	private String nicname;
	private String userId;
	private String email;
	private String password;
	private String birthday;
	private String gender;
	
	public Member() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Member(String nicname, String userId, String email, String password, String birthday,
			String gender) {
		this.nicname = nicname;
		this.userId = userId;
		this.email = email;
		this.password = password;
		this.birthday = birthday;
		this.gender = gender;
	}


	
	public String getNicname() {
		return nicname;
	}
	
	public void setNicname(String nicname) {
		this.nicname = nicname;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getBirthday() {
		return birthday;
	}
	
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	

	@Override
	public String toString() {
		return "Member [ nicname=" + nicname + ", userId=" + userId + ", email="
				+ email + ", password=" + password + ", birthday=" + birthday + ", gender=" + gender + "]" ;
	}
	
	
	
}

package com.mycos.web.entity;

import java.util.Date;

public class Member {
	
	//   id,nicname,user_id,email,password,gender,birthday,regdate,image
	private int id;
	private String nicname;
	private String user_id;
	private String email;
	private String password;
	private String gender;
	private String birthday;
	private Date regdate;
	private String image;
	
	public Member() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Member(int id, String nicname, String user_id, String email, String password, String gender, String birthday,
			Date regdate, String image) {
		this.id = id;
		this.nicname = nicname;
		this.user_id = user_id;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.birthday = birthday;
		this.regdate = regdate;
		this.image = image;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getImage() {
		return image;
	}



	public void setImage(String image) {
		this.image = image;
	}



	public String getNicname() {
		return nicname;
	}
	
	public void setNicname(String nicname) {
		this.nicname = nicname;
	}
	
	
	
	public String getUser_id() {
		return user_id;
	}



	public void setUser_id(String user_id) {
		this.user_id = user_id;
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
	
	

	public Date getRegdate() {
		return regdate;
	}



	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}



	@Override
	public String toString() {
		return "Member [id=" + id + ", nicname=" + nicname + ", user_id=" + user_id + ", email=" + email + ", password="
				+ password + ", gender=" + gender + ", birthday=" + birthday + ", regdate=" + regdate + ", image="
				+ image + "]";
	}



	
	
	
	
}

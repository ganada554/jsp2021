package com.mycos.web.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import com.mycos.web.entity.Member;

public class MemberService {
	
	public Member getProfile(String userId) throws ClassNotFoundException, SQLException {
		Member member = null;
		String sql = "SELECT * FROM MEMBER WHERE USER_ID LIKE "
				+"'"+userId+"'";
		String url = "jdbc:oracle:thin:@hi.namoolab.com:1521/xepdb1";

		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection(url, "LIKE3", "333");
		PreparedStatement st = con.prepareStatement(sql);
		ResultSet rs = st.executeQuery(sql);
		
		//'ID','NICNAME','USER_ID','EMAIL','PASSWORD','GENDER','BIRTHDAY','REGDATE','IMAGE','STATUS'
		
		if(rs.next()) {
			 int id = rs.getInt("id");
			 String nicname = rs.getString("nicname");
			 String email = rs.getString("email");
			 String password = rs.getString("password");
			 String gender = rs.getString("gender");
			 String birthday = rs.getString("birthday");
			 Date regdate = rs.getDate("regdate");
			 String image = rs.getString("image");
			 String status = rs.getString("status");
			 
			 member = new Member();
			 member.setId(id);
			 member.setUserId(userId);
			 member.setNicname(nicname);
			 member.setEmail(email);
			 member.setPassword(password);
			 member.setGender(gender);
			 member.setBirthday(birthday);
			 member.setRegdate(regdate);
			 member.setImage(image);
			 member.setStatus(status);
			 
		}

		rs.close();
		st.close();
		con.close(); //¿¬°á ²÷±â
		System.out.println(member);
		return member;
	}

}

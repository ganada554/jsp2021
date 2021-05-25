package com.mycos.web.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mycos.web.entity.Member;

public class jdbcMemberService {
	
	public void addMember(Member member) throws ClassNotFoundException, SQLException { //set은 기존의 데이터 변경 add??
		int result = 0;
		System.out.println("ok");
		
		String sql = "INSERT INTO MEMBER(NICNAME, USER_ID, EMAIL, PASSWORD, GENDER, BIRTHDAY)"
				+ " VALUES(?, ?, ?, ?, ?, ?)";
		
		String url = "jdbc:oracle:thin:@hi.namoolab.com:1521/xepdb1";
		
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection(url, "LIKE3", "333");
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1, member.getNicname());
		st.setString(2, member.getUserId());
		st.setString(3, member.getEmail());
		st.setString(4, member.getPassword());
		st.setString(5, member.getGender());
		st.setString(6, member.getBirthday());
		
		
		result = st.executeUpdate(); //몇 개 넣었는지 안쓰더라도 결과 리턴해줘야 한다
		
		
		st.close();
		con.close();
		
		
	}
	
	
}

package com.mycos.web.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServlet;

import com.mycos.web.entity.Course;
import com.mycos.web.entity.Group;
import com.mycos.web.entity.Member;

public class JDBCMypageService implements MypageService {

	@Override
	public Member getProfile(int id) throws ClassNotFoundException, SQLException {
		Member member = null;
		String sql = "SELECT * FROM MEMBER WHERE ID="
				+id;
		String url = "jdbc:oracle:thin:@hi.namoolab.com:1521/xepdb1";

		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection(url, "LIKE3", "333");
		PreparedStatement st = con.prepareStatement(sql);
		ResultSet rs = st.executeQuery(sql);
		
		//'ID','NICNAME','USER_ID','EMAIL','PASSWORD','GENDER','BIRTHDAY','REGDATE','IMAGE','STATUS'
		
		if(rs.next()) {
			 String userId = rs.getString("user_id");
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

	@Override
	public List<Group> getGroupList(int memberid) throws ClassNotFoundException, SQLException {
		List<Group> list = new ArrayList<>();
		String sql = "SELECT * FROM \"GROUP\" WHERE MEMBER_ID="
				+memberid;
		String url = "jdbc:oracle:thin:@hi.namoolab.com:1521/xepdb1";

		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection(url, "LIKE3", "333");
		PreparedStatement st = con.prepareStatement(sql);
		ResultSet rs = st.executeQuery(sql);
		
		//ID, NAME, MEMBER_ID
		
		while(rs.next()) {
			 int id = rs.getInt("id");
			 String name = rs.getString("name");
			
			 Group group = new Group();
			 
			 group = new Group();
			 group.setId(id);
			 group.setMemberId(memberid);
			 group.setName(name);
		
			 list.add(group);
		}

		rs.close();
		st.close();
		con.close(); //¿¬°á ²÷±â
		
		
		return list;
	}

	@Override
	public List<Course> getCourseList(int memberid) throws SQLException, ClassNotFoundException {
		List<Course> list = new ArrayList<>();
		String sql = "SELECT * FROM COURSE WHERE MEMBER_ID="
				+ memberid;
		String url = "jdbc:oracle:thin:@hi.namoolab.com:1521/xepdb1";

		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection(url, "LIKE3", "333");
		PreparedStatement st = con.prepareStatement(sql);
		ResultSet rs = st.executeQuery(sql);
		
		//ID, NAME, MEMBER_ID
		
		while(rs.next()) {
			 int id = rs.getInt("id");
			 String nicname = rs.getString("nicname");
			 Date regdate = rs.getDate("regdate");
			 int hit = rs.getInt("hit");
			 String title = rs.getString("title");
			 int open = rs.getInt("open");
			 String content = rs.getString("content");
			 int pgRate = rs.getInt("pg_rate");
			 
			 
			 
			 Course course = new Course();
			 
			 course = new Course();
			 course.setMemberId(memberid);
			 course.setNicname(nicname);
			 course.setId(id);
			 course.setRegdate(regdate);
			 course.setHit(hit);
			 course.setTitle(title);
			 course.setOpen(open);
			 course.setContent(content);
			 course.setPgRate(pgRate);
		
			 list.add(course);
		}

		rs.close();
		st.close();
		con.close(); //¿¬°á ²÷±â
		
		
		
		return list;
	}

	@Override
	public int getCourseCount(int memberId) throws ClassNotFoundException, SQLException {
		int count = 0;
		String sql = "SELECT COUNT(ID) COUNT FROM COURSE WHERE MEMBER_ID="+memberId;
		String url = "jdbc:oracle:thin:@hi.namoolab.com:1521/xepdb1";

		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection(url, "LIKE3", "333");
		PreparedStatement st = con.prepareStatement(sql);
		ResultSet rs = st.executeQuery(sql);
		
		if(rs.next()) {
			int cnt = rs.getInt("count");
			count = cnt;
		}
		
		
		System.out.printf("countÀÇ °³¼ö : %d",count);
		return count;
	}

}

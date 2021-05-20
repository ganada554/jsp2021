package com.mycos.web.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mycos.web.entity.Member;
import com.mycos.web.service.MemberService;

@WebServlet("/mycos/root/member/guest/add")
public class MemberAddController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("o7777777777777777777777777777777777777777777777777");
		
		String nicname = request.getParameter("nicname");
		String id = request.getParameter("id");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String gender = request.getParameter("gender");
		String birthday = request.getParameter("birthday");
		
		MemberService memberservice = new MemberService();
		try {
			Member member = new Member();
			member.setNicname(nicname);
			member.setUser_id(id);
			member.setEmail(email);
			member.setPassword(password);
			member.setGender(gender);
			member.setBirthday(birthday);
			
			memberservice.setMember(member);
			System.out.println(member);
		} catch (ClassNotFoundException | SQLException e){
			e.printStackTrace();
		}
		
		response.sendRedirect("login.jsp");
	}
	
}

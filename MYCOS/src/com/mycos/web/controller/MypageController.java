package com.mycos.web.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mycos.web.entity.Course;
import com.mycos.web.entity.Group;
import com.mycos.web.entity.Member;
import com.mycos.web.service.JDBCMypageService;
import com.mycos.web.service.MypageService;

@WebServlet("/member/mypage")
public class MypageController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		MypageService mypgsv = new JDBCMypageService();
		
		Member member = null;
		List<Group> group = null;
		List<Course> course = null;
		try {
			 member = mypgsv.getProfile(1);
			 group = mypgsv.getGroupList(1);
			 course = mypgsv.getCourseList(1);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		request.setAttribute("member", member);
		request.setAttribute("course", course);
		request.setAttribute("group", group);
		request.getRequestDispatcher("/WEB-INF/view/member/mypage.jsp").forward(request, response);
		
	}
	
}

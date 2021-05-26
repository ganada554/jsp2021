package com.mycos.web.service;

import java.sql.SQLException;
import java.util.List;

import com.mycos.web.entity.Course;
import com.mycos.web.entity.Group;
import com.mycos.web.entity.Member;

public interface MypageService  {
	//!!! userId !!!
	Member getProfile(int id) throws ClassNotFoundException, SQLException ; //이미지, 이름, 상태메세지(DB에 넣기)
	List<Group> getGroupList(int id) throws ClassNotFoundException, SQLException; //폴더 목록 출력
	List<Course> getCourseList(int id) throws SQLException, ClassNotFoundException; //코스들 목록
	
	int getCourseCount(int id); //코스 전체 개수
}

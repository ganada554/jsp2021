package com.mycos.web.service;

import java.sql.SQLException;
import java.util.List;

import com.mycos.web.entity.Course;
import com.mycos.web.entity.Group;
import com.mycos.web.entity.Member;

public interface MypageService  {
	//!!! userId !!!
	Member getProfile(int id) throws ClassNotFoundException, SQLException ; //�̹���, �̸�, ���¸޼���(DB�� �ֱ�)
	List<Group> getGroupList(int id) throws ClassNotFoundException, SQLException; //���� ��� ���
	List<Course> getCourseList(int id) throws SQLException, ClassNotFoundException; //�ڽ��� ���
	
	int getCourseCount(int id); //�ڽ� ��ü ����
}

package com.mycos.web.service;

import java.util.List;

import com.mycos.web.entity.Course;
import com.mycos.web.entity.Group;
import com.mycos.web.entity.Member;

public interface MypageServiceByGuest {

	List<Member> getProfile(String userId); //�̹���, �̸�, ���¸޼���
	List<Group> getGroupList(String userId); //���� ��� ���
	List<Course> getCourseList(String userId); //�ڽ��� ���
	
	int getAllCourse(String userId); //�ڽ� ��ü ����
}

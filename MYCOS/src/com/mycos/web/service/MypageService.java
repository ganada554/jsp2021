package com.mycos.web.service;

import java.util.List;

import com.mycos.web.entity.Course;
import com.mycos.web.entity.Group;
import com.mycos.web.entity.Member;

public interface MypageService {
	//!!! userId !!!
	Member getProfile(String userId); //�̹���, �̸�, ���¸޼���(DB�� �ֱ�)
	List<Group> getGroupList(String userId); //���� ��� ���
	List<Course> getCourseList(String userId); //�ڽ��� ���
	
	int getCourseCount(String userId); //�ڽ� ��ü ����
}

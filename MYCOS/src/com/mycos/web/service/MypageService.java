package com.mycos.web.service;

import java.util.List;

import com.mycos.web.entity.Course;
import com.mycos.web.entity.Group;
import com.mycos.web.entity.Member;

public interface MypageService {
	//!!! userId !!!
	Member getProfile(int id); //�̹���, �̸�, ���¸޼���(DB�� �ֱ�)
	List<Group> getGroupList(String user_id); //���� ��� ���
	List<Course> getCourseList(String user_id); //�ڽ��� ���
	
	int getCourseCount(String userId); //�ڽ� ��ü ����
}

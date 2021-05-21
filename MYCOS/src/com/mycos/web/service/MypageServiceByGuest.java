package com.mycos.web.service;

import java.util.List;

import com.mycos.web.entity.Course;
import com.mycos.web.entity.Group;
import com.mycos.web.entity.Member;

public interface MypageServiceByGuest {

	List<Member> getProfile(String userId); //이미지, 이름, 상태메세지
	List<Group> getGroupList(String userId); //폴더 목록 출력
	List<Course> getCourseList(String userId); //코스들 목록
	
	int getAllCourse(String userId); //코스 전체 개수
}

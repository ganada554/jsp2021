package com.mycos.web.service;

import java.util.List;

import com.mycos.web.entity.Course;
import com.mycos.web.entity.Group;
import com.mycos.web.entity.Member;

public interface MypageService {
	//!!! userId !!!
	Member getProfile(int id); //이미지, 이름, 상태메세지(DB에 넣기)
	List<Group> getGroupList(String user_id); //폴더 목록 출력
	List<Course> getCourseList(String user_id); //코스들 목록
	
	int getCourseCount(String userId); //코스 전체 개수
}

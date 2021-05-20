package com.mycos.web.service;

import com.mycos.web.entity.Member;

public interface IndexService {
	//String getGreeting(); //현재 시스템 시간 들어가기 -> 자바스크립트
	//String getNicname(String user_id); 따로 갖고 오지 않기 , 그냥 통으로 갖고오기

	Member getMember();
	//guest는 root에 두기.  login 했어도 index service면 root에 넣기
	//view 단위로 목록을 갖고와야 하는 경우도 있다 
}

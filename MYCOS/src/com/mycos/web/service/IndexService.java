package com.mycos.web.service;

import com.mycos.web.entity.Member;

public interface IndexService {
	//String getGreeting(); //���� �ý��� �ð� ���� -> �ڹٽ�ũ��Ʈ
	//String getNicname(String user_id); ���� ���� ���� �ʱ� , �׳� ������ �������

	Member getProfile(String userId); 
	//guest�� root�� �α�.  login �߾ index service�� root�� �ֱ�
	//view ������ ����� ����;� �ϴ� ��쵵 �ִ� 
}

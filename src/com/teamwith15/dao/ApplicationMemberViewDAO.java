package com.teamwith15.dao;

import java.util.List;

import com.teamwith15.vo.ApplicationMemberViewVO;

public interface ApplicationMemberViewDAO {
	/** Ư�� ȸ���� ���� ���� ���� (���� ���� ���� ����)*/
	public List<ApplicationMemberViewVO> searchApplicationMemberViewByMemberId(String memberId) throws Exception;
	/** Ư�� ���� ������ �������� ���� ���� ���� (���� �� ������ ����)*/
	public List<ApplicationMemberViewVO> searchApplicationMemberViewByTeamId(String teamId) throws Exception;
	/** ��� application_member_view ���ڵ� �ҷ�����*/
	public List<ApplicationMemberViewVO> searchApplicationMemberVIewAll() throws Exception;
}

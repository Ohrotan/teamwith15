package com.teamwith15.dao;

import java.util.List;

import com.teamwith15.vo.ApplicationMemberViewVO;

public interface ApplicationMemberViewDAO {
	/** 특정 회원의 지원 내역 보기 (나의 지원 내역 보기)*/
	public List<ApplicationMemberViewVO> searchApplicationMemberViewByMemberId(String memberId) throws Exception;
	/** 특정 팀에 지원한 지원자의 지원 내역 보기 (나의 팀 지원자 보기)*/
	public List<ApplicationMemberViewVO> searchApplicationMemberViewByTeamId(String teamId) throws Exception;
	/** 모든 application_member_view 레코드 불러오기*/
	public List<ApplicationMemberViewVO> searchApplicationMemberVIewAll() throws Exception;
}

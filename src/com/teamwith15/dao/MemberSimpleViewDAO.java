package com.teamwith15.dao;

import java.util.List;

import com.teamwith15.vo.MemberSimpleViewVO;

public interface MemberSimpleViewDAO {
	/*모든 회원 리스트를 칭찬순으로 검색*/
	public List<MemberSimpleViewVO> searchMemberSimpleList();
	/*회원 아이디로 검색*/
	public MemberSimpleViewVO searchMemberByMemberId(String memberId);
	/*회원 활동 지역으로 검색*/
	public List<MemberSimpleViewVO> searchMemberByRegion(String region);
}

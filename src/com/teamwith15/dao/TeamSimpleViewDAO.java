//작성자 : 황규진
package com.teamwith15.dao;

import java.util.List;

import com.teamwith15.vo.TeamSimpleViewVO;

public interface TeamSimpleViewDAO {
	/** 모든 팀 간략 정보 최신순으로 찾기*/
	public List<TeamSimpleViewVO> searchRecentTeamSimpleView() throws Exception;
	/** 특정 회원의 팀 간략 정보 찾기*/
	public List<TeamSimpleViewVO> searchMyTeamSimpleView(String memberId) throws Exception;
	/** 모든 팀 간략 정보 불러오기*/
	public List<TeamSimpleViewVO> searchTeamSimpleViewAll() throws Exception;
}

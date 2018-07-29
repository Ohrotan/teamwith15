//작성자 : 황규진
package com.teamwith15.dao;

import java.util.List;

import com.teamwith15.vo.TeamDetailViewVO;

public interface TeamDetailViewDAO {
	/** 특정 팀에 대한 팀 상세 정보 검색*/
	public TeamDetailViewVO searchTeamDetailViewByTeamId(String teamId) throws Exception;
	/** 모든 팀 상세 정보 불러오기*/
	public List<TeamDetailViewVO> searchTeamDetailViewAll() throws Exception;
}

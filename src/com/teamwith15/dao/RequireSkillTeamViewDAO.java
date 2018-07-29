//작성자 : 황규진
package com.teamwith15.dao;

import java.util.List;

import com.teamwith15.vo.RequireSkillTeamViewVO;

public interface RequireSkillTeamViewDAO {
	/** 특정 팀에 대한 모든 모집의 요구 기술 정보 검색*/
	public List<RequireSkillTeamViewVO> searchRequireSkillTeamViewByTeamId(String teamId) throws Exception;
	/** 특정 모집에 대한 모든 요구 기술 정보 검색*/
	public List<RequireSkillTeamViewVO> searchRequireSkillTeamViewByRecruitId(String recruitId) throws Exception;
	/** 모든 요구 기술 정보 불러오기*/
	public List<RequireSkillTeamViewVO> searchRequireSkillTeamViewAll() throws Exception;
}

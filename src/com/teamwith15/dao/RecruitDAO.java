//작성자 : 황규진
package com.teamwith15.dao;

import java.util.List;

import com.teamwith15.dto.RecruitDTO;

public interface RecruitDAO {
	/** 모집 정보 추가*/
	public int addRecruit(RecruitDTO recruit) throws Exception;
	/** 모집 정보 삭제*/
	public int removeRecruitByRecruitId(String recruitId) throws Exception;
	/** recruit_tb의 모든 정보 수정*/
	public int updateRecruitAll(RecruitDTO recruit) throws Exception;
	/** recruit_id에 해당하는 레코드의 recruit_people_num, recruit_preference, recruit_explain, role_id 수정*/
	public int updateRecruit(RecruitDTO recruit) throws Exception;
	/** recruit_id에 해당하는 레코드의 recruit_people_num만 수정*/
	public int updateRecruitPeopleNum(RecruitDTO recruit) throws Exception;
	/** 특정 recruit 레코드 검색 */
	public RecruitDTO searchRecruitByRecruitId(String recruitId) throws Exception;
	/** 특정 팀의 모든 recruit 레코드 검색*/
	public List<RecruitDTO> searchRecruitByTeamId(String teamId) throws Exception;
	/** 모든 recruit 레코드 불러오기*/
	public List<RecruitDTO> searchRecruitAll() throws Exception;
}

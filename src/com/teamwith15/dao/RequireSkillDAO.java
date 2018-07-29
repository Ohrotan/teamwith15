//작성자 : 황규진
package com.teamwith15.dao;

import java.util.List;

import com.teamwith15.dto.RequireSkillDTO;

public interface RequireSkillDAO {
	/** 요구 기술 정보 추가*/
	public int addRequireSkill(RequireSkillDTO requireSkill) throws Exception;
	/** recruit_id와 skill_id가 모두 일치해야 삭제*/
	public int removeRequireSkill(RequireSkillDTO requireSkill) throws Exception;
	/** recruitId에 해당하는 모든 레코드 삭제*/
	public int removeRequireSkillByRecruitId(String recruitId) throws Exception;
	/** 해당 모집의 모든 요구 기술 검색*/
	public List<RequireSkillDTO> searchRequireSkillByRecruitId(String recruitId) throws Exception;
	/** 해당 스킬을 요구하는 모든 모집 검색 */
	public List<RequireSkillDTO> searchRequireSkillBySkillId() throws Exception;
	/** 모든 요구 시술 정보 불러오기*/
	public List<RequireSkillDTO> searchRequireSkillAll() throws Exception;
}

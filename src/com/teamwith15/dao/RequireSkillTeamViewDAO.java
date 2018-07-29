//�ۼ��� : Ȳ����
package com.teamwith15.dao;

import java.util.List;

import com.teamwith15.vo.RequireSkillTeamViewVO;

public interface RequireSkillTeamViewDAO {
	/** Ư�� ���� ���� ��� ������ �䱸 ��� ���� �˻�*/
	public List<RequireSkillTeamViewVO> searchRequireSkillTeamViewByTeamId(String teamId) throws Exception;
	/** Ư�� ������ ���� ��� �䱸 ��� ���� �˻�*/
	public List<RequireSkillTeamViewVO> searchRequireSkillTeamViewByRecruitId(String recruitId) throws Exception;
	/** ��� �䱸 ��� ���� �ҷ�����*/
	public List<RequireSkillTeamViewVO> searchRequireSkillTeamViewAll() throws Exception;
}

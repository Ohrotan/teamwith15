//�ۼ��� : Ȳ����
package com.teamwith15.dao;

import java.util.List;

import com.teamwith15.vo.TeamDetailViewVO;

public interface TeamDetailViewDAO {
	/** Ư�� ���� ���� �� �� ���� �˻�*/
	public TeamDetailViewVO searchTeamDetailViewByTeamId(String teamId) throws Exception;
	/** ��� �� �� ���� �ҷ�����*/
	public List<TeamDetailViewVO> searchTeamDetailViewAll() throws Exception;
}

//�ۼ��� : Ȳ����
package com.teamwith15.dao;

import java.util.List;

import com.teamwith15.vo.TeamSimpleViewVO;

public interface TeamSimpleViewDAO {
	/** ��� �� ���� ���� �ֽż����� ã��*/
	public List<TeamSimpleViewVO> searchRecentTeamSimpleView() throws Exception;
	/** Ư�� ȸ���� �� ���� ���� ã��*/
	public List<TeamSimpleViewVO> searchMyTeamSimpleView(String memberId) throws Exception;
	/** ��� �� ���� ���� �ҷ�����*/
	public List<TeamSimpleViewVO> searchTeamSimpleViewAll() throws Exception;
}

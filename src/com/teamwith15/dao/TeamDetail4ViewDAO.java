package com.teamwith15.dao;

import java.util.List;

import com.teamwith15.vo.TeamDetail4ViewVO;

public interface TeamDetail4ViewDAO {
	
	public List<TeamDetail4ViewVO> searchTeamDetail4(String teamId);
}

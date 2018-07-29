package com.teamwith15.dao;

import java.util.List;
import java.util.Map;

import com.teamwith15.dto.TeamDTO;

public interface TeamDAO {
	public int insertTeam(TeamDTO team) throws Exception;
	public int deleteTeamByTeamId(String teamId) throws Exception;
	public int deleteTeamByMemberId(String memberId) throws Exception;
	public int updateTeamInfoByCondition(Map<String, Object> map) throws Exception;
	public int updateTeamUpdateDate(String teamId) throws Exception;
	public int updateTeamStatus(String teamId) throws Exception;
	public int updateTeam(TeamDTO team) throws Exception;
	public List<TeamDTO> searchTeamByStatus(int teamStatus) throws Exception;
	public List<TeamDTO> searchTeamByCondition(Map<String, Object> map) throws Exception;
	public List<TeamDTO> searchTeam() throws Exception;
}
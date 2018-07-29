package com.teamwith15.service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.teamwith15.dto.TeamDTO;

public class TeamService_ {
	private SqlSession session;
	private static String namespace = "com.teamwith.mapper.TeamMapper";
	
	public void a(TeamDTO team) throws Exception {
		session.insert(namespace + "a", team);
	}
	
	public void b(String teamId) throws Exception {
		session.delete(namespace + "b", teamId);
	}
	
	public void c(String memberId) throws Exception {
		session.delete(namespace + "c", memberId);
	}
	
	public void d(String teamPic, String teamId) throws Exception {
		Map<String, String> map = new HashMap<String, String>();
		map.put("teamPic", teamPic);
		map.put("teamId", teamId);
		session.update(namespace + "d", map);
	}
	
	public void e(String teamContestName, String teamId) throws Exception {
		Map<String, String> map = new HashMap<String, String>();
		map.put("teamContestName", teamContestName);
		map.put("teamId", teamId);
		session.update(namespace + "e", map);
	}
	
	public void f(String teamContestLink, String teamId) throws Exception {
		Map<String, String> map = new HashMap<String, String>();
		map.put("teamContestLink", teamContestLink);
		map.put("teamId", teamId);
		session.update(namespace + "f", map);
	}
	
	public void g(Date teamEndDate, String teamId) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("teamEndDate", teamEndDate);
		map.put("teamId", teamId);
		session.update(namespace + "g", map);
	}
	
	public void h(String teamId) throws Exception {
		session.update(namespace + "h", teamId);
	}
	
	public void i(String teamId) throws Exception {
		session.update(namespace + "i", teamId);
	}
	
	public void j(TeamDTO team) throws Exception {
		session.update(namespace + "j", team);
	}
}

package com.teamwith15.dao;

import java.util.List;

import com.teamwith15.vo.TeamDetailViewVO6;

public interface TeamDetailViewDAO6 {
	// 댓글 가져오기
	public List<TeamDetailViewVO6> searchComment() throws Exception;
}

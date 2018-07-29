package com.teamwith15.dao;

import java.util.List;

import com.teamwith15.vo.ProfileVO;

public interface MainProfileDAO {

	public ProfileVO searchMainProfile(String memberId);
	
	public List<ProfileVO> searchAllMainProfile();
	
}

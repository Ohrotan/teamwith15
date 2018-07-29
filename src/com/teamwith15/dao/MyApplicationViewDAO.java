package com.teamwith15.dao;

import java.util.List;

import com.teamwith15.vo.MyApplicationViewVO;

public interface MyApplicationViewDAO {
	public List<MyApplicationViewVO> searchMyApplicationView() throws Exception;
}

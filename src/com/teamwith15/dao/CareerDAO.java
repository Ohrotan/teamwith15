package com.teamwith15.dao;

import java.util.List;

import com.teamwith15.dto.CareerDTO;

public interface CareerDAO {
	public int addCareer(CareerDTO dto);

	public int updateCareer(CareerDTO dto);

	public int removeCareer(String careerId);

	public int removeCareerByMember(String memberId);

	public List<CareerDTO> searchCareer(String memberId);
	
	public List<CareerDTO> searchAllCareer();
}

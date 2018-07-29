package com.teamwith15.dao;

import java.util.List;

import com.teamwith15.dto.MemberTendencyDTO;

public interface MemberTendencyDAO {
	public int addMemberTendency(MemberTendencyDTO dto);

	public int updateTendencyFigure(MemberTendencyDTO dto);

	public int removeMemberTendency(String memberId);

	public List<MemberTendencyDTO> searchMemberTendency(String memberId);
	
	public List<MemberTendencyDTO> searchAllMemberTendency();

}

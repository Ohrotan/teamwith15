package com.teamwith15.dao;

import java.util.List;

import com.teamwith15.dto.MemberPraiseDTO;
import com.teamwith15.vo.MemberPraiseVO;

public interface MemberPraiseDAO {
	public int addMemberPraise(MemberPraiseDTO dto);

	public int removeMemberPraise(MemberPraiseDTO dto);

	public int removeMemberAllPraise(String memberId);

	public List<MemberPraiseVO> searchMemberPraise(String memberId);
	
	public List<MemberPraiseDTO> searchAllMemberPraise();
}

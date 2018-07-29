package com.teamwith15.dao;

import java.util.List;

import com.teamwith15.dto.MemberSkillDTO;

public interface MemberSkillDAO {
	public int addMemberSkill(MemberSkillDTO dto);

	public int updateSkillLevel(MemberSkillDTO dto);

	public int reomveMemberSkill(MemberSkillDTO dto);

	public List<MemberSkillDTO> searchSkillByMember(String memberId);

	public List<MemberSkillDTO> searchMemberBySkill(String skillId);

	public List<MemberSkillDTO> searchAllMemberSkill();
}

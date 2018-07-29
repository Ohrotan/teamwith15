package com.teamwith15.dao;

import java.util.List;

import com.teamwith15.dto.MemberProjectCategoryDTO;

public interface MemberProjectCategoryDAO {
	public int addMemberProjectCategory(MemberProjectCategoryDTO dto);

	public int removeMemberProjectCategory(MemberProjectCategoryDTO dto);

	public List<MemberProjectCategoryDTO> searchProjectCategoryByMember(String memberId);

	public List<MemberProjectCategoryDTO> searchMemberByProjectCategory(String projectCategoryId);

	public List<MemberProjectCategoryDTO> searchAllMemberProjectCategory();

}

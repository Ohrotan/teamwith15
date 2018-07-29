package com.teamwith15.dao;

import java.util.List;
import java.util.Map;

import com.teamwith15.dto.MemberDTO;
import com.teamwith15.vo.MemberSimpleVO;

public interface MemberDAO {
	public int addMember(MemberDTO dto);

	public int addAdminMember(MemberDTO dto);

	public int updateMemberStatus(String memberId);

	public int updateNonMember(String memberId);

	public int updateMember(MemberDTO dto);

	public int updatePassword(Map<String, String> map);

	public List<MemberDTO> searchAll();

	public String searchMailOrId(Map<String,String> map);

	public MemberDTO searchMember(Map<String, String> map);

	public MemberDTO searchMemberWithCondition(Map<String,String> map);

	public MemberSimpleVO searchMemberByRoleRegion(Map<String, String> map);

	public MemberSimpleVO searchMemberForSimpleView(String memberId);

	public MemberDTO searchMemberForView(String memberId);
}

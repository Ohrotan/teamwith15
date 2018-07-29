package com.teamwith15.vo;

import java.sql.Date;

public class MemberSimpleViewVO {
	private String memberId;
	private String memberPic;
	private String memberName;
	private String roleId;
	private Date memberRegisterDate;
	private String regionId1;
	private String regionId2;
	private int totalPraiseCnt;
	
	public MemberSimpleViewVO() {
		
	}
	
	public MemberSimpleViewVO(String memberId, String memberPic, String memberName, String roleId, Date memberRegisterDate,
			String regionId1, String regionId2, int totalPraiseCnt) {
		super();
		this.memberId = memberId;
		this.memberPic = memberPic;
		this.memberName = memberName;
		this.roleId = roleId;
		this.memberRegisterDate = memberRegisterDate;
		this.regionId1 = regionId1;
		this.regionId2 = regionId2;
		this.totalPraiseCnt = totalPraiseCnt;
	}

	public String getMemberId() {
		return memberId;
	}
	public String getMemberPic() {
		return memberPic;
	}
	public String getMemberName() {
		return memberName;
	}
	public String getRoleId() {
		return roleId;
	}
	public Date getMemberRegisterDate() {
		return memberRegisterDate;
	}
	public String getRegionId1() {
		return regionId1;
	}
	public String getRegionId2() {
		return regionId2;
	}
	public int getTotalPraiseCnt() {
		return totalPraiseCnt;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public void setMemberPic(String memberPic) {
		this.memberPic = memberPic;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public void setMemberRegisterDate(Date memberRegisterDate) {
		this.memberRegisterDate = memberRegisterDate;
	}
	public void setRegionId1(String regionId1) {
		this.regionId1 = regionId1;
	}
	public void setRegionId2(String regionId2) {
		this.regionId2 = regionId2;
	}
	public void setTotalPraiseCnt(int totalPraiseCnt) {
		this.totalPraiseCnt = totalPraiseCnt;
	}
	
	
}

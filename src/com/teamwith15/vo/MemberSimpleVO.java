package com.teamwith15.vo;

public class MemberSimpleVO {
	private String memberId;
	private String memberName;
	private String memberPic;
	
	public MemberSimpleVO() {
		
	}

	public MemberSimpleVO(String memberId, String memberName, String memberPic) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.memberPic = memberPic;
	}

	public String getMemberId() {
		return memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public String getMemberPic() {
		return memberPic;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public void setMemberPic(String memberPic) {
		this.memberPic = memberPic;
	}

	@Override
	public String toString() {
		return "MemberSimpleVO [memberId=" + memberId + ", memberName=" + memberName + ", memberPic=" + memberPic + "]";
	}

	
}

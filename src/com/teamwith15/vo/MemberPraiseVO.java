package com.teamwith15.vo;

public class MemberPraiseVO {
	private String memberId;
	private String praiseId;
	private int praiseCnt;

	public MemberPraiseVO() {
		// TODO Auto-generated constructor stub
	}

	public MemberPraiseVO(String memberId, String praiseId, int praiseCnt) {
		super();
		this.memberId = memberId;
		this.praiseId = praiseId;
		this.praiseCnt = praiseCnt;
	}

	public String getMemberId() {
		return memberId;
	}

	public String getPraiseId() {
		return praiseId;
	}

	public int getPraiseCnt() {
		return praiseCnt;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public void setPraiseId(String praiseId) {
		this.praiseId = praiseId;
	}

	public void setPraiseCnt(int praiseCnt) {
		this.praiseCnt = praiseCnt;
	}

	@Override
	public String toString() {
		return "MemberPraiseVO [memberId=" + memberId + ", praiseId=" + praiseId + ", praiseCnt=" + praiseCnt + "]";
	}
	
	

}

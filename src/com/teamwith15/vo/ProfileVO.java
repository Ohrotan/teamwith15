package com.teamwith15.vo;

public class ProfileVO {
	private MemberSimpleVO member;
	private int applicationCnt;
	private int teamCnt;
	public ProfileVO() {
	}
	public ProfileVO(MemberSimpleVO member, int applicationCnt, int teamCnt) {
		super();
		this.member = member;
		this.applicationCnt = applicationCnt;
		this.teamCnt = teamCnt;
	}
	public MemberSimpleVO getMember() {
		return member;
	}
	public void setMember(MemberSimpleVO member) {
		this.member = member;
	}
	public int getApplicationCnt() {
		return applicationCnt;
	}
	public void setApplicationCnt(int applicationCnt) {
		this.applicationCnt = applicationCnt;
	}
	public int getTeamCnt() {
		return teamCnt;
	}
	public void setTeamCnt(int teamCnt) {
		this.teamCnt = teamCnt;
	}
	@Override
	public String toString() {
		return "ProfileVO [member=" + member + ", applicationCnt=" + applicationCnt + ", teamCnt=" + teamCnt + "]";
	}
}

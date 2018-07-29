package com.teamwith15.vo;

import java.util.Date;

public class MyApplicationViewVO {
	private String teamId;
	private String teamPic;
	private String teamName;
	private String roleId;
	private Date applicationDate;
	private String applicationFreewriting;
	private int applicationStatus;
	private String applicationId;
	public MyApplicationViewVO() {
		super();
	}
	public MyApplicationViewVO(String teamId, String teamPic, String teamName, String roleId, Date applicationDate,
			String applicationFreewriting, int applicationStatus, String applicationId) {
		super();
		this.teamId = teamId;
		this.teamPic = teamPic;
		this.teamName = teamName;
		this.roleId = roleId;
		this.applicationDate = applicationDate;
		this.applicationFreewriting = applicationFreewriting;
		this.applicationStatus = applicationStatus;
		this.applicationId = applicationId;
	}
	public String getTeamId() {
		return teamId;
	}
	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}
	public String getTeamPic() {
		return teamPic;
	}
	public void setTeamPic(String teamPic) {
		this.teamPic = teamPic;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public Date getApplicationDate() {
		return applicationDate;
	}
	public void setApplicationDate(Date applicationDate) {
		this.applicationDate = applicationDate;
	}
	public String getApplicationFreewriting() {
		return applicationFreewriting;
	}
	public void setApplicationFreewriting(String applicationFreewriting) {
		this.applicationFreewriting = applicationFreewriting;
	}
	public int getApplicationStatus() {
		return applicationStatus;
	}
	public void setApplicationStatus(int applicationStatus) {
		this.applicationStatus = applicationStatus;
	}
	public String getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}
	@Override
	public String toString() {
		return "MyApplicationViewVO [teamId=" + teamId + ", teamPic=" + teamPic + ", teamName=" + teamName + ", roleId="
				+ roleId + ", applicationDate=" + applicationDate + ", applicationFreewriting=" + applicationFreewriting
				+ ", applicationStatus=" + applicationStatus + ", applicationId=" + applicationId + "]";
	}
}

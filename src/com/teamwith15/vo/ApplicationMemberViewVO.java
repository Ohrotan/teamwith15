package com.teamwith15.vo;

import java.sql.Date;

public class ApplicationMemberViewVO {
	private String teamId;
	private String applicationId;
	private String memberId;
	private String memberPic;
	private String memberName;
	private Date applicationDate;
	private int applicationStatus;
	private String roleId;
	private String ApplicationFreewriting;
	public ApplicationMemberViewVO() {
		super();
	}
	public ApplicationMemberViewVO(String teamId, String applicationId, String memberId, String memberPic,
			String memberName, Date applicationDate, int applicationStatus, String roleId,
			String applicationFreewriting) {
		super();
		this.teamId = teamId;
		this.applicationId = applicationId;
		this.memberId = memberId;
		this.memberPic = memberPic;
		this.memberName = memberName;
		this.applicationDate = applicationDate;
		this.applicationStatus = applicationStatus;
		this.roleId = roleId;
		ApplicationFreewriting = applicationFreewriting;
	}
	public String getTeamId() {
		return teamId;
	}
	public String getApplicationId() {
		return applicationId;
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
	public Date getApplicationDate() {
		return applicationDate;
	}
	public int getApplicationStatus() {
		return applicationStatus;
	}
	public String getRoleId() {
		return roleId;
	}
	public String getApplicationFreewriting() {
		return ApplicationFreewriting;
	}
	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}
	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
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
	public void setApplicationDate(Date applicationDate) {
		this.applicationDate = applicationDate;
	}
	public void setApplicationStatus(int applicationStatus) {
		this.applicationStatus = applicationStatus;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public void setApplicationFreewriting(String applicationFreewriting) {
		ApplicationFreewriting = applicationFreewriting;
	}
	public String toString() {
		return "ApplicationMemberViewVO [teamId=" + teamId + ", applicationId=" + applicationId + ", memberId="
				+ memberId + ", memberPic=" + memberPic + ", memberName=" + memberName + ", applicationDate="
				+ applicationDate + ", applicationStatus=" + applicationStatus + ", roleId=" + roleId
				+ ", ApplicationFreewriting=" + ApplicationFreewriting + "]";
	}
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ApplicationFreewriting == null) ? 0 : ApplicationFreewriting.hashCode());
		result = prime * result + ((applicationDate == null) ? 0 : applicationDate.hashCode());
		result = prime * result + ((applicationId == null) ? 0 : applicationId.hashCode());
		result = prime * result + applicationStatus;
		result = prime * result + ((memberId == null) ? 0 : memberId.hashCode());
		result = prime * result + ((memberName == null) ? 0 : memberName.hashCode());
		result = prime * result + ((memberPic == null) ? 0 : memberPic.hashCode());
		result = prime * result + ((roleId == null) ? 0 : roleId.hashCode());
		result = prime * result + ((teamId == null) ? 0 : teamId.hashCode());
		return result;
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ApplicationMemberViewVO other = (ApplicationMemberViewVO) obj;
		if (ApplicationFreewriting == null) {
			if (other.ApplicationFreewriting != null)
				return false;
		} else if (!ApplicationFreewriting.equals(other.ApplicationFreewriting))
			return false;
		if (applicationDate == null) {
			if (other.applicationDate != null)
				return false;
		} else if (!applicationDate.equals(other.applicationDate))
			return false;
		if (applicationId == null) {
			if (other.applicationId != null)
				return false;
		} else if (!applicationId.equals(other.applicationId))
			return false;
		if (applicationStatus != other.applicationStatus)
			return false;
		if (memberId == null) {
			if (other.memberId != null)
				return false;
		} else if (!memberId.equals(other.memberId))
			return false;
		if (memberName == null) {
			if (other.memberName != null)
				return false;
		} else if (!memberName.equals(other.memberName))
			return false;
		if (memberPic == null) {
			if (other.memberPic != null)
				return false;
		} else if (!memberPic.equals(other.memberPic))
			return false;
		if (roleId == null) {
			if (other.roleId != null)
				return false;
		} else if (!roleId.equals(other.roleId))
			return false;
		if (teamId == null) {
			if (other.teamId != null)
				return false;
		} else if (!teamId.equals(other.teamId))
			return false;
		return true;
	}
}

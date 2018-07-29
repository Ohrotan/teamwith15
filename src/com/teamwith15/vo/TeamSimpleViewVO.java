//작성자 : 황규진
package com.teamwith15.vo;

import java.sql.Date;

public class TeamSimpleViewVO {
	private String teamId;
	private String teamPic;
	private String teamProjectName;
	private String projectCategoryId;
	private String teamName;
	private Date teamEndDate;
	private Date teamUpdateDate;
	private String memberId;
	private String memberName;
	public TeamSimpleViewVO() {
		super();
	}
	public TeamSimpleViewVO(String teamId, String teamPic, String teamProjectName, String projectCategoryId,
			String teamName, Date teamEndDate, Date teamUpdateDate, String memberId, String memberName) {
		super();
		this.teamId = teamId;
		this.teamPic = teamPic;
		this.teamProjectName = teamProjectName;
		this.projectCategoryId = projectCategoryId;
		this.teamName = teamName;
		this.teamEndDate = teamEndDate;
		this.teamUpdateDate = teamUpdateDate;
		this.memberId = memberId;
		this.memberName = memberName;
	}
	public String getTeamId() {
		return teamId;
	}
	public String getTeamPic() {
		return teamPic;
	}
	public String getTeamProjectName() {
		return teamProjectName;
	}
	public String getProjectCategoryId() {
		return projectCategoryId;
	}
	public String getTeamName() {
		return teamName;
	}
	public Date getTeamEndDate() {
		return teamEndDate;
	}
	public Date getTeamUpdateDate() {
		return teamUpdateDate;
	}
	public String getMemberId() {
		return memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}
	public void setTeamPic(String teamPic) {
		this.teamPic = teamPic;
	}
	public void setTeamProjectName(String teamProjectName) {
		this.teamProjectName = teamProjectName;
	}
	public void setProjectCategoryId(String projectCategoryId) {
		this.projectCategoryId = projectCategoryId;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public void setTeamEndDate(Date teamEndDate) {
		this.teamEndDate = teamEndDate;
	}
	public void setTeamUpdateDate(Date teamUpdateDate) {
		this.teamUpdateDate = teamUpdateDate;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String toString() {
		return "TeamSimpleViewVO [teamId=" + teamId + ", teamPic=" + teamPic + ", teamProjectName=" + teamProjectName
				+ ", projectCategoryId=" + projectCategoryId + ", teamName=" + teamName + ", teamEndDate=" + teamEndDate
				+ ", teamUpdateDate=" + teamUpdateDate + ", memberId=" + memberId + ", memberName=" + memberName + "]";
	}
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((memberId == null) ? 0 : memberId.hashCode());
		result = prime * result + ((memberName == null) ? 0 : memberName.hashCode());
		result = prime * result + ((projectCategoryId == null) ? 0 : projectCategoryId.hashCode());
		result = prime * result + ((teamEndDate == null) ? 0 : teamEndDate.hashCode());
		result = prime * result + ((teamId == null) ? 0 : teamId.hashCode());
		result = prime * result + ((teamName == null) ? 0 : teamName.hashCode());
		result = prime * result + ((teamPic == null) ? 0 : teamPic.hashCode());
		result = prime * result + ((teamProjectName == null) ? 0 : teamProjectName.hashCode());
		result = prime * result + ((teamUpdateDate == null) ? 0 : teamUpdateDate.hashCode());
		return result;
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TeamSimpleViewVO other = (TeamSimpleViewVO) obj;
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
		if (projectCategoryId == null) {
			if (other.projectCategoryId != null)
				return false;
		} else if (!projectCategoryId.equals(other.projectCategoryId))
			return false;
		if (teamEndDate == null) {
			if (other.teamEndDate != null)
				return false;
		} else if (!teamEndDate.equals(other.teamEndDate))
			return false;
		if (teamId == null) {
			if (other.teamId != null)
				return false;
		} else if (!teamId.equals(other.teamId))
			return false;
		if (teamName == null) {
			if (other.teamName != null)
				return false;
		} else if (!teamName.equals(other.teamName))
			return false;
		if (teamPic == null) {
			if (other.teamPic != null)
				return false;
		} else if (!teamPic.equals(other.teamPic))
			return false;
		if (teamProjectName == null) {
			if (other.teamProjectName != null)
				return false;
		} else if (!teamProjectName.equals(other.teamProjectName))
			return false;
		if (teamUpdateDate == null) {
			if (other.teamUpdateDate != null)
				return false;
		} else if (!teamUpdateDate.equals(other.teamUpdateDate))
			return false;
		return true;
	}
	
}

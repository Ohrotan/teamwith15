package com.teamwith15.dto;

public class RecruitDTO {
	private String recruitId;
	private String teamId;
	private int recruitPeopleNum;
	private String recruitPreference;
	private String recruitExplain;
	private String roleId;
	public RecruitDTO() {
		super();
	}
	public RecruitDTO(String recruitId, String teamId, int recruitPeopleNum, String recruitPreference,
			String recruitExplain, String roleId) {
		super();
		this.recruitId = recruitId;
		this.teamId = teamId;
		this.recruitPeopleNum = recruitPeopleNum;
		this.recruitPreference = recruitPreference;
		this.recruitExplain = recruitExplain;
		this.roleId = roleId;
	}
	public String getRecruitId() {
		return recruitId;
	}
	public String getTeamId() {
		return teamId;
	}
	public int getRecruitPeopleNum() {
		return recruitPeopleNum;
	}
	public String getRecruitPreference() {
		return recruitPreference;
	}
	public String getRecruitExplain() {
		return recruitExplain;
	}
	public String getRoleId() {
		return roleId;
	}
	public void setRecruitId(String recruitId) {
		this.recruitId = recruitId;
	}
	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}
	public void setRecruitPeopleNum(int recruitPeopleNum) {
		this.recruitPeopleNum = recruitPeopleNum;
	}
	public void setRecruitPreference(String recruitPreference) {
		this.recruitPreference = recruitPreference;
	}
	public void setRecruitExplain(String recruitExplain) {
		this.recruitExplain = recruitExplain;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public String toString() {
		return "RecruitDTO [recruitId=" + recruitId + ", teamId=" + teamId + ", recruitPeopleNum=" + recruitPeopleNum
				+ ", recruitPreference=" + recruitPreference + ", recruitExplain=" + recruitExplain + ", roleId="
				+ roleId + "]";
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RecruitDTO other = (RecruitDTO) obj;
		if (recruitExplain == null) {
			if (other.recruitExplain != null)
				return false;
		} else if (!recruitExplain.equals(other.recruitExplain))
			return false;
		if (recruitId == null) {
			if (other.recruitId != null)
				return false;
		} else if (!recruitId.equals(other.recruitId))
			return false;
		if (recruitPeopleNum != other.recruitPeopleNum)
			return false;
		if (recruitPreference == null) {
			if (other.recruitPreference != null)
				return false;
		} else if (!recruitPreference.equals(other.recruitPreference))
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

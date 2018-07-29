package com.teamwith15.vo;

public class RequireSkillTeamViewVO {
	private String team_id;
	private String role_id;
	private String skill_id;
	public RequireSkillTeamViewVO() {
		super();
	}
	public RequireSkillTeamViewVO(String team_id, String role_id, String skill_id) {
		super();
		this.team_id = team_id;
		this.role_id = role_id;
		this.skill_id = skill_id;
	}
	public String getTeam_id() {
		return team_id;
	}
	public String getRole_id() {
		return role_id;
	}
	public String getSkill_id() {
		return skill_id;
	}
	public void setTeam_id(String team_id) {
		this.team_id = team_id;
	}
	public void setRole_id(String role_id) {
		this.role_id = role_id;
	}
	public void setSkill_id(String skill_id) {
		this.skill_id = skill_id;
	}
	public String toString() {
		return "RequireSkillTeamViewVO [team_id=" + team_id + ", role_id=" + role_id + ", skill_id=" + skill_id + "]";
	}
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((role_id == null) ? 0 : role_id.hashCode());
		result = prime * result + ((skill_id == null) ? 0 : skill_id.hashCode());
		result = prime * result + ((team_id == null) ? 0 : team_id.hashCode());
		return result;
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RequireSkillTeamViewVO other = (RequireSkillTeamViewVO) obj;
		if (role_id == null) {
			if (other.role_id != null)
				return false;
		} else if (!role_id.equals(other.role_id))
			return false;
		if (skill_id == null) {
			if (other.skill_id != null)
				return false;
		} else if (!skill_id.equals(other.skill_id))
			return false;
		if (team_id == null) {
			if (other.team_id != null)
				return false;
		} else if (!team_id.equals(other.team_id))
			return false;
		return true;
	}
	
}

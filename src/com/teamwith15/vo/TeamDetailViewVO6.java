package com.teamwith15.vo;

import java.util.Date;

public class TeamDetailViewVO6 {
	private String commentId;
	private String commentContent;
	private Date commentUpdateDate;
	private String memberId;
	private String teamId;
	private String parentCommentId;
	private String memberPic;
	private String memberName;
	public TeamDetailViewVO6() {
		super();
	}
	public TeamDetailViewVO6(String commentId, String commentContent, Date commentUpdateDate, String memberId,
			String teamId, String parentCommentId, String memberPic, String memberName) {
		super();
		this.commentId = commentId;
		this.commentContent = commentContent;
		this.commentUpdateDate = commentUpdateDate;
		this.memberId = memberId;
		this.teamId = teamId;
		this.parentCommentId = parentCommentId;
		this.memberPic = memberPic;
		this.memberName = memberName;
	}
	public String getCommentId() {
		return commentId;
	}
	public void setCommentId(String commentId) {
		this.commentId = commentId;
	}
	public String getCommentContent() {
		return commentContent;
	}
	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}
	public Date getCommentUpdateDate() {
		return commentUpdateDate;
	}
	public void setCommentUpdateDate(Date commentUpdateDate) {
		this.commentUpdateDate = commentUpdateDate;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getTeamId() {
		return teamId;
	}
	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}
	public String getParentCommentId() {
		return parentCommentId;
	}
	public void setParentCommentId(String parentCommentId) {
		this.parentCommentId = parentCommentId;
	}
	public String getMemberPic() {
		return memberPic;
	}
	public void setMemberPic(String memberPic) {
		this.memberPic = memberPic;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	@Override
	public String toString() {
		return "TeamDetailViewVO6 [commentId=" + commentId + ", commentContent=" + commentContent
				+ ", commentUpdateDate=" + commentUpdateDate + ", memberId=" + memberId + ", teamId=" + teamId
				+ ", parentCommentId=" + parentCommentId + ", memberPic=" + memberPic + ", memberName=" + memberName
				+ "]";
	}
}

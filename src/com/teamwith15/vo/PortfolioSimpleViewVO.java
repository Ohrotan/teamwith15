package com.teamwith15.vo;

public class PortfolioSimpleViewVO {
	private String portfolioId;
	private String portfolioPic;
	private String memberId;
	private String memberName;
	private String portfolioTitle;
	private int portfolioBest;
	private String projectCategoryId;
	private String portfolioIntro;
	public PortfolioSimpleViewVO() {
		super();
	}
	public PortfolioSimpleViewVO(String portfolioId, String portfolioPic, String memberId, String memberName,
			String portfolioTitle, int portfolioBest, String projectCategoryId, String portfolioIntro) {
		super();
		this.portfolioId = portfolioId;
		this.portfolioPic = portfolioPic;
		this.memberId = memberId;
		this.memberName = memberName;
		this.portfolioTitle = portfolioTitle;
		this.portfolioBest = portfolioBest;
		this.projectCategoryId = projectCategoryId;
		this.portfolioIntro = portfolioIntro;
	}
	public String getPortfolioId() {
		return portfolioId;
	}
	public void setPortfolioId(String portfolioId) {
		this.portfolioId = portfolioId;
	}
	public String getPortfolioPic() {
		return portfolioPic;
	}
	public void setPortfolioPic(String portfolioPic) {
		this.portfolioPic = portfolioPic;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getPortfolioTitle() {
		return portfolioTitle;
	}
	public void setPortfolioTitle(String portfolioTitle) {
		this.portfolioTitle = portfolioTitle;
	}
	public int getPortfolioBest() {
		return portfolioBest;
	}
	public void setPortfolioBest(int portfolioBest) {
		this.portfolioBest = portfolioBest;
	}
	public String getProjectCategoryId() {
		return projectCategoryId;
	}
	public void setProjectCategoryId(String projectCategoryId) {
		this.projectCategoryId = projectCategoryId;
	}
	public String getPortfolioIntro() {
		return portfolioIntro;
	}
	public void setPortfolioIntro(String portfolioIntro) {
		this.portfolioIntro = portfolioIntro;
	}
	@Override
	public String toString() {
		return "PortfolioSimpleViewVO [portfolioId=" + portfolioId + ", portfolioPic=" + portfolioPic + ", memberId="
				+ memberId + ", memberName=" + memberName + ", portfolioTitle=" + portfolioTitle + ", portfolioBest="
				+ portfolioBest + ", projectCategoryId=" + projectCategoryId + ", portfolioIntro=" + portfolioIntro
				+ "]";
	}
}

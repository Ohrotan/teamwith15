package com.teamwith15.dto;

public class PortfolioContentDTO {
	private String portfolioId;
	private String elementId;
	private int elementOrder;
	private String layoutId;
	private String elementName;
	private String elementContent;
	public PortfolioContentDTO() {
		super();
	}
	public PortfolioContentDTO(String portfolioId, String elementId, int elementOrder, String layoutId,
			String elementName, String elementContent) {
		super();
		this.portfolioId = portfolioId;
		this.elementId = elementId;
		this.elementOrder = elementOrder;
		this.layoutId = layoutId;
		this.elementName = elementName;
		this.elementContent = elementContent;
	}
	public String getPortfolioId() {
		return portfolioId;
	}
	public void setPortfolioId(String portfolioId) {
		this.portfolioId = portfolioId;
	}
	public String getElementId() {
		return elementId;
	}
	public void setElementId(String elementId) {
		this.elementId = elementId;
	}
	public int getElementOrder() {
		return elementOrder;
	}
	public void setElementOrder(int elementOrder) {
		this.elementOrder = elementOrder;
	}
	public String getLayoutId() {
		return layoutId;
	}
	public void setLayoutId(String layoutId) {
		this.layoutId = layoutId;
	}
	public String getElementName() {
		return elementName;
	}
	public void setElementName(String elementName) {
		this.elementName = elementName;
	}
	public String getElementContent() {
		return elementContent;
	}
	public void setElementContent(String elementContent) {
		this.elementContent = elementContent;
	}
	@Override
	public String toString() {
		return "PortfolioContentDTO [portfolioId=" + portfolioId + ", elementId=" + elementId + ", elementOrder="
				+ elementOrder + ", layoutId=" + layoutId + ", elementName=" + elementName + ", elementContent="
				+ elementContent + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((elementContent == null) ? 0 : elementContent.hashCode());
		result = prime * result + ((elementId == null) ? 0 : elementId.hashCode());
		result = prime * result + ((elementName == null) ? 0 : elementName.hashCode());
		result = prime * result + elementOrder;
		result = prime * result + ((layoutId == null) ? 0 : layoutId.hashCode());
		result = prime * result + ((portfolioId == null) ? 0 : portfolioId.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PortfolioContentDTO other = (PortfolioContentDTO) obj;
		if (elementContent == null) {
			if (other.elementContent != null)
				return false;
		} else if (!elementContent.equals(other.elementContent))
			return false;
		if (elementId == null) {
			if (other.elementId != null)
				return false;
		} else if (!elementId.equals(other.elementId))
			return false;
		if (elementName == null) {
			if (other.elementName != null)
				return false;
		} else if (!elementName.equals(other.elementName))
			return false;
		if (elementOrder != other.elementOrder)
			return false;
		if (layoutId == null) {
			if (other.layoutId != null)
				return false;
		} else if (!layoutId.equals(other.layoutId))
			return false;
		if (portfolioId == null) {
			if (other.portfolioId != null)
				return false;
		} else if (!portfolioId.equals(other.portfolioId))
			return false;
		return true;
	}
}

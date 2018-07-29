package com.teamwith15.dao;

import java.util.List;

import com.teamwith15.dto.PortfolioContentDTO;

public interface PortfolioContentDAO {
	
	
	public int addPortfolioContent(PortfolioContentDTO portfolioContent) ;
	public int updatePortfolioContent(PortfolioContentDTO portfolioContent);
	public int removePortfolioContentByPortfolioContentId(String elementId);
	public int removePortfolioContentByPortfolioId(String portfolioId) ;
	public List<PortfolioContentDTO> searchPortfolioList();
	public List<PortfolioContentDTO> searchPortfolioContentByPortfolioId(String portfolioId);
	public PortfolioContentDTO searchPortfolioContentByElementId(String elementId) ;
}


package com.teamwith15.dao;

import java.util.List;

import com.teamwith15.dto.PortfolioDTO;

public interface PortfolioDAO {
	
	
	public int addPortfolio(PortfolioDTO portfolio);
	public int modifyPortfolio(PortfolioDTO portfolio) ;
	public int removePortfolioByPortfolioId(String portfolioId) ;
	public int removePortfolioByMemberId(String memberId);
	public List<PortfolioDTO> searchPortfolioList();
	public PortfolioDTO searchPortfolioByPortfolioId(String portfolioId);
	public List<PortfolioDTO> searchPortfolioByMemberId(String memberId);
	public int searchPortfolioCountByMemberId(String memberId) ;
	public int searchBestPortfolioCountByMemberId(String memberId) ;
}

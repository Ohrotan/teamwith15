package com.teamwith15.dao;

import java.util.List;
import java.util.Map;

import com.teamwith15.dto.FaqDTO;

public interface FaqDAO {
	public int insertFaq(FaqDTO faq) throws Exception;
	public int deleteFaqByFaqId(String faqId) throws Exception;
	public int deleteFaqByTeamId(String teamId) throws Exception;
	public int updateFaqQuestion(Map<String, Object> map) throws Exception;
	public int updateFaqAnswer(Map<String, Object> map) throws Exception;
	public int updateFaq(FaqDTO faq) throws Exception;
	public List<FaqDTO> searchFaqByFaqId(String faqId) throws Exception;
	public List<FaqDTO> searchFaqByTeamId(String teamId) throws Exception;
	public List<FaqDTO> searchFaq() throws Exception;
}

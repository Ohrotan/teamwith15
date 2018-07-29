package com.teamwith15.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.teamwith15.dto.FaqDTO;

public class FaqService {
	private SqlSession session;
	private static String namespace = "com.teamwith.mapper.FaqMapper";
	
	public void insertFaq(FaqDTO faq) throws Exception {
		session.insert(namespace + ".insert", faq);
	}
	
	public void b(String faqId) throws Exception {
		session.delete(namespace + "b", faqId);
	}
	
	public void c(String teamId) throws Exception {
		session.delete(namespace + "c", teamId);
	}
	
	public void d(String faqQuestion, String faqId) throws Exception {
		Map<String, String> map = new HashMap<String, String>();
		map.put("faqQuestion", faqQuestion);
		map.put("faqId", faqId);
		session.update(namespace + "d", map);
	}
	
	public void e(String faqAnswer, String faqId) throws Exception {
		Map<String, String> map = new HashMap<String, String>();
		map.put("faqAnswer", faqAnswer);
		map.put("faqId", faqId);
		session.update(namespace + "e", map);
	}
	
	public void f(FaqDTO faq) throws Exception {
		session.update(namespace + "f", faq);
	}
	
	public List<FaqDTO> g(String faqId) throws Exception {
		return session.selectList(namespace + "g", faqId);
	}
	
	public List<FaqDTO> h(String teamId) throws Exception {
		return session.selectList(namespace + "h", teamId);
	}

}

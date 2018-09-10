package com.spring.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.spring.dao.TestDAO;
import com.spring.vo.TestVO;

@Service
public class TestServiceImpl implements TestService {
	
	@Inject
	private TestDAO dao;
	
	@Override
	public List<TestVO>selectTest() throws Exception {
		
		return dao.selectTest();
	}

}
package com.spring.dao;

import java.util.List;

import com.spring.vo.TestVO;

public interface TestDAO {
	
	public List<TestVO>selectTest() throws Exception;

}

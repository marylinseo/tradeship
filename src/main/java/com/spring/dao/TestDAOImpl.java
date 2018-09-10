package com.spring.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.spring.vo.TestVO;

@Repository
public class TestDAOImpl implements TestDAO{
	
	@Inject
	private SqlSession sqlSession;
	
	private static final String Namespace= "com.spring.mapper.memberMapper";
	
	@Override
	public List<TestVO>selectTest() throws Exception {
		return sqlSession.selectList(Namespace+".selectTest");
	}

}

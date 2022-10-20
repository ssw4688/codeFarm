package com.farmer.app.memberProgram.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.farmer.app.memberProgram.vo.MemberProgramVO;
import com.farmer.mybatis.config.MyBatisConfig;

public class MemberProgramDAO {
	 SqlSessionFactory sqlSessionFactory = MyBatisConfig.getSqlsessionFactory();
	   SqlSession sqlSession;
	   
	   public MemberProgramDAO() {
		   sqlSession = sqlSessionFactory.openSession(true);
	}
	   //신청하기
	   public void insert(MemberProgramVO memberProgramVO) {
		   sqlSession.insert("memberProgram.insert", memberProgramVO);
	   }
}

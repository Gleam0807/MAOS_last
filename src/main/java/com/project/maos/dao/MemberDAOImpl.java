package com.project.maos.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.maos.vo.MemberVO;


@Repository
public class MemberDAOImpl implements MemberDAO {
	
	@Autowired
	SqlSession sql;
	// 회원가입
	private String namespace = "com.project.maos.mappers.memberMapper";
	@Override
	public void register(MemberVO vo) throws Exception {
		sql.insert(namespace+".register", vo);
	}

	@Override
	public MemberVO login(MemberVO vo) throws Exception {
		
		return sql.selectOne(namespace+".login", vo);
	}

	@Override
	public void executiveregister(MemberVO vo) throws Exception {
		sql.insert(namespace+".executiveregister",vo);
		
	}


	
}










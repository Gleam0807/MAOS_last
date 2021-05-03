package com.project.maos.service;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.maos.dao.MemberDAO;
import com.project.maos.vo.MemberVO;




@Service
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	MemberDAO dao;
	
	@Override
	public void register(MemberVO vo) throws Exception {
		
		dao.register(vo);
		
	}

	@Override
	public MemberVO login(MemberVO vo) throws Exception {
		return dao.login(vo);
	}

	@Override
	public void executiveregister(MemberVO vo) throws Exception {
		dao.executiveregister(vo);
		
	}

	
	
}

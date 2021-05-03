package com.project.maos.service;

import com.project.maos.vo.MemberVO;


public interface MemberService {

	public void register(MemberVO vo) throws Exception;
	
	public MemberVO login(MemberVO vo) throws Exception;
	
	public void	executiveregister(MemberVO vo)throws Exception;
	
}

package com.project.maos.dao;

import com.project.maos.vo.MemberVO;




public interface MemberDAO {
	
	// 회원가입
	public void register(MemberVO vo) throws Exception;
	
	//로그인
	public MemberVO login(MemberVO vo) throws Exception;
	
	public void	executiveregister(MemberVO vo)throws Exception;
}

package com.project.maos.dao;

import java.util.List;

import com.project.maos.vo.NoticeVO;

public interface NoticeDAO {
	
	
	// 게시물 작성
	public void write(NoticeVO vo) throws Exception;

	// 게시물 조회
	public NoticeVO view(int noticeid) throws Exception;
	
	// 게시물 수정
	public void modify(NoticeVO vo) throws Exception;
	
	// 게시뮬 삭제
	public void delete(int noticeid) throws Exception;
	
	// 게시물 총 갯수
	public int count() throws Exception;	

		
	// 게시물 목록 + 페이징 + 검색
	public List<NoticeVO> list(
			int displayPost, int postNum, String searchType, String keyword) throws Exception;
	
	// 게시물 총 갯수 + 검색 적용
	public int searchCount(String searchType, String keyword) throws Exception;	
		
		
}

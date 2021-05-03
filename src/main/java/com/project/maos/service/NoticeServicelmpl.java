package com.project.maos.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.project.maos.dao.NoticeDAO;
import com.project.maos.vo.NoticeVO;



@Service
public class NoticeServicelmpl implements NoticeService {

	@Inject
	private NoticeDAO dao;
	

	// 게시물 작성
	@Override
	public void write(NoticeVO vo) throws Exception {
		
		dao.write(vo);
	}

	// 게시물 조회
	@Override
	public NoticeVO view(int noticeid) throws Exception {

		return dao.view(noticeid);
	}

	// 게시물 수정
	@Override
	public void modify(NoticeVO vo) throws Exception {
		
		dao.modify(vo);
	}

	// 게시물 삭제
	@Override
	public void delete(int noticeid) throws Exception {
		dao.delete(noticeid);
	}

	
	
	// 게시물 총 갯수
	@Override
	public int count() throws Exception {
		return dao.count();
	}

	
	
	// 게시물 목록 + 페이징 + 검색
	@Override
	public List<NoticeVO> list(
			int displayPost, int postNum, String searchType, String keyword) throws Exception {
		return  dao.list(displayPost, postNum, searchType, keyword);
	}
	
	// 게시물 총 갯수
	@Override
	public int searchCount(String searchType, String keyword) throws Exception {
		return dao.searchCount(searchType, keyword);
	}
}

package com.notice.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.common.Pagination;
import com.notice.domain.NoticeBoardVO;
import com.notice.persistence.NoticeBoardDAO;


@Service
public class NoticeBoardServiceImpl implements NoticeBoardService {

	@Inject
	private NoticeBoardDAO dao;
	

	@Override
	public void regist(NoticeBoardVO vo) throws Exception {
		dao.noticeCreate(vo);
	}

	@Override
	public List<NoticeBoardVO> listAll() throws Exception {
		return dao.listAll();
	}

	@Override
	public NoticeBoardVO noticeRead(int noticeid) throws Exception {
		return dao.noticeRead(noticeid);
		
	}

	@Override
	public void modify(NoticeBoardVO board) throws Exception {
		dao.noticeUpdate(board);
	}

	@Override
	public void remove(int noticeid) throws Exception {
		dao.delete(noticeid);
	}

	//총 게시글 개수 확인
	@Override
	public int getBoardListCnt() throws Exception {
		return dao.getBoardListCnt();
	}

	@Override
	public List<NoticeBoardVO> getBoardList(Pagination pagination) throws Exception {
		return dao.getBoardList(pagination);
	}


}

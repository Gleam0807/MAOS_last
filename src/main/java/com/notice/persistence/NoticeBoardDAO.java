package com.notice.persistence;

import java.util.List;

import com.common.Pagination;
import com.notice.domain.NoticeBoardVO;


public interface NoticeBoardDAO {


	public List<NoticeBoardVO> listAll() throws Exception;

	public void noticeCreate(NoticeBoardVO vo) throws Exception;

	public NoticeBoardVO noticeRead(int noticeid) throws Exception;

	public void noticeUpdate(NoticeBoardVO board) throws Exception;

	public void delete(int noticeid) throws Exception;

	public int getBoardListCnt() throws Exception;

	public List<NoticeBoardVO> getBoardList(Pagination pagination) throws Exception;
	

}
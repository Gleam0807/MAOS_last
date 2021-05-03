package com.notice.service;

import java.util.List;

import com.common.Pagination;
import com.notice.domain.NoticeBoardVO;


public interface NoticeBoardService {

	  public void regist(NoticeBoardVO vo) throws Exception;

	  public List<NoticeBoardVO> listAll() throws Exception;

	  public NoticeBoardVO noticeRead(int noticeid) throws Exception;

	  public void modify(NoticeBoardVO board) throws Exception;
	  
	  public void remove(int noticeid) throws Exception;
	  
	  public int getBoardListCnt() throws Exception;

	  public List<NoticeBoardVO> getBoardList(Pagination pagination) throws Exception;


}


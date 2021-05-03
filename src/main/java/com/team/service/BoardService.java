package com.team.service;

import java.util.List;

import com.common.Search;
import com.team.domain.BoardVO;


public interface BoardService {

	  public void regist(BoardVO board) throws Exception;

	  public BoardVO read(int applyid) throws Exception;

	  public void modify(BoardVO board) throws Exception;
	  
	  public void remove(int applyid) throws Exception;

	  public List<BoardVO> workFlow() throws Exception;

	  public int getBoardListCnt(Search search) throws Exception;

	  public List<BoardVO> getBoardList(Search search) throws Exception;
	  
}




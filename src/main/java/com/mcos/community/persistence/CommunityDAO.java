package com.mcos.community.persistence;

import java.util.List;

import com.mcos.community.common.Search;
import com.mcos.community.domain.CommunityVO;

public interface CommunityDAO {
	
	//글 작성
	public void create(CommunityVO vo) throws Exception;
	
	//글 상세보기
	public CommunityVO read(Integer comid) throws Exception;
	
	//글 수정
	public void update(CommunityVO vo) throws Exception;
	
	//글 조회수
	void updateReads(Integer comid) throws Exception;
	
	//글 삭제
	public void delete(Integer comid) throws Exception;
	
	//글 목록
	public List<CommunityVO> list(Search search) throws Exception;
	
	//개시물의 총 갯수
	public int listCnt(Search search) throws Exception;
	
}

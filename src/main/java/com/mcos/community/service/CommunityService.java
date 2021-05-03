package com.mcos.community.service;

import java.util.List;

import com.mcos.community.common.Search;
import com.mcos.community.domain.CommunityVO;

public interface CommunityService {
	
	public void regist(CommunityVO comVO) throws Exception;
	
	public CommunityVO read(Integer comid) throws Exception;
	
	public void modify(CommunityVO comVO) throws Exception;
	
	public void remove(Integer comid) throws Exception;
	
	public List<CommunityVO> list(Search search) throws Exception;
	
	public int listCnt(Search search) throws Exception;

}

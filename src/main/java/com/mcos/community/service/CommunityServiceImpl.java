package com.mcos.community.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mcos.community.common.Search;
import com.mcos.community.domain.CommunityVO;
import com.mcos.community.persistence.CommunityDAO;

@Service
public class CommunityServiceImpl implements CommunityService {

	@Autowired
	private CommunityDAO dao;
	
	@Override
	public void regist(CommunityVO comVO) throws Exception{
		dao.create(comVO);
	}
	
	@Override
	public CommunityVO read(Integer comid) throws Exception{
		dao.updateReads(comid);
		return dao.read(comid);
	}
	
	@Override
	public void modify(CommunityVO comVO) throws Exception{
		dao.update(comVO);
	}
	
	@Override
	public void remove(Integer comid) throws Exception{
		dao.delete(comid);
	}
	
	@Override
	public List<CommunityVO> list(Search search) throws Exception {
		return dao.list(search);
	}

	@Override
	public int listCnt(Search search) throws Exception {
		return dao.listCnt(search);
	}


}

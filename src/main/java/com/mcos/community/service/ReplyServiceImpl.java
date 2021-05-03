package com.mcos.community.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mcos.community.domain.ReplyVO;
import com.mcos.community.persistence.ReplyDAO;


@Service
public class ReplyServiceImpl implements ReplyService {

	@Autowired
	private ReplyDAO dao;

	@Override
	public List<ReplyVO> readReply(int comid) throws Exception {
		return dao.readReply(comid);
	}

	@Override
	public void createReply(ReplyVO replyVO) throws Exception {
		dao.createReply(replyVO);
		
	}

	@Override
	public void updateReply(ReplyVO replyVO) throws Exception {
		dao.updateReply(replyVO);
		
	}

	@Override
	public void deleteReply(int replyid) throws Exception {
		dao.deleteReply(replyid);
		
	}

	
	

	

}

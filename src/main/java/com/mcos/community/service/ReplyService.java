package com.mcos.community.service;

import java.util.List;

import com.mcos.community.domain.ReplyVO;

public interface ReplyService {
	
	//댓글 리스트
	public List<ReplyVO> readReply(int comid) throws Exception;
	
	//댓글 작성
	public void createReply(ReplyVO replyVO) throws Exception;
	
	//댓글 수정
	public void updateReply(ReplyVO replyVO) throws Exception;
	
	//댓글 삭제
	public void deleteReply(int replyid) throws Exception;
	
	

}

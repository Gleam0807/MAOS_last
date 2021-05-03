package com.mcos.community.persistence;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mcos.community.domain.ReplyVO;


@Repository
public class ReplyDAOImpl implements ReplyDAO {

	private static String namespace = "com.mcos.reply.replyMapper";
	
	@Autowired
	private SqlSession session;

	@Override
	public List<ReplyVO> readReply(int comid) throws Exception {
		return session.selectList(namespace + ".readReply", comid);
	}

	@Override
	public void createReply(ReplyVO replyVO) throws Exception {
		session.insert(namespace +".createReply", replyVO);
		
	}

	@Override
	public void updateReply(ReplyVO replyVO) throws Exception {
		session.update(namespace + ".updateReply", replyVO);
		
	}

	@Override
	public void deleteReply(int replyid) throws Exception {
		session.delete(namespace + ".deleteReply", replyid);
		
	}

	
	
	

}

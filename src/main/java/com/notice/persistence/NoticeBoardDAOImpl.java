
package com.notice.persistence;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;

import org.springframework.stereotype.Repository;

import com.common.Pagination;
import com.notice.domain.NoticeBoardVO;



@Repository
public class NoticeBoardDAOImpl  implements NoticeBoardDAO {

	@Inject
	private SqlSession session;
	
	

	private static String namespace = "com.team.mappers.BoardMapper";


	@Override
	public List<NoticeBoardVO> listAll() throws Exception {
		return session.selectList(namespace + ".noticeBoardListAll");
	}


	@Override
	public void noticeCreate(NoticeBoardVO vo) {
		session.insert(namespace+".noticeCreate", vo);
	}


	@Override
	public NoticeBoardVO noticeRead(int noticeid) throws Exception {
		return session.selectOne(namespace+".noticeRead", noticeid);
		
	}


	@Override
	public void noticeUpdate(NoticeBoardVO board) throws Exception {
		session.update(namespace+".noticeUpdate", board);
	}


	@Override
	public void delete(int noticeid) throws Exception {
		session.delete(namespace+".noticeDelete", noticeid);
	}
	
	//총 게시글 개수 확인
	@Override
	public int getBoardListCnt() throws Exception {
		return session.selectOne(namespace+".getNoticeBoardListCnt");
	}

	@Override
	public List<NoticeBoardVO> getBoardList(Pagination pagination) throws Exception {
	Map <String,Object> parameters = new HashMap<String,Object> ();
	
	parameters.put("startList",  pagination.getStartList());
	parameters.put("listSize",  pagination.getListSize());
	
	return session.selectList(namespace+".getNoticeBoardList",parameters);

	}




}



package com.team.persistence;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;

import org.springframework.stereotype.Repository;

import com.common.Pagination;
import com.common.Search;
import com.notice.domain.NoticeBoardVO;
import com.team.domain.BoardVO;



@Repository
public class BoardDAOImpl  implements BoardDAO {

	@Inject
	private SqlSession session;
	
	

	private static String namespace = "com.team.mappers.BoardMapper";

	@Override
	public void create(BoardVO vo) throws Exception {
		session.insert(namespace+".create", vo);

	}


	@Override
	public BoardVO read(int applyid) throws Exception {
		return session.selectOne(namespace + ".read", applyid);
	}


	@Override
	public void delete(int applyid) throws Exception {
		session.delete(namespace+".delete", applyid);

	}

	@Override
	public void update(BoardVO vo) throws Exception {
		session.update(namespace+".update", vo);
	}
	
	@Override
	public List<BoardVO> workFlow() throws Exception {
		return session.selectList(namespace + ".workFlow2");
	}


	public int getBoardListCnt(Search search) throws Exception {
		return session.selectOne(namespace+".getBoardListCnt",search);
	}


	public List<BoardVO> getBoardList(Search search) throws Exception{
		//return session.selectList(namespace + ".workFlow2");
	Map <String,Object> parameters = new HashMap<String,Object> ();
	parameters.put("searchType",  search.getSearchType());
	parameters.put("keyword",  search.getKeyword());
	parameters.put("startList",  search.getStartList());
	parameters.put("listSize",  search.getListSize());
	
	return session.selectList(namespace+".getBoardList",parameters);
	
	}
	
	

	


}


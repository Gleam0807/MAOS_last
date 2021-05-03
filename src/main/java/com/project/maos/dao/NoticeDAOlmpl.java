package com.project.maos.dao;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.project.maos.vo.NoticeVO;

@Repository
public class NoticeDAOlmpl implements NoticeDAO {

	@Inject
	private SqlSession sql;
	
	private static String namespace = "com.project.maos.mappers.Notice";


	// 게시물작성
	@Override
	public void write(NoticeVO vo) throws Exception {
			
		sql.insert(namespace + ".write", vo);
	}

	// 게시물 조회
	@Override
	public NoticeVO view(int noticeid) throws Exception {
	
		return sql.selectOne(namespace + ".view", noticeid);
	}

	// 게시물 수정
	@Override
	public void modify(NoticeVO vo) throws Exception {
		sql.update(namespace + ".modify", vo);
	}

	// 게시물 삭제
	@Override
	public void delete(int noticeid) throws Exception {
		sql.delete(namespace + ".delete", noticeid);
	}

	
	
	// 게시물 총 갯수
	@Override
	public int count() throws Exception {
		return sql.selectOne(namespace + ".count");	
	}

	
	
	
	// 게시물 목록 + 페이징 + 검색
	@Override
	public List<NoticeVO> list(
			int displayPost, int postNum, String searchType, String keyword) throws Exception {

		HashMap<String, Object> data = new HashMap<String, Object>();
		
		data.put("displayPost", displayPost);
		data.put("postNum", postNum);
		
		data.put("searchType", searchType);
		data.put("keyword", keyword);
		
		return sql.selectList(namespace + ".list", data);
	}
	
	// 게시물 총 갯수 + 검색 적용
	@Override
	public int searchCount(String searchType, String keyword) throws Exception {
		
		HashMap<String, Object> data = new HashMap<String, Object>();
		
		data.put("searchType", searchType);
		data.put("keyword", keyword);
		
		return sql.selectOne(namespace + ".searchCount", data);	
	}

		

}

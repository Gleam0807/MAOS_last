package com.mcos.community.persistence;

import java.util.List;


import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mcos.community.common.Search;
import com.mcos.community.domain.CommunityVO;

@Repository
public class CommunityDAOImpl implements CommunityDAO {

	@Autowired
	private SqlSession session;
	
	private static String namespace = "com.mcos.communityMapper";
	
	@Override
	public void create(CommunityVO vo) throws Exception{		//글 작성
		session.insert(namespace+".create", vo);
	}
	
	@Override
	public CommunityVO read(Integer comid) throws Exception{	//글 상세보기
		return session.selectOne(namespace+".read", comid);
	}
	
	@Override
	public void update(CommunityVO vo) throws Exception{		//글 수정
		session.update(namespace+".update", vo);
	}
	
	@Override
	public void updateReads(Integer comid) throws Exception {	//글 조회수
		session.update(namespace +".updateReads", comid);
	}

	
	@Override
	public void delete(Integer comid) throws Exception{			//글 삭제
		session.delete(namespace+".delete", comid);
	}
	
	@Override
	public List<CommunityVO> list(Search search) throws Exception {	//글 목록
		return session.selectList(namespace+".list", search);
	}

	@Override
	public int listCnt(Search search) throws Exception {			//개시글의 총 갯수
		return session.selectOne(namespace +".listCnt", search);
	}

}

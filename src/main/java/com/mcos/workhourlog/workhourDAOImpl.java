package com.mcos.workhourlog;


import java.util.Date;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class workhourDAOImpl implements workhourDAO {
	
	@Inject
	private SqlSession session;
	
	private static String namespace = "com.mcos.mappers.workhourMapper";

	@Override
	public WorkhourVO read(Date startHour,String ok) throws Exception {
		
		return session.selectOne(namespace + ".read", startHour);
	}

	@Override
	public int update(WorkhourVO vo) throws Exception {
		
		return session.update(namespace + ".update" , vo);
		
	}

	@Override
	public int create(WorkhourVO vo) throws Exception {
		
		return session.insert(namespace +".create",vo);
		
	}

}

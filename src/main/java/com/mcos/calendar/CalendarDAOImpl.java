package com.mcos.calendar;


import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CalendarDAOImpl implements CalendarDAO {
	
	private static final String namespace ="com.mcos.mappers.workhourMapper";
	
	@Autowired
	private SqlSession session;

	@Override
	public List<CalendarVO> calcom(String current) throws Exception {
	
		return session.selectList(namespace + ".calcom", current);
	}

}

package com.mcos.calendar;


import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalendarServiceImpl implements CalendarService { 
	
	@Autowired
	private CalendarDAO dao;
	
	@Override
	public List<CalendarVO> calcom(String current) throws Exception {
		
		return dao.calcom(current);
	}


}

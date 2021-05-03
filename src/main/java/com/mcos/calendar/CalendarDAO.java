package com.mcos.calendar;


import java.util.List;

public interface CalendarDAO {
	
	public List<CalendarVO> calcom(String current) throws Exception;
	
}

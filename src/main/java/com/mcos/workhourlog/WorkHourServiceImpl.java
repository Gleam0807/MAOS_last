package com.mcos.workhourlog;

import java.util.Date;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class WorkHourServiceImpl implements WorkHourService{
	
	@Inject
	 workhourDAO dao;

	@Override
	public WorkhourVO read(Date startHour,String ok) throws Exception {
		
		return dao.read(startHour,ok);
	}

	@Override
	public int update(WorkhourVO vo) throws Exception {
		return dao.update(vo);
		
	}

	@Override
	public int create(WorkhourVO vo) throws Exception {
		
		return dao.create(vo);
		
	}

	
	

}

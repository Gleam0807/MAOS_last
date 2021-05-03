package com.mcos.workhourlog;

import java.util.Date;

public interface workhourDAO {
	
  public WorkhourVO read (Date startHour,String ok) throws Exception;
  
  public int update(WorkhourVO vo) throws Exception;
 
  public int create (WorkhourVO vo) throws Exception;

}

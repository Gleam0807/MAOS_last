package com.mcos.workhourlog;

 

 

import java.sql.Timestamp;

import org.springframework.stereotype.Component;

@Component
public class WorkhourVO {
   private Timestamp startHour;
   private Timestamp endHour;
   private String userid;
   private String type;
   
   
   public Timestamp getStartHour() {
	   return startHour;
   }
   
   public void setStartHour(long startTime) {
	   this.startHour = new Timestamp(startTime);
   }
   
   public Timestamp getEndHour() {
   return endHour;
   }
   
   public void setEndHour(long endTime) {
	   this.endHour = new Timestamp(endTime);
   }
   
   public String getUserid() {
	   return userid;
   }
   
   public void setUserid(String userid) {
	   this.userid = userid;
   }

   public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

@Override
   public String toString() {
	   return "workhourVO [startHour=" + startHour + ",endHour=" + endHour + ",userid=" + userid + "]" ;
   }
   
   
}

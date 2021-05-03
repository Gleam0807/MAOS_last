package com.mcos.workhourlog;

 
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value="/")
public class workController {
	
	private static final  Logger logger = LoggerFactory.getLogger(workController.class);
	
	@Inject
	WorkHourService service;
	
	@RequestMapping( value="/WHL" ,method = RequestMethod.GET)
	
	public String WHL() throws Exception{		 
		return "WHL";
	}
	
	@RequestMapping( value="/SWHL" , method = RequestMethod.POST)	
	
		public String procSWHL(@RequestParam("userid") String uid,
				@RequestParam("startHour") String sHour) throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd kk:mm");
		Calendar cal = Calendar.getInstance();

		String datestr = sdf.format(cal.getTime());
		 
		if(sHour.length()==4) sHour ="0"+sHour;
		String strStartTime =datestr.substring(0, 11) + sHour ; //현재 날짜와 startHour(String) 결합해서 String으로 
		//System.out.println(strStartTime);
		Date sqlStartTime = (Date)sdf.parse(strStartTime);
		//System.out.println(sqlStartTime); 
				
		WorkhourVO vo = new WorkhourVO();
		vo.setUserid(uid);		
		vo.setStartHour(sqlStartTime.getTime());
		//System.out.println(vo.getStartHour()); 
		if(service.create(vo)> 0) {
			//성공했을때 다음 페이지 이동
			//System.out.println("성공");
		}else {
			//실패시 alert으로 표시하기
			//System.out.println("실패");
			
		}
		
		return "WHL";
	}
	
	@RequestMapping( value="/EWHL" , method = RequestMethod.POST)	
	public String procEWHL(@RequestParam("userid") String uid,
			@RequestParam("endHour") String eHour
			,@RequestParam("type") String type ) throws Exception {
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd kk:mm");
	Calendar cal = Calendar.getInstance();

	String datestr = sdf.format(cal.getTime());
	//System.out.println(datestr);
	String strEndTime =datestr.substring(0, 11) + eHour ;
	//System.out.println(strEndTime);
	Date sqlEndTime = (Date)sdf.parse(strEndTime);	 
	//System.out.println(sqlEndTime); 
	
	WorkhourVO vo = new WorkhourVO();
	vo.setUserid(uid);		
	vo.setEndHour(sqlEndTime.getTime());
	vo.setType(type);
	//System.out.println(vo.getEndHour());
	if(service.update(vo)> 0) {
		//성공했을때 다음 페이지 이동
		//System.out.println("성공");
	}else {
		//실패시 alert으로 표시하기
		//System.out.println("실패");
		
	}
	return "WHL";

	}

	
}

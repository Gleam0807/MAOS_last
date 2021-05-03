package com.mcos.calendar;





import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;




@Controller
public class CalendarController {
	
	@Autowired
	CalendarService sv;

	@ResponseBody
	@RequestMapping(value="/Fullcalendar", method =  RequestMethod.GET)
	public List<CalendarVO> calcom(@RequestParam(value="current",required=false,defaultValue="2021-01-00") String current) throws Exception{

		List<CalendarVO> list = null;
		
		list = sv.calcom(current);
		//System.out.println(list.get(0));

		return list;
	}
	@RequestMapping(value = "/full", method = RequestMethod.GET)
	public String index() {
		return "full";
	}
	

	
}

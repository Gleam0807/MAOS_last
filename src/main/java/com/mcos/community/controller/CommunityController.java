package com.mcos.community.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mcos.community.common.Search;
import com.mcos.community.domain.CommunityVO;
import com.mcos.community.domain.ReplyVO;
import com.mcos.community.service.CommunityService;
import com.mcos.community.service.ReplyService;

@Controller //컨트롤러임을 명시
@RequestMapping("/") //주소 패턴
public class CommunityController {
	
	private static final Logger logger = LoggerFactory.getLogger(CommunityController.class);
	
	@Autowired //주입 명시
	CommunityService service; //Service호출을 위한 객체생성
	@Autowired //주입 명시
	ReplyService replyService; //Service호출을 위한 객체생성
	
	
	@RequestMapping(value = "/Community/CommunityList", method=RequestMethod.GET) //주소 호출 명시, 호출하려는 주소 와 REST 방식설정
	public String list(Model model
			, @RequestParam(required = false, defaultValue = "1")int page
			, @RequestParam(required = false, defaultValue = "1")int range
			, @RequestParam(required = false, defaultValue = "title")String searchType
			, @RequestParam(required = false)String keyword
			) throws Exception { //메소드 인자값은 model 인터페이스(jsp 전달)
		
		Search search = new Search();
		search.setSearchType(searchType);
		search.setKeyword(keyword);
		
		
		//전체 게시글 개수
		int listCnt = service.listCnt(search);
		
//		Pagination 객체생성 및 페이징 정보 셋팅
//		Pagination pagination = new Pagination();
		search.pageInfo(page, range, listCnt);
		model.addAttribute("Pagination", search);
		model.addAttribute("list",service.list(search)); //jsp에 서비스 호출
		return "/Community/CommunityList";
	}
	
	@RequestMapping(value ="/Community/CommunityRegist", method=RequestMethod.GET) //GET방식으로 페이지 호출
	public void registGET(CommunityVO comVO, Model model) throws Exception{
		
	}
	
	@RequestMapping(value ="/Community/CommunityRegist", method=RequestMethod.POST) //POST방식으로 페이지 호출
	public String registPOST(CommunityVO comVO,ReplyVO replyVO, RedirectAttributes rttr) throws Exception{ //인자값으로 REDIRECT사용
		service.regist(comVO); //글 작성 서비스 호출
		return "redirect:/Community/CommunityList"; //작성이 완료된 후, 목록페이지로 리턴
	}
	
	
	@RequestMapping(value ="/Community/CommunityRead", method=RequestMethod.GET) //GET방식으로 페이지 호출
	public ModelAndView read(@RequestParam("comid")int comid) throws Exception{
		//인자값은 파라미터 값으로 기본키인 글 번호를 기준으로 Model을 사용하여 불러옴
		ModelAndView mav = new ModelAndView();
		CommunityVO vo = service.read(comid);		
		mav.addObject("commVO", vo); //read 서비스 호출
		mav.setViewName("Community/CommunityRead");
		return mav;
	}
	
	@RequestMapping(value ="/Community/CommunityModify", method=RequestMethod.GET) //GET방식으로 페이지 호출
	public void modifyGET(int comid, Model model) throws Exception {
		CommunityVO vo = service.read(comid);
		model.addAttribute("commVO", vo); //수정을 위한 글읽기 서비스 호출
	}
	
	@RequestMapping(value ="/Community/CommunityModify", method=RequestMethod.POST) //POST방식으로 데이터 전송
	public String modifyPOST(CommunityVO comVO, RedirectAttributes rttr) throws Exception {
		service.modify(comVO); //글수정 서비스 호출
		return "redirect:/Community/CommunityList"; //수정이 완료된 후, 목록페이지로 리턴
	}
	
	@RequestMapping(value ="/Community/delete", method=RequestMethod.POST) //POST방식으로 데이터 전송
	public String removePOST(@RequestParam("comid") int comid, RedirectAttributes rttr)throws Exception{
		service.remove(comid); //글삭제 서비스 호출
		return "redirect:/Community/CommunityList"; //삭제가 완료된 후, 목록페이지로 리턴
	}
	
	//4대보험 페이지
	@RequestMapping(value="/insurance", method=RequestMethod.GET)
	public void insurance(Model model)throws Exception{
	}
	

	
}

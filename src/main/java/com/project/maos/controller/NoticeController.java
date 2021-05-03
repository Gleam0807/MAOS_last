package com.project.maos.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.maos.service.NoticeService;
import com.project.maos.vo.NoticeVO;
import com.project.maos.vo.Page;

@Controller
@RequestMapping("/notice/*")
public class NoticeController {

	@Inject
	private NoticeService service;
	
	
	// 게시물 작성
	@RequestMapping(value = "/write", method = RequestMethod.GET)
	public void getWirte() throws Exception {
		 
	}
	
	// 게시물 작성
	@RequestMapping(value = "/write", method = RequestMethod.POST)
	public String posttWirte(NoticeVO vo) throws Exception {
		 service.write(vo);
		 
		 return "redirect:/notice/list?num=1";
	}
	
	// 게시물 조회
	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public void getView(@RequestParam("noticeid") int noticeid, Model model) throws Exception {
		
		NoticeVO vo = service.view(noticeid);
		 
		model.addAttribute("view", vo);
		
	}
	
	// 게시물 수정
	@RequestMapping(value = "/modify", method = RequestMethod.GET)
	public void getModify(@RequestParam("noticeid") int noticeid, Model model) throws Exception {

		NoticeVO vo = service.view(noticeid);
		 
		model.addAttribute("view", vo);
	}
	
	// 게시물 수정
	@RequestMapping(value = "/modify", method = RequestMethod.POST)
	public String postModify(NoticeVO vo) throws Exception {

		service.modify(vo);
		 
		 return "redirect:/notice/view?noticeid=" + vo.getNoticeid();
	}
	
	// 게시물 삭제
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String getDelete(@RequestParam("noticeid") int noticeid) throws Exception {
		
		service.delete(noticeid);		

		return "redirect:/notice/list?num=1";
	} 

	
	// 게시물 목록 + 페이징 추가 + 검색
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public void getListPageSearch(Model model, @RequestParam(value="num") int num, 
			@RequestParam(value = "searchType",required = false, defaultValue = "title") String searchType,
			@RequestParam(value = "keyword",required = false, defaultValue = "") String keyword
			) throws Exception {
	
		
		Page page = new Page();
		
		page.setNum(num);
		//page.setCount(service.count());		
		page.setCount(service.searchCount(searchType, keyword));
		
		// 검색 타입과 검색어
		//page.setSearchTypeKeyword(searchType, keyword);
		page.setSearchType(searchType);
		page.setKeyword(keyword);
				
		List<NoticeVO> list = null; 
		//list = service.listPage(page.getDisplayPost(), page.getPostNum());
		list = service.list(page.getDisplayPost(), page.getPostNum(), searchType, keyword);
		
		model.addAttribute("list", list);
		model.addAttribute("page", page);
		model.addAttribute("select", num);
		
		//model.addAttribute("searchType", searchType);
		//model.addAttribute("keyword", keyword);
		
		
		
	}


}

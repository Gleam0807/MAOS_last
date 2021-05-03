package com.mcos.evaluation.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mcos.community.common.Pagination;
import com.mcos.evaluation.domain.EvaluationVO;
import com.mcos.evaluation.service.evaluationService;

@Controller
@RequestMapping(value="/")
public class EvaluationController {

	@Autowired
	private evaluationService service;
	
	//직원평가 목록
	@RequestMapping(value="/EvaluationList", method=RequestMethod.GET)
	public String listAll(Model model
					, @RequestParam(required = false, defaultValue = "1")int page
					, @RequestParam(required = false, defaultValue = "1")int range
				//	, @RequestParam(required = false, defaultValue = "userid")String searchType
				//	, @RequestParam(required = false)String keyword
					)throws Exception{
		
	//	Search search = new Search();
	//	search.setSearchType(searchType);
	//	search.setKeyword(keyword);

		//전체 게시글 개수
		int listCnt = service.evalListCnt();
		
		//Pagination 객체생성 및 페이징 정보 셋팅
		Pagination pagination = new Pagination();
		pagination.pageInfo(page, range, listCnt);
		
		model.addAttribute("pagination", pagination);
		model.addAttribute("list", service.listAll(pagination));
		return "/EvaluationList";
	}
	
	//직원평가 상세보기
	@RequestMapping(value="/EvaluationRead", method=RequestMethod.GET)
	public void read(@RequestParam("evalid")int evalid, Model model)throws Exception{
		EvaluationVO vo = service.read(evalid);
		model.addAttribute("evalVO", vo);
	}
	
	//직원 평가 작성
	@RequestMapping(value="/EvaluationRegist", method=RequestMethod.GET)
	public void registGET(EvaluationVO evalVO, Model model)throws Exception{
		
	}
	
	@RequestMapping(value="/EvaluationRegist", method=RequestMethod.POST)
	public String registPOST(EvaluationVO evalVO, RedirectAttributes rttr)throws Exception{
		service.register(evalVO);
		return	"redirect:/Community/CommunityList";
	}
	
	//평가 삭제
	@RequestMapping(value="/deleteEvaluation", method=RequestMethod.POST)
	public String deletePOST(@RequestParam("evalid")int evalid, RedirectAttributes rttr)throws Exception{
		service.remove(evalid);
		return "redirect:/EvaluationList";
	}
}

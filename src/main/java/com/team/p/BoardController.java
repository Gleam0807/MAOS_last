package com.team.p;

import javax.inject.Inject;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.common.Pagination;
import com.common.Search;
import com.team.domain.BoardVO;
import com.team.service.BoardService;


@Controller // 컨트롤러임을 명시
@RequestMapping(value = "/workflow/*") // 주소 패턴
public class BoardController {

	@Inject   // 주입(심부름꾼) 명시
	private BoardService service; // Service 호출을 위한 객체생성

	
	
	@RequestMapping(value = "/read", method = RequestMethod.GET) // GET 방식으로 페이지 호출
	  public void read(@RequestParam("applyid")int applyid, Model model) throws Exception{
		 model.addAttribute(service.read(applyid)); // read 서비스 호출
	}

	  
	@RequestMapping(value= "/workFlow2", method = RequestMethod.GET) 
	public void workFlow(Model model
			, @RequestParam(required = false, defaultValue = "1") int page
			, @RequestParam(required = false, defaultValue = "1") int range
			, @RequestParam(required = false, defaultValue = "title") String searchType
			, @RequestParam(required = false) String keyword
			) throws Exception {
		
		Search search = new Search();
		search.setSearchType(searchType);
		search.setKeyword(keyword);

		
		
		int listCnt = service.getBoardListCnt(search);
		
		search.pageInfo(page, range, listCnt);		
		
		
		model.addAttribute("pagination", search);
		model.addAttribute("workFlow2", service.getBoardList(search));
		
	}
	
	@RequestMapping(value = "/regist", method = RequestMethod.GET) // GET 방식으로 페이지 호출
	  public void registerGET(BoardVO board, Model model) throws Exception {
	}

	@RequestMapping(value = "/regist", method = RequestMethod.POST) // POST방식으로 내용 전송
	  public String registPOST(BoardVO board, RedirectAttributes rttr) throws Exception { // 인자값으로 REDIRECT 사용 
		  service.regist(board); // 글작성 서비스 호출
	    return "redirect:workflow/workFlow2"; // 작성이 완료된 후, 목록페이지로 리턴
	}
	
	@RequestMapping(value = "/modify", method = RequestMethod.GET) // GET 방식으로 페이지 호출
	public void modifyGET(int applyid, Model model) throws Exception {
		model.addAttribute(service.read(applyid)); // 수정을 위한 글읽기 서비스 호출
	}
	
	@RequestMapping(value = "/modify", method = RequestMethod.POST)// POST방식으로 데이터 전송
	  public String modifyPOST(BoardVO board, RedirectAttributes rttr) throws Exception {
	    service.modify(board); // 글수정 서비스 호출
	    return "redirect:/workFlow2"; // 수정이 완료된 후, 목록페이지로 리턴
	  }
	@RequestMapping(value = "/index33", method = RequestMethod.GET)
	public String index() {
		return "index33";
	}
	

	
}



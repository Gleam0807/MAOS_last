package com.notice.p;

import javax.inject.Inject;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.common.Pagination;
import com.notice.domain.NoticeBoardVO;
import com.notice.service.NoticeBoardService;



@Controller // 컨트롤러임을 명시
@RequestMapping(value = "/workflow/*") // 주소 패턴
public class NoticeBoardController {

	@Inject   // 주입(심부름꾼) 명시
	private NoticeBoardService service; // Service 호출을 위한 객체생성

	@RequestMapping(value= "/noticeBoard", method = RequestMethod.GET) 
	public void noticeBoard(Model model
			, @RequestParam(required = false, defaultValue = "1") int page
			, @RequestParam(required = false, defaultValue = "1") int range
			) throws Exception {
		
		int listCnt = service.getBoardListCnt();
		
		//Pagination 객체생성
		Pagination pagination = new Pagination();
		pagination.pageInfo(page, range, listCnt);
		
		model.addAttribute("pagination", pagination);
		model.addAttribute("noticeBoardListAll", service.getBoardList(pagination));
		//model.addAttribute("noticeBoardListAll",service.listAll()); 
}

	@RequestMapping(value = "/noticeRegist", method = RequestMethod.GET) // GET 방식으로 페이지 호출
	public void registerGET(NoticeBoardVO vo, Model model) throws Exception {
	}

	@RequestMapping(value = "/noticeRegist", method = RequestMethod.POST) // POST방식으로 내용 전송
	  public String registPOST(NoticeBoardVO vo, RedirectAttributes rttr) throws Exception { // 인자값으로 REDIRECT 사용 
		  service.regist(vo); // 글작성 서비스 호출
	    return "redirect:/noticeBoard"; // 작성이 완료된 후, 목록페이지로 리턴
	}
	
	@RequestMapping(value = "/noticeRead", method = RequestMethod.GET) // GET 방식으로 페이지 호출
	  public void read(@RequestParam("noticeid")int noticeid, Model model) throws Exception{
		 model.addAttribute(service.noticeRead(noticeid)); // read 서비스 호출
	}
	
	@RequestMapping(value = "/noticeModify", method = RequestMethod.GET) // GET 방식으로 페이지 호출
	public void modifyGET(int noticeid, Model model) throws Exception {
		model.addAttribute(service.noticeRead(noticeid)); // 수정을 위한 글읽기 서비스 호출
	}
	
	@RequestMapping(value = "/noticeModify", method = RequestMethod.POST)// POST방식으로 데이터 전송
	  public String modifyPOST(NoticeBoardVO board, RedirectAttributes rttr) throws Exception {
	    service.modify(board); 
	    return "redirect:/noticeBoard"; 
	}
	
	 @RequestMapping(value = "/noticeRemove", method = RequestMethod.POST)// POST방식으로 데이터 전송
	  public String removePOST(@RequestParam("noticeid") int noticeid, RedirectAttributes rttr) throws Exception{
		  service.remove(noticeid); // 글삭제 서비스 호출
		  return "redirect:/noticeBoard"; // 삭제가 완료된 후, 목록페이지로 리턴
	  }
	 
	 
	 
	 
	 
}



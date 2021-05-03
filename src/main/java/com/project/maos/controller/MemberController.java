package com.project.maos.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.project.maos.service.MemberService;
import com.project.maos.vo.MemberVO;
import com.project.maos.vo.NoticeVO;

@Controller
@RequestMapping("/member/*")
public class MemberController {
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);

	@Autowired
	MemberService service;

	@Inject
	BCryptPasswordEncoder pwdEncoder;

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public void getRegister() throws Exception {
		logger.info("get register");
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String postRegister(MemberVO vo) throws Exception {
		logger.info("post register");
		String inputPass = vo.getUserPass();
		String pwd = pwdEncoder.encode(inputPass);
		vo.setUserPass(pwd);
		service.register(vo);
		return "redirect:/";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public void getlogin() throws Exception {
		logger.info("get login");
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String name = auth.getName(); //get logged in username
	    logger.info(name);
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(MemberVO vo, HttpServletRequest req) throws Exception {
		logger.info("post login");

		HttpSession session = req.getSession();
		MemberVO login = service.login(vo);

		if (login == null) {
			session.setAttribute("member", null);
		} else {
			session.setAttribute("member", login);
		}
		return "redirect:/member/login";
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) throws Exception {
		session.invalidate();

		return "redirect:/";
	}
	
	@RequestMapping(value = "/executive_register", method = RequestMethod.GET)
	public void getexeRegister() throws Exception {
		logger.info("get executive_register");
	}

	@RequestMapping(value = "/executive_register", method = RequestMethod.POST)
	public String postexeRegister(MemberVO vo) throws Exception {
		logger.info("post  executive_register");
		String inputPass = vo.getUserPass();
		String pwd = pwdEncoder.encode(inputPass);
		vo.setUserPass(pwd);
		service.executiveregister(vo);
		return "redirect:/";
	}
}
	

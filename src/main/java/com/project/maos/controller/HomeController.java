package com.project.maos.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	@RequestMapping(value="/")
	public String index() {
		return "index";
	}
	@RequestMapping(value="/tour")
	public String tour() {
		return "tour";
	}

	@RequestMapping(value="/pricing")
	public String pricing() {
		return "pricing";
	}
	@RequestMapping(value="payment1")
	public String payment1() {
		return "payment1";
	}
	@RequestMapping(value="payment2")
	public String payment2() {
		return "payment2";
	}
	
}

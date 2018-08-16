package com.springlab.SpringLab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController {

	@RequestMapping("/")
	public ModelAndView indexPage() {
		return new ModelAndView("index", "test", "Hello World!");
	}
	
	@RequestMapping("/coffee")
	public String coffee() {
		return "coffee"; 
	}
	
	
	@RequestMapping("userinfo")
	public ModelAndView formData(@RequestParam("firstName") String fName) {
		return new ModelAndView("formstuff", "personName", fName);
	
	}
	
}

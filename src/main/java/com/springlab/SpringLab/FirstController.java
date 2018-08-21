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
	public ModelAndView formData(@RequestParam("firstName") String fName,  
			
		@RequestParam("lastName") String lName,
		@RequestParam("phoneNum") String phone) {
		
		return new ModelAndView("formstuff", "member" , fName + " " + lName);
	
	}
		
	@RequestMapping("userinfo2")
	public ModelAndView formData2(@RequestParam("emailName") String email,
		
		@RequestParam("userPhone") String phone,
		@RequestParam("userName") String uName,
		@RequestParam("passName") String pName) {
	
		return new ModelAndView("formstuff", "member" , email);
		
	}
	
	
}

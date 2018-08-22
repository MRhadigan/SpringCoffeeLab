package com.springlab;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springlab.dao.CustomersJdbcDao;



@Controller
public class FirstController {
	
	@Autowired
	private CustomersJdbcDao dao;

	@RequestMapping("/")
	public ModelAndView indexPage(Model model) {
		model.addAttribute("members", dao.findAll());
		return new ModelAndView("index", "test", "Hello World!");
	}
	
	@RequestMapping("/coffee")
	public String coffee() {
		return "coffee"; 
	}
	
	
	@RequestMapping("userinfo")
	public ModelAndView formData(@RequestParam("firstName") String id,  
			
		@RequestParam("lastName") String contName,
		@RequestParam("emailName") String compName,
		@RequestParam("userName") String title,
		@RequestParam("userPhone") String phone,
		@RequestParam("passName") String passName) {
	
		//@RequestParam("phoneNum") String phone
		return new ModelAndView("formstuff", "member" , id + " " + contName);
	
	}
	
	@RequestMapping("/addnewcust")
	public ModelAndView addNew(@RequestParam("id") String id, @RequestParam("contName") String name,
			@RequestParam("title") String title, @RequestParam("compName") String compName,
			@RequestParam("phone") String phone) {

		dao.insertCustomer(id, compName, name, title, phone);

		return new ModelAndView("index", "customers", dao.findAll());
	}


	// create a mapping to a form page to change the customer name
	@RequestMapping("/update")
	public ModelAndView update(@RequestParam("id") String custID) {
		ModelAndView mv = new ModelAndView("updateform");
		mv.addObject("cID", custID);
		mv.addObject("test", "Hello World");

		return mv;

	}

	@RequestMapping("/updatecust")
	public ModelAndView updateCust(@RequestParam("firstName") String id, @RequestParam("lastName") String name) {
		dao.updateCustomer(id, name);

		return new ModelAndView("index", "customers", dao.findAll());
	}
	
	@RequestMapping("delete")
	public ModelAndView deleteCust(@RequestParam("firstName") String custID) {
		dao.deleteCustomer(custID);
		return new ModelAndView("index", "customers", dao.findAll());
	}
		
//	@RequestMapping("userinfo2")
//	public ModelAndView formData2
//		
//		(@RequestParam("emailName") String email,
//		@RequestParam("userPhone") String phone,
//		@RequestParam("userName") String uName,
//		@RequestParam("passName") String pName) {
//	
//		return new ModelAndView("formstuff", "member" , email);
//		
//}
	
	
}

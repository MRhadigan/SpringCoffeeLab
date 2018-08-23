package com.springlab;


import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.springlab.dao.ItemsJdbcDao;

@Controller
public class SecondController {

	
		
		
		private ItemsJdbcDao dao;

//		@RequestMapping("/")
//		public ModelAndView indexPage(Model model) {
//			model.addAttribute("orders", dao.findAll2());
//			return new ModelAndView("index", "test", "Hello World!");
//		}
//		
//		@RequestMapping("/coffee")
//		public String coffee() {
//			return "coffee"; 
//		}

		
		@RequestMapping("/addnewitem")
		public ModelAndView addItem(@RequestParam("itemID") String itemID, @RequestParam("Name") String Name,
				@RequestParam("description") String description, @RequestParam("quantity") String quantity, @RequestParam("price") String price) { 
			

			dao.insertItems(itemID, Name, description, quantity, price);

			return new ModelAndView("index", "items", dao.findAll2());
		}


		// create a mapping to a form page to change the customer name
		@RequestMapping("/update")
		public ModelAndView update2(@RequestParam("itemID") String itemID) {
			ModelAndView mv = new ModelAndView("updateform");
			mv.addObject("cID", itemID);
			mv.addObject("test", "Hello World");

			return mv;

		}

		@RequestMapping("/updateitem")
		public ModelAndView updateItem(@RequestParam("itemID") String itemID, @RequestParam("Name") String Name) {
			dao.updateItems(itemID, Name);

			return new ModelAndView("index", "items", dao.findAll2());
		}
		
		@RequestMapping("delete")
		public ModelAndView deleteItems(@RequestParam("itemID") String itemID) {
			dao.deleteItems(itemID);
			return new ModelAndView("index", "customers", dao.findAll2());
		}
			
}

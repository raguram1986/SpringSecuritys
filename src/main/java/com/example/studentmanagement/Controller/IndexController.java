package com.example.studentmanagement.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class IndexController {
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	   public String index() {
	      return "index";
	   }
	   @RequestMapping(value = "/student", method = RequestMethod.GET)
	   public String aboutus() {
	      return "student";
	   }
	   @RequestMapping(value = "/course", method = RequestMethod.GET)
	   public String contactus() {
	      return "course";
	   }
}

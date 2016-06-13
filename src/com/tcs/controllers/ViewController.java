package com.tcs.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/view/")
public class ViewController {
	
	@RequestMapping(value="emp" , method=RequestMethod.GET)
	public String getPage() {
		return "emp";
	}
	
	@RequestMapping(value="home" , method=RequestMethod.POST)
	public String getNextPage() {
		return "home";
	}

}

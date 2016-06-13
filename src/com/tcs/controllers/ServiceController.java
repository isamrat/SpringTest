package com.tcs.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.bean.*;
import com.tcs.service.EmpService;

@RestController
@RequestMapping("/service/")
public class ServiceController {
	
	@Autowired
	EmpService empService;
	
	@RequestMapping(value="home" , method=RequestMethod.GET, headers = "Accept=application/json")
	public List<Employee> getDetails() {
		return empService.getEmpDetails();
	}
	
	@RequestMapping(value="home/{city}", method=RequestMethod.GET, headers = "Accept=application/json")
	public List<Employee> empDetails(@PathVariable String city) {
		return empService.getSearchDetails(city);
		
	}

}

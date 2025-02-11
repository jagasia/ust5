package com.ust.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

	@GetMapping
	public String home() {
		return "index";		//prefixed and suffixed as WEB-INF/views/index.jsp
	}
	
//	@GetMapping("/add")
//	@ResponseBody
//	public String add(@RequestParam("no1") Integer no1,@RequestParam("no2") Integer no2)
//	{
//		Integer sum=no1+no2;
//		String result=String.format("Sum of %d and %d is %d", no1, no2, sum);
//		return result;	//Adding is not a view. it is response
//	}
	
	@GetMapping("/add")
	public String add(@RequestParam("no1") Integer no1,@RequestParam("no2") Integer no2, ModelMap model)
	{
		Integer sum=no1+no2;
		String result=String.format("Sum of %d and %d is %d", no1, no2, sum);
		model.addAttribute("no1",no1);
		model.addAttribute("no2",no2);		
		model.addAttribute("result", result);
		return "index";
	}
	
}

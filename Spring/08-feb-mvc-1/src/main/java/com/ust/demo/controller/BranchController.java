package com.ust.demo.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ust.demo.model.Branch;
import com.ust.demo.model.BranchDaoImpl;

@Controller
@RequestMapping("/branch")
public class BranchController {

	@GetMapping
	public ModelAndView showBranchPage() throws SQLException
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("branch");
		BranchDaoImpl bdao=new BranchDaoImpl();
		List<Branch> branches = bdao.read();
		mv.addObject("branches",branches);
		return mv;
	}
}

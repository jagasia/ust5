package com.ust.demo.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ust.demo.model.Branch;
import com.ust.demo.model.BranchDaoImpl;

@Controller
@RequestMapping("/branch")
public class BranchController {

//	@GetMapping
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView showBranchPage() throws SQLException
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("branch");
		BranchDaoImpl bdao=new BranchDaoImpl();
		List<Branch> branches = bdao.read();
		mv.addObject("branches",branches);
		mv.addObject("branch", new Branch());
		return mv;
	}
	
//	@GetMapping("/dml")
	@RequestMapping(value = "/dml", method = RequestMethod.POST, params = "add")
//	public ModelAndView addBranch(@RequestParam("bid") String bid,@RequestParam("bname") String bname,@RequestParam("bcity") String bcity) throws SQLException {
	public ModelAndView addBranch(Branch branch) throws SQLException {
//		Branch branch=new Branch(bid, bname, bcity);
		BranchDaoImpl bdao=new BranchDaoImpl();
		bdao.create(branch);
		return select(branch.getBid());
	}
	
	@RequestMapping(value = "/dml", method = RequestMethod.POST, params = "update")
	public ModelAndView updateBranch(Branch branch) throws SQLException {
		BranchDaoImpl bdao=new BranchDaoImpl();
		bdao.update(branch);
		return select(branch.getBid());
	}
	
	@RequestMapping(value = "/dml", method = RequestMethod.POST, params = "delete")
	public ModelAndView deleteBranch(@RequestParam("bid")String bid) throws SQLException {
		BranchDaoImpl bdao=new BranchDaoImpl();
		bdao.delete(bid);
		return showBranchPage();
	}
	
	@GetMapping("/select/{bid}")
	public ModelAndView select(@PathVariable("bid") String bid) throws SQLException
	{
		BranchDaoImpl bdao=new BranchDaoImpl();
		Branch branch = bdao.read(bid);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("branch");
		List<Branch> branches = bdao.read();
		mv.addObject("branches",branches);
		mv.addObject("branch", branch);
		return mv;
	}

	@PutMapping("/update")
	@ResponseBody
	public String putDemo()
	{
		return "THis is put mapping, and it works fine";
	}
	
	@DeleteMapping("/delete")
	@ResponseBody
	public String deleteDemo()
	{
		return "Delete is working fine";
	}
}

package com.ust.demo.controller;

import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.ust.demo.entity.Product;
import com.ust.demo.service.ProductService;

import jakarta.servlet.annotation.MultipartConfig;

@Controller
@RequestMapping("/product")
@MultipartConfig
public class ProductController {
	@Autowired
	private ProductService ps;

	@GetMapping
	public ModelAndView showProductPage() {
		ModelAndView mv=new ModelAndView();
		List<Product> products = ps.read();
		List<String> categories = ps.getCategories();
		mv.addObject("products",products);
		mv.addObject("categories",categories);
		mv.setViewName("product");
		return mv;
	}
	
	@PostMapping(value = "/dml", params = "add")
	public ModelAndView dml(@RequestParam("name") String name,@RequestParam("price") Double price,@RequestParam("expiryDate") String expdt,@RequestParam("category") String category,@RequestParam("picture") MultipartFile file) throws ParseException, IOException{
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date expiryDate=sdf.parse(expdt);
		InputStream is = file.getInputStream();
		byte []data=new byte[is.available()];
		is.read(data);
		String picture=Base64.encodeBase64String(data);
		Product product=new Product(null, name, price, expiryDate, category, picture);
		ps.create(product);
		return showProductPage();
	}
	
	@GetMapping("/search")
	public ModelAndView findByCategory(@RequestParam("category")String category)
	{
		ModelAndView mv=new ModelAndView();
		List<Product> products = ps.findByCategory(category);
		List<String> categories = ps.getCategories();
		mv.addObject("products",products);
		mv.addObject("categories",categories);
		mv.setViewName("product");
		return mv;		
	}
}

package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.model.Category;
import com.niit.service.CategoryService;

@Controller
public class CategoryController {
	@Autowired
	CategoryService categoryService;
	Category category;
	
	
	@RequestMapping("/Category")
	public ModelAndView rajucontroller()
	{
		
		ModelAndView mv=new ModelAndView("Category");
	System.out.println("Categorys controller called");
		
		
		return mv;
	}
	
	@RequestMapping("/addCategory")
	public ModelAndView Registercontroller( 
			@RequestParam(value = "cid") String categoryid,
			@RequestParam(value = "cname") String categoryname,
			@RequestParam(value = "cdescription") String categorydescription
			
			
			)
	
	{
		

		Category c=new Category();
		
		c.setCname(categoryname);
		c.setCdescription(categorydescription);

		categoryService.saveOrUpdate(c);

		ModelAndView mv=new ModelAndView("Category");
	System.out.println("Category controller called");
		
		
		return mv;
	}
	
	
}
package com.niit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BasicController {
	
	@RequestMapping("/")
	public ModelAndView Firstcontroller()
	{
		
		ModelAndView mv=new ModelAndView("Welcome");
	System.out.println("index controller called");
		
		
		return mv;
	}
	
	@RequestMapping("/adminlogin")
	public ModelAndView Thirdcontroller()
	{
		
		ModelAndView mv=new ModelAndView("adminlogin");
	System.out.println("carousel controller called");
		
		
		return mv;
	}
/*	@RequestMapping("/login")
	public ModelAndView controller()
	{
		
		ModelAndView mv=new ModelAndView("Welcome");
	System.out.println("login called");
		
		
		return mv;
	}*/
	
	@RequestMapping("/Brands")
	public ModelAndView fourthcontroller()
	{
		
		ModelAndView mv=new ModelAndView("Brands");
	System.out.println("Brands Page called");
		
		
		return mv;
	}

	@RequestMapping("/Welcome")
	public ModelAndView fifthcontroller()
	{
		
		ModelAndView mv=new ModelAndView("Welcome");
	System.out.println("Welcome Page called");
		
		
		return mv;
	}

	@RequestMapping("/viewUser")
	public ModelAndView eighthcontroller()
	{
		
		ModelAndView mv=new ModelAndView("viewUser");
	System.out.println("Brands Page called");
		
		
		return mv;
	}
	@RequestMapping("/logout")
	public ModelAndView ninthcontroller()
	{
		
		ModelAndView mv=new ModelAndView("logout");
	System.out.println("Brands Page called");
		
		
		return mv;
	}	
	@RequestMapping("/canon")
	public ModelAndView tenthcontroller()
	{
		
		ModelAndView mv=new ModelAndView("canon");
	System.out.println("Canon Page called");
		
		
		return mv;
	}
	@RequestMapping("/angularjs")
	public ModelAndView eleventhcontroller()
	{
		
		ModelAndView mv=new ModelAndView("angularjs");
	System.out.println("angularjs Page called");
		
		
		return mv;
	}
	@RequestMapping("/DAD")
	public ModelAndView twelvthcontroller()
	{
		
		ModelAndView mv=new ModelAndView("Category");
	System.out.println("angularjs Page called");
		
		
		return mv;
	}
	@RequestMapping("/Daddd")
	public ModelAndView thirteenthcontroller()
	{
		
		ModelAndView mv=new ModelAndView("Supplier");
	System.out.println("angularjs Page called");
		
		
		return mv;
	}
	@RequestMapping("/nikon")
	public ModelAndView fourteenthcontroller()
	{
		
		ModelAndView mv=new ModelAndView("nikon");
	System.out.println("Nikon called");
		
		
		return mv;
	}
	/*@RequestMapping("/login")
	public ModelAndView fifteenthcontroller()
	{
		
		ModelAndView mv=new ModelAndView("login");
	System.out.println("login called");
		
		
		return mv;
	}*/
	@RequestMapping("/sony")
	public ModelAndView sixteenthcontroller()
	{
		
		ModelAndView mv=new ModelAndView("sony");
	System.out.println("Sony called");
		
		
		return mv;
	}
	
	@RequestMapping("/Canon1200D")
	public ModelAndView seventeenthcontroller()
	{
		
		ModelAndView mv=new ModelAndView("Canon1200D");
	System.out.println("Canon1200D called");
		
		
		return mv;
	}
	@RequestMapping("/CanonRSD")
	public ModelAndView eighteenthcontroller()
	{
		
		ModelAndView mv=new ModelAndView("CanonRSD");
	System.out.println("Canon650 called");
		
		
		return mv;
	}
	@RequestMapping("/CanonMT")
	public ModelAndView ninteenthcontroller()
	{
		
		ModelAndView mv=new ModelAndView("CanonMT");
	System.out.println("CanonMT called");
		
		
		return mv;
	}
	@RequestMapping("/CanonZ")
	public ModelAndView twentycontroller()
	{
		
		ModelAndView mv=new ModelAndView("CanonZ");
	System.out.println("CanonZ called");
		
		
		return mv;
	}
	@RequestMapping("/NikonSS")
	public ModelAndView twentyfirstcontroller()
	{
		
		ModelAndView mv=new ModelAndView("NikonSS");
	System.out.println("NikonSS called");
		
		
		return mv;
	}
	
	@RequestMapping("/NikonEye")
	public ModelAndView twentysecondcontroller()
	{
		
		ModelAndView mv=new ModelAndView("NikonEye");
	System.out.println("NikonEye called");
		
		
		return mv;
	}
	@RequestMapping("/NikonW")
	public ModelAndView twentythirdcontroller()
	{
		
		ModelAndView mv=new ModelAndView("NikonW");
	System.out.println("NikonW called");
		
		
		return mv;
	}
	@RequestMapping("/NikonWT")
	public ModelAndView twentyfourthcontroller()
	{
		
		ModelAndView mv=new ModelAndView("NikonWT");
	System.out.println("NikonWT called");
		
		
		return mv;
	}
	@RequestMapping("/Sony1300")
	public ModelAndView twentyfivecontroller()
	{
		
		ModelAndView mv=new ModelAndView("Sony1300");
	System.out.println("Sony1300 called");
		
		
		return mv;
	}
	@RequestMapping("/SonyRaedon")
	public ModelAndView twentysixcontroller()
	{
		
		ModelAndView mv=new ModelAndView("SonyRaedon");
	System.out.println("Sony Raedon called");
		
		
		return mv;
	}
	@RequestMapping("/SonyT")
	public ModelAndView twentysevencontroller()
	{
		
		ModelAndView mv=new ModelAndView("SonyT");
	System.out.println("SonyT called");
		
		
		return mv;
	}
	@RequestMapping("/SonyMT")
	public ModelAndView twentyeightcontroller()
	{
		
		ModelAndView mv=new ModelAndView("SonyMT");
	System.out.println("SonyMT called");
		
		
		return mv;
	}
	@RequestMapping("/prod")
	public ModelAndView twentyninecontroller()
	{
		
		ModelAndView mv=new ModelAndView("prod");
	System.out.println("prod called");
		
		
		return mv;
	}
	
	
}

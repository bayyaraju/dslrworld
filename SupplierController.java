package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.model.Supplier;
import com.niit.service.SupplierService;

@Controller
public class SupplierController {
	@Autowired
	SupplierService supplierService;
	Supplier supplier;
	
	
	@RequestMapping("/Supplier")
	public ModelAndView rajucontroller()
	{
		
		ModelAndView mv=new ModelAndView("Supplier");
	System.out.println("Suppliers controller called");
		
		
		return mv;
	}
	
	@RequestMapping("/addSupplier")
	public ModelAndView Registercontroller( 
			@RequestParam(value = "sid") String supplierid,
			@RequestParam(value = "sname") String suppliername,
			@RequestParam(value = "saddress") String supplieraddress,
			@RequestParam(value = "semail") String supplieremail,

			@RequestParam(value = "sphno") String supplierphno
			
			)
	
	{
		

		Supplier s=new Supplier();
		s.setSname(suppliername);
		s.setSaddress(supplieraddress);

		s.setSemail(supplieremail);
		
		s.setSphno(supplierphno);
		System.out.println(s.getSname());
		supplierService.saveOrUpdate(s);

		ModelAndView mv=new ModelAndView("Supplier");
	System.out.println("Supplier controller called");
		
		
		return mv;
	}
	
	
}
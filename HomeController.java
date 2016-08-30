package com.niit.controller;

import java.io.IOException;
import java.security.Principal;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.hibernate.Session;
import org.hibernate.mapping.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.model.Product;
import com.niit.model.User;
import com.niit.model.UserRole;
import com.niit.service.UserService;
import com.niit.service.UserServiceInterface;

@Controller
public class HomeController {
	@Autowired
	UserService userService;
	
	@RequestMapping("/registration")
	
		public ModelAndView displayReg(){
			ModelAndView r1=new ModelAndView("registration","user",new User());
			System.out.println("reg page is from logicontroller");
			return r1;
		}
		
	
	

	@RequestMapping(value="/register",method=RequestMethod.POST)
	public ModelAndView register(@Valid@ModelAttribute("user") User user,BindingResult bindingResult,HttpServletRequest request)

	{	
		
		if(bindingResult.hasErrors())
			
		{
			System.out.println("Bd error called if statement");
			return new ModelAndView("registration");
		}
		System.out.println("Inside the register mapping");
		System.out.println(user.getUfirstname());
	userService.saveOrUpdate(user);
		
		ModelAndView mv = new ModelAndView("login");
		return mv;
		}
	
	 @RequestMapping("/login")
		public ModelAndView userCheck(Principal principal){
			
			return new ModelAndView("login");
		}
		@RequestMapping("/AdminCheck")
		public ModelAndView adminCheck(Principal principal){
			
			return new ModelAndView("adminlogin");
		}
		
		
	/*@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login(
		@RequestParam(value = "error", required = false) String error,
		@RequestParam(value = "logout", required = false) String logout) {

		ModelAndView model = new ModelAndView();
		if (error != null) {
			model.addObject("error", "Invalid username and password!");
		}

		if (logout != null) {
			model.addObject("msg", "You've been logged out successfully.");
		}
		model.setViewName("login");

		return model;

	}*/

}

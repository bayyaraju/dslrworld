package com.niit.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.Principal;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.hibernate.SessionFactory;
import org.hibernate.mapping.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.niit.model.Product;
import com.niit.service.ProductService;
@Controller

public class ProductController {
	
	@Autowired
	private ProductService productService;
	

	@RequestMapping(value="/Products")
	public String addproduct(Model model) {
		System.out.println("sucess add product");
		model.addAttribute("product", new Product());

		return "Products";
	}
	@RequestMapping("/add")
	public String addproduct2(Model model) {
		System.out.println("sucess add pddd");
		model.addAttribute("product", new Product());

		return "Products";
	}
@ModelAttribute("products")
public Product returnobject()
{
	return new Product();
}

@RequestMapping(value="/productupdate", method=RequestMethod.POST)
public String CreateProduct(@ModelAttribute("product")Product pd,HttpServletRequest request)
{		
 	System.out.println("in product controller11");

	@SuppressWarnings("unused")
	String filename;
 	@SuppressWarnings("unused")
	byte[]bytes;
 	System.out.println(pd.getPdescription());
 
 	
 		System.out.println("image uploaded");
 		



System.out.println("product controller called");
MultipartFile image=pd.getImg();
Path path;
path= Paths.get("H:/Proj/ShoppingWeb/src/main/webapp/resources/images/"+pd.getPname() +".jpg");

System.out.println("Path = " + path);
System.out.println("File name = " + pd.getImg().getOriginalFilename());
if(image!=null && !image.isEmpty())
{
	try
	{
	 image.transferTo(new File(path.toString()));
	  System.out.println("Image Saved in:"+path.toString());
	}catch(Exception e)
	{
e.printStackTrace();
		System.out.println("Image not saved");
	}
}

productService.saveOrUpdate(pd);

return "angularjs";

}


	
	@RequestMapping("/viewitem")
	public ModelAndView viewItems() throws JsonGenerationException, JsonMappingException, IOException
	{
		List<Product> list = productService.list();

		System.out.println("user list="+list);
		ObjectMapper om = new ObjectMapper();
		String listjson = om.writeValueAsString(list);
		
		System.out.println(listjson);
		
		return new ModelAndView("viewitem","listofitem",listjson);
		
	
	}

	
	@RequestMapping("/deleteproduct")
	public String removeProduct(@RequestParam int pid) throws Exception {
	System.out.println("In delete");
	System.out.println(pid);

	    try {
	        productService.delete(pid);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return "angularjs";
	}

	
	String setPname;
	List<Product> plist;
	@SuppressWarnings("unchecked")
	@RequestMapping("/GsonCon")
	public @ResponseBody String getValues()throws Exception
	{
		String result = "";
			plist = productService.list();
			Gson gson = new Gson();			  
			result = gson.toJson(plist);
			
			return result;
	}

	
}
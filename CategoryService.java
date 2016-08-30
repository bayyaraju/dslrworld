package com.niit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.dao.CategoryDAO;
import com.niit.model.Category;
@Service
public class CategoryService {

	@Autowired
	CategoryDAO categoryDAO;
	
	
	public boolean isValidCredentials(String category,Boolean isAdmin,  String pass)
	 {
		System.out.println("ShoppingWeb, false,ShoppingWeb");
		 return categoryDAO.isValidCredentials(category,isAdmin, pass);
		 
		 
	 }

	public void saveOrUpdate(Category category)
	{
		System.out.println("In categorysevice");
		categoryDAO.saveOrUpdate(category);	
	}
	public List<Category> list()
	{
		List<Category> list=categoryDAO.list();
		return list;
	}
	public Category get(int cid)
	{
		return categoryDAO.get(cid);
	}
	public Category getCategoryByName(String cname)
	{
		return categoryDAO.getCategoryByName(cname);
	}
	public void delete(int cid)
	{
		categoryDAO.delete(cid);
	}



}

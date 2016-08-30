package com.niit.dao;

import java.util.List;

import com.niit.model.Category;


public interface CategoryDAO {

	

	public List<Category> list();

	public Category get(int cid);

	public void saveOrUpdate(Category category);

	public void delete(int cid);

	public Category getCategoryByName(String cname);
	
    public boolean isValidCredentials(String Category, Boolean isAdmin, String pass);


	
}

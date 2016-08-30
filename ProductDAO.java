package com.niit.dao;

import java.util.List;

import com.niit.model.Product;

public interface ProductDAO {

	public List<Product> list();

	public Product get(int pid);

	public void saveOrUpdate(Product product);

	public void delete(int pid);
	
	public Product getProductByName(String pname);
	
    public boolean isValidCredentials(String product, Boolean isAdmin, String pass);

	
	
	
}

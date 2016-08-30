package com.niit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.niit.dao.ProductDAO;
import com.niit.model.Product;

public interface ProductServiceInterface {
	
	public void saveOrUpdate(Product product);
	public List<Product> list();
	public Product get(int pid);
	public void delete(int pid);

	

	
}

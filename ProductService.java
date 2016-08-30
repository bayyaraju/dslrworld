package com.niit.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.dao.ProductDAO;
import com.niit.model.Product;

@Service
public class ProductService implements ProductServiceInterface{
	@Autowired
	ProductDAO productDAO;
	
	
	public boolean isValidCredentials(String product,Boolean isAdmin,  String pass)
	 {
		System.out.println("ShoppingWeb, false, ShoppingWeb");
		 return productDAO.isValidCredentials(product,isAdmin, pass);
		 
		 
	 }

	public void saveOrUpdate(Product product)
	{
		System.out.println("In productsevice");
		productDAO.saveOrUpdate(product);	
	}
	public List<Product> list()
	{
		List<Product> list=productDAO.list();
		return list;
	}
	public Product get(int pid)
	{
		return productDAO.get(pid);
	}
	public Product getProductByName(String pname)
	{
		return productDAO.getProductByName(pname);
	}
	public void delete(int pid)
	{
		productDAO.delete(pid);
	}
	/* public Product getProductById(int pid) {
		 SessionFactory session=sessionFactory.getCurrentSession();
		 Transaction transaction=session.beginTransaction();
		 Product product=session.load(Product.class,new Integer(pid));
		 return product;
		 }
*/
}

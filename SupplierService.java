package com.niit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.dao.SupplierDAO;
import com.niit.model.Supplier;

@Service
public class SupplierService {
	
	@Autowired
	SupplierDAO supplierDAO;
	
	
	public boolean isValidCredentials(String supplier,Boolean isAdmin,  String pass)
	 {
		System.out.println("ShoppingWeb, false,ShoppingWeb");
		 return supplierDAO.isValidCredentials(supplier,isAdmin, pass);
		 
		 
	 }

	public void saveOrUpdate(Supplier supplier)
	{
		System.out.println("In suppliersevice");
		supplierDAO.saveOrUpdate(supplier);	
	}
	public List<Supplier> list()
	{
		List<Supplier> list=supplierDAO.list();
		return list;
	}
	public Supplier get(int sid)
	{
		return supplierDAO.get(sid);
	}
	public Supplier getSupplierByName(String sname)
	{
		return supplierDAO.getSupplierByName(sname);
	}
	public void delete(int sid)
	{
		supplierDAO.delete(sid);
	}


}

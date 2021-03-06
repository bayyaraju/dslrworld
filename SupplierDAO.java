package com.niit.dao;

import java.util.List;

import com.niit.model.Supplier;

public interface SupplierDAO {

	public List<Supplier> list();

	public Supplier get(int sid);

	public void saveOrUpdate(Supplier supplier);

	public void delete(int sid);
	
	public Supplier getSupplierByName(String sname);
	
    public boolean isValidCredentials(String supplier, Boolean isAdmin, String pass);


	
	
	
}

package com.niit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.dao.UserDAO;
import com.niit.model.User;

@Service
public class UserService implements UserServiceInterface {
	@Autowired
	UserDAO userDAO;
	
	
	public boolean isValidCredentials(String user,Boolean isAdmin,  String pass)
	 {
		System.out.println("ShoppingWeb, false,ShoppingWeb");
		 return userDAO.isValidCredentials(user,isAdmin, pass);
		 
		 
	 }

	public void saveOrUpdate(User user)
	{
		System.out.println("In usersevice");
		System.out.println("user id in service"+user.getUid());
		userDAO.saveOrUpdate(user);	
	}
	public List<User> list()
	{
		List<User> list=userDAO.list();
		return list;
	}
	public User get(int uid)
	{
		return userDAO.get(uid);
	}
	public User getUserByName(String uname)
	{
		return userDAO.getUserByName(uname);
	}
	public void delete(int uid)
	{
		userDAO.delete(uid);
	}

	public User getusername(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isvaliduser(String user, String pass, boolean isAdmin) {
		// TODO Auto-generated method stub
		return false;
	}

}

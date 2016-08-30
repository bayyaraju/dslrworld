package com.niit.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class UserRole {

	
	
	@Id

	private int user_role_id;
	 
	private String authority;
	
	public int getUser_role_id() {
		return user_role_id;
	}
	public void setUser_role_id(int user_role_id) {
		this.user_role_id = user_role_id;
	}
	public String getAuthority() {
		return authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}
	
	/*@OneToOne(mappedBy="user")
	public User user;

	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	*/
}
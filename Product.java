package com.niit.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Table
@Component

public class Product {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	private int pid;
	private String pname;
	private String pdescription;
	private String pquantity;
	public String getPquantity() {
		return pquantity;
	}
	public void setPquantity(String pquantity) {
		this.pquantity = pquantity;
	}
	private int price;
	public int getPrice() {
		return price;
	}
	@Transient
	private MultipartFile img;
	
	public MultipartFile getImg() {
		return img;
	}
	public void setImg(MultipartFile img) {
		this.img = img;
	}
	public void setPrice(int price) {
		
		this.price = price;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPdescription() {
		return pdescription;
	}
	public void setPdescription(String pdescription) {
		this.pdescription = pdescription;
	}
	public Product getData() {
		// TODO Auto-generated method stub
		return null;
	}
	@ManyToOne(cascade = CascadeType.PERSIST)
	 @NotNull(message="first name cannot be empty")
	    @Valid
	@JoinColumn(name="supplier_id",nullable = false, updatable = false, insertable = false,referencedColumnName="SID")

	private Supplier supplier;

	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	

	@ManyToOne(cascade = CascadeType.PERSIST)
	 @NotNull(message="first name cannot be empty")
	    @Valid
	    @JoinColumn(name="category_id", nullable = false, updatable = false, insertable = false,referencedColumnName="CID")
  	private Category category;
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	
	}


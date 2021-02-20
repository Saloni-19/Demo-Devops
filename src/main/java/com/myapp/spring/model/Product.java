package com.myapp.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="category")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer categoryId;
	private String categoryName;
	private Double price;
	private String description;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String categoryName, Double price, String description) {
		this.categoryName = categoryName;
		this.price = price;
		this.description = description;
	}

	public Integer getcategoryId() {
		return categoryId;
	}

	public void setcategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getcategoryName() {
		return categoryName;
	}

	public void setcategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}

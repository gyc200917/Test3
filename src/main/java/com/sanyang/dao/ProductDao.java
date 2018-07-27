package com.sanyang.dao;

import java.util.List;

import com.sanyang.pojo.Product;
import com.sanyang.pojo.ProductType;

public interface ProductDao {
	public List<Product> getAllPro();
	
	public Product getPro(int pid);
	
	public List<ProductType> getAllType();
	
	public void addPro(Product product);
}

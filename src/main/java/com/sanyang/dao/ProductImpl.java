package com.sanyang.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sanyang.mapper.ProductMapper;
import com.sanyang.pojo.Product;
import com.sanyang.pojo.ProductType;

@Repository("dao")
public class ProductImpl implements ProductDao {

	@Autowired
	private ProductMapper mapper;
	
	
	@Override
	public List<Product> getAllPro() {
		// TODO Auto-generated method stub
		return mapper.getAllPro();
	}


	@Override
	public Product getPro(int pid) {
		// TODO Auto-generated method stub
		return mapper.getPro(pid);
	}


	@Override
	public List<ProductType> getAllType() {
		// TODO Auto-generated method stub
		return mapper.getAllType();
	}


	@Override
	public void addPro(Product product) {
		// TODO Auto-generated method stub
		mapper.addPro(product);
	}

}

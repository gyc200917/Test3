package com.sanyang.hendler;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sanyang.dao.ProductDao;
import com.sanyang.pojo.Product;
import com.sanyang.pojo.ProductType;

@Controller
public class ProductHendler {
	
	@Autowired
	private ProductDao dao;
	
	@RequestMapping("/getAllPro")
	public String getAllPro(Map<String, Object> map) {
		
		List<Product> allPro = dao.getAllPro();
		List<ProductType> allType = dao.getAllType();
		map.put("allPro", allPro);
		map.put("allType", allType);
		return "list";
		
	}
	
	@RequestMapping("/getPro")
	public String getPro(Map<String, Object> map,Product product) {
		
		Product pro = dao.getPro(product.getPid());
		map.put("pro", pro);
		return "list2";
		
	}
	
	@RequestMapping("/getAllType")
	public String getAllType(Map<String, Object> map) {
		List<ProductType> allType = dao.getAllType();
		map.put("allType", allType);
		return "add";
		
	}
	
	@RequestMapping("/addPro")
	public String addPro(Product product) {
		dao.addPro(product);
		return "redirect:getAllPro.gyc";
		
	}

}

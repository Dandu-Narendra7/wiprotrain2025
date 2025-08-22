package com.wipro.productmgm.service;

import java.util.List;
import com.wipro.productmgm.entity.Product;
import com.wipro.productmgm.repo.ProductRepo;
import com.wipro.productmgm.entity.Product;

public class ProductService {
	public List<Product> findAll();
	public Product findById(int id);
	
	public void save(Product product);
	
	public void deleteById(int id);
	

}

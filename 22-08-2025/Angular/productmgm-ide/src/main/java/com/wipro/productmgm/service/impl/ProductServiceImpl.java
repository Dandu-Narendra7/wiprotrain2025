package com.wipro.productmgm.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.productmgm.entity.Product;
import com.wipro.productmgm.repo.ProductRepo;

@Service
public class ProductServiceImpl {
	@Autowired
	ProductRepo productRepo;
	
	public List<Product> findAll() {	
		return productRepo.findAll();
	}

	public Product findById(int id) {	
		Optional<Product> productOpt= productRepo.findById(id);
		if(productOpt.isPresent())
		{
			return productOpt.get();
		}
		return null;
	}
	
	public void save(Product product) {	
		productRepo.save(product);
	}

	public void deleteById(int id) {
		productRepo.deleteById(id);
	}


}

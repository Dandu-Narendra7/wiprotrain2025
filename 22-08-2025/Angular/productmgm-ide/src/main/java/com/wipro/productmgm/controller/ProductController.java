package com.wipro.productmgm.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.wipro.productmgm.entity.Product;
import com.wipro.productmgm.repo.ProductRepo;
import com.wipro.productmgm.service.*;
public class ProductController {
	@Autowired
	ProductService ProductService;
	
	@GetMapping
	List<Product> findAll()
	{
		return ProductService.findAll();
	}
	@GetMapping("/{id}")
	Product findById(@PathVariable int id)
	{
		return ProductService.findById(id);
	}
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable int id)
	{
		 ProductService.deleteById(id);
	}
	@PostMapping
	void save(@RequestBody Product product)
	{
		ProductService.save(product);
		
	}
	
	@PutMapping
	void update(@RequestBody Product product)
	{
		ProductService.save(product);
		
	} 
	}

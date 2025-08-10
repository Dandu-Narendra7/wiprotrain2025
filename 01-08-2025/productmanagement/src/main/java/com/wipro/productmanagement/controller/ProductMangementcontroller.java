package com.wipro.productmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.mapping.PersistentEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.wipro.productmanagement.entity.ProductEntity;

@Tag(name = "Product", description = "Tutorial management APIs")
@RestController
@RequestMapping("/ProductEntity")
public class ProductMangementcontroller {
	@Autowired
	ProductEntity productServices;
	
	@PostMapping
	void save(@RequestBody ProductEntity productentity)
	{
		productentity.save(productentity);
	}
	
	@GetMapping
	List<ProductEntity> findAll()
	{
		return PersistentEntity.findAll();
	}
	@GetMapping("/{id}")
	void findById(@PathVariable int id)
	{
		productServices.findById(id);
	}
	@PutMapping 
	void update(@RequestBody ProductEntity productentity) {

	@DeleteMapping("/{id}")
	void deleteById(@PathVariable int id)
	{
		ProductEntity.deleteById(id);
	}
	@GetMapping("/page/{pageNum}/{pageSize}/{sortOrder}")
	public Page<ProductEntity> findAllPage(@PathVariable int  pageNum,@PathVariable int  pageSize,@PathVariable int  sortOrder) {
		Pageable p=null;
	  if(sortOrder==0)
	  {
		  p=PageRequest.of(pageNum, pageSize,Sort.by("productPrice").descending());
	  }
	  else
	  {
		    p=PageRequest.of(pageNum, pageSize,Sort.by("productPrice;").ascending());
	  }
		
		return ProductEntity.findAll(p);
	}
 
	

}

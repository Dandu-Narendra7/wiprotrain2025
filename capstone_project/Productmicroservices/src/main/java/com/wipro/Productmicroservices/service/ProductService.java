package com.wipro.Productmicroservices.service;

import java.util.List;

import com.wipro.Productmicroservices.entity.Product;
public interface ProductService {
    Product create(Product p);
    Product update(Integer id, Product p);
    void delete(Integer id);
    List<Product> findAll();
    Product findById(Integer id);
}
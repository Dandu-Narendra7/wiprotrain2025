package com.wipro.productmgm.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.productmgm.entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {


}

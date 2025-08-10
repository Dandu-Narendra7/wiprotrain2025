package com.wipro.productmanagement.repo;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.wipro.productmanagement.entity.ProductEntity;
@Repository

public interface ProductRepo extends JpaRepository<ProductEntity,Integer>
{
	 List<ProductEntity> findByProductMake(String ProductMake );

}

package com.wipro.Productmicroservices.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.wipro.Productmicroservices.entity.Product;
import com.wipro.Productmicroservices.entity.repository.ProductRepository;
import com.wipro.Productmicroservices.exception.ProductNotFoundException;
import com.wipro.Productmicroservices.service.ProductService;



@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    private final ProductRepository repository;

    public ProductServiceImpl(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public Product create(Product p) {
        //p.setId();
        return repository.save(p);
    }

    @Override
    public Product update(Integer id, Product p) {
        Product existing = repository.findById(id).orElseThrow(() -> new ProductNotFoundException(id));
        existing.setProdName(p.getProdName());
        existing.setProdDesc(p.getProdDesc());
        existing.setProdCat(p.getProdCat());
        existing.setMake(p.getMake());
        existing.setAvailableQty(p.getAvailableQty());
        existing.setPrice(p.getPrice());
        existing.setUom(p.getUom());
        existing.setProdRating(p.getProdRating());
        existing.setImageURL(p.getImageURL());
        existing.setDateOfManufacture(p.getDateOfManufacture());
        return repository.save(existing);
    }

    @Override
    public void delete(Integer id) {
        if (!repository.existsById(id)) {
            throw new ProductNotFoundException(id);
        }
        repository.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Product> findAll() {
        return repository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Product findById(Integer id) {
        return repository.findById(id).orElseThrow(() -> new ProductNotFoundException(id));
    }
}

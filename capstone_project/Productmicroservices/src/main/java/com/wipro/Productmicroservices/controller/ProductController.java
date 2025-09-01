package com.wipro.Productmicroservices.controller;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.wipro.Productmicroservices.entity.Product;
import com.wipro.Productmicroservices.exception.ProductNotFoundException;
import com.wipro.Productmicroservices.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/product")
@Tag(name = "Product Management", description = "CRUD APIs for Product catalog")
public class ProductController {

	@Autowired
    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @Operation(summary = "Create a new product") 
    @ApiResponses({
        @ApiResponse(responseCode = "201", description = "Product created")
    })
    @PostMapping("/create")
    public ResponseEntity<Product> create(@RequestBody Product product) {
        Product saved = service.create(product);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @Operation(summary = "Update an existing product")
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "Product updated"),
        @ApiResponse(responseCode = "404", description = "Product not found")
    })
    @PutMapping("/{id}")
    public ResponseEntity<Product> update(@PathVariable Integer id, @Valid @RequestBody Product product) {
        Product updated = service.update(id, product);
        return ResponseEntity.ok(updated);
    }

    @Operation(summary = "Delete a product")
    @ApiResponses({
        @ApiResponse(responseCode = "204", description = "Product deleted"),
        @ApiResponse(responseCode = "404", description = "Product not found")
    })
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @Operation(summary = "List all products")
    @GetMapping
    public ResponseEntity<List<Product>> list() {
        return ResponseEntity.ok(service.findAll());
    }

    @Operation(summary = "Get product by id")
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "Product found"),
        @ApiResponse(responseCode = "404", description = "Product not found")
    })
    @GetMapping("/{id}")
    public ResponseEntity<Product> get(@PathVariable Integer id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<String> handleNotFound(ProductNotFoundException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
    }
}

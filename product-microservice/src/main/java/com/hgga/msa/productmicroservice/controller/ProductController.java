package com.hgga.msa.productmicroservice.controller;

import com.hgga.msa.productmicroservice.entity.ProductEntity;
import com.hgga.msa.productmicroservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    // Endpoint to retrieve all products
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductEntity> getAllProducts() {
        return productService.getAllProducts();
    }

    // Endpoint to retrieve a product by ID
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<ProductEntity> getProductById(@PathVariable String id) {
        return productService.getProductById(id);
    }

    // Endpoint to create a new product
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProductEntity createProduct(@RequestBody ProductEntity productEntity) {
        return productService.createProduct(productEntity);
    }

    // Endpoint to update an existing product
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ProductEntity updateProduct(@PathVariable String id, @RequestBody ProductEntity productEntity) {
        return productService.updateProduct(id, productEntity);
    }

    // Endpoint to delete a product by ID
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteProduct(@PathVariable String id) {
        productService.deleteProduct(id);
    }
}

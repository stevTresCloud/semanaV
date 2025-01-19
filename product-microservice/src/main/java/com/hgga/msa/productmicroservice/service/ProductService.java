package com.hgga.msa.productmicroservice.service;

import com.hgga.msa.productmicroservice.entity.ProductEntity;
import com.hgga.msa.productmicroservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    // Create a new product
    public ProductEntity createProduct(ProductEntity productEntity) {
        return productRepository.save(productEntity);
    }

    // Retrieve all products
    public List<ProductEntity> getAllProducts() {
        return productRepository.findAll();
    }

    // Retrieve a product by ID
    public Optional<ProductEntity> getProductById(String id) {
        return productRepository.findById(id);
    }

    // Update an existing product
    public ProductEntity updateProduct(String id, ProductEntity productEntity) {
        productEntity.setId(id);
        return productRepository.save(productEntity);
    }

    // Delete a product by ID
    public void deleteProduct(String id) {
        productRepository.deleteById(id);
    }
}

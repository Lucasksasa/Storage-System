package com.Lucas_Ferrari.Storage_System.service;

import com.Lucas_Ferrari.Storage_System.model.Product;
import com.Lucas_Ferrari.Storage_System.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository productRepository;


    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product addProduct(Product product){
        return productRepository.save(product);
    }

    public Optional<Product> listProductsById(Long id){
        return productRepository.findById(id);
    }

    public List<Product> listAllProducts(Product product){
        return productRepository.findAll();
    }






}

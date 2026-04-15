package com.Lucas_Ferrari.Storage_System.controller;

import com.Lucas_Ferrari.Storage_System.model.Product;
import com.Lucas_Ferrari.Storage_System.service.ProductService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public Product addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }

}

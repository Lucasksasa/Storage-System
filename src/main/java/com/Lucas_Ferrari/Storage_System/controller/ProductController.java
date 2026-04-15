package com.Lucas_Ferrari.Storage_System.controller;

import com.Lucas_Ferrari.Storage_System.model.Product;
import com.Lucas_Ferrari.Storage_System.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("{id}")
    public Optional<Product> productByID(@PathVariable Long id){
        return productService.listProductsById(id);
    }

    @GetMapping
    public List<Product> listOfProducts(){
        return productService.listAllProducts();
    }

    @DeleteMapping("{id}")
    public void deleteProduct(@PathVariable Long id){
        productService.deleteProductById(id);
    }

    @PutMapping("{id}")
    public ResponseEntity<Product> productUpdate(@PathVariable Long id, @RequestBody Product productUpdated) {

        Product product = productService.UpdateProduct(id, productUpdated);

        return ResponseEntity.ok(product);
    }

}

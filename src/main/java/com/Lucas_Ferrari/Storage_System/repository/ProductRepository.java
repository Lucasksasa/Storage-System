package com.Lucas_Ferrari.Storage_System.repository;

import com.Lucas_Ferrari.Storage_System.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

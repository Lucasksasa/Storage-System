package com.Lucas_Ferrari.Storage_System.service;

import com.Lucas_Ferrari.Storage_System.model.Loan;
import com.Lucas_Ferrari.Storage_System.model.Product;
import com.Lucas_Ferrari.Storage_System.model.User;
import com.Lucas_Ferrari.Storage_System.repository.LoanRepository;
import com.Lucas_Ferrari.Storage_System.repository.ProductRepository;
import com.Lucas_Ferrari.Storage_System.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class LoanService {

    private ProductRepository productRepository;
    private UserRepository userRepository;
    private LoanRepository loanRepository;

    public LoanService(ProductRepository productRepository,
                       UserRepository userRepository,
                       LoanRepository loanRepository) {
        this.productRepository = productRepository;
        this.userRepository = userRepository;
        this.loanRepository = loanRepository;
    }

    public Loan createLoan(Long userId, Long productId, Integer quantity){
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));

        Product product = productRepository.findById(productId)
                .orElseThrow(() -> new RuntimeException("Product not found"));

        if (product.getQuantityInStorage() < quantity){
            throw new RuntimeException("insufficient stock");
        }

        product.setQuantityInStorage(product.getQuantityInStorage() - quantity);
        productRepository.save(product);

        Loan loan = new Loan();

        loan.setUser(user);
        loan.setProduct(product);
        loan.setQuantity(quantity);
        loan.setDate(LocalDateTime.now());

        return loanRepository.save(loan);
    }
}

package com.Lucas_Ferrari.Storage_System.controller;

import com.Lucas_Ferrari.Storage_System.dto.LoanRequestDTO;
import com.Lucas_Ferrari.Storage_System.model.Loan;
import com.Lucas_Ferrari.Storage_System.service.LoanService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/loans")
public class LoanController {

    private LoanService loanService;

    public LoanController(LoanService loanService) {
        this.loanService = loanService;
    }

    @PostMapping
    public ResponseEntity<Loan> createLoan(@RequestBody LoanRequestDTO request){
        Loan loan = loanService.createLoan(
                request.getUserId(),
                request.getProductId(),
                request.getQuantity()
        );

        return ResponseEntity.ok(loan);
    }
}

package com.Lucas_Ferrari.Storage_System.repository;

import com.Lucas_Ferrari.Storage_System.model.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<Loan, Long> {
}

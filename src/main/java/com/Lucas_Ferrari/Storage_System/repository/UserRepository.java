package com.Lucas_Ferrari.Storage_System.repository;

import com.Lucas_Ferrari.Storage_System.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

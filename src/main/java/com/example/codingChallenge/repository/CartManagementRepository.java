package com.example.codingChallenge.repository;

import com.example.codingChallenge.model.CartManagement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartManagementRepository extends JpaRepository<CartManagement, Long> {
}

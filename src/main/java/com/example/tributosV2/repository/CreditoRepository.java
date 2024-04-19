package com.example.tributosV2.repository;

import com.example.tributosV2.model.Credito.Credito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditoRepository extends JpaRepository<Credito, Long> {
}

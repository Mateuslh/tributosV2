package com.example.tributosV2.repository;

import com.example.tributosV2.model.Debito.Debito;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DebitoRepository extends JpaRepository<Debito, Long> {
}

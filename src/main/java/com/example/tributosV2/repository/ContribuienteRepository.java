package com.example.tributosV2.repository;

import com.example.tributosV2.model.Contribuinte.Contribuinte;
import com.example.tributosV2.model.Economico.Economico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContribuienteRepository extends JpaRepository<Contribuinte, Long> {
}

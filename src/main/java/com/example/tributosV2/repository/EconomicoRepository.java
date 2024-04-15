package com.example.tributosV2.repository;

import com.example.tributosV2.model.Economico.Economico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EconomicoRepository extends JpaRepository<Economico, Long> {

}

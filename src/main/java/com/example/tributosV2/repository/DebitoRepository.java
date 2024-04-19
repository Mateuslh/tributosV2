package com.example.tributosV2.repository;

import com.example.tributosV2.model.Debito.Debito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface DebitoRepository extends JpaRepository<Debito, Long> {
    public List<Debito> findDebitoByContribuinteId(Long id);
    public List<Debito> findDebitoByEconomicoId(Long id);
    public List<Debito> findDebitoByImovelId(Long id);
}

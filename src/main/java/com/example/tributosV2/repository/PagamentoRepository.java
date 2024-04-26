package com.example.tributosV2.repository;

import com.example.tributosV2.model.Pagamento.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {
    public List<Pagamento> findPagamentosByDebitoId(Long id);
    public List<Pagamento> findPagamentosByContribuinteId(Long id);
    public List<Pagamento> findPagamentosByCreditoId(Long id);
}

package com.example.tributosV2.repository;

import com.example.tributosV2.model.Pagamento.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {
    List<Pagamento> findPagamentosByDebitoId(Long id);

    List<Pagamento> findPagamentosByContribuinteId(Long id);

    List<Pagamento> findPagamentosByCreditoId(Long id);
}

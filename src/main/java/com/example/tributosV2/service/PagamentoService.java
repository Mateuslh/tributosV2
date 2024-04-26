package com.example.tributosV2.service;

import com.example.tributosV2.model.Credito.Credito;
import com.example.tributosV2.model.Pagamento.Pagamento;
import com.example.tributosV2.repository.CreditoRepository;
import com.example.tributosV2.repository.PagamentoRepository;
import org.springframework.stereotype.Service;

@Service
public class PagamentoService extends AbstractCadastralService<Pagamento, PagamentoRepository> {
}

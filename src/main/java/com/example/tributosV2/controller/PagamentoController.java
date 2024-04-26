package com.example.tributosV2.controller;

import com.example.tributosV2.model.Pagamento.Pagamento;
import com.example.tributosV2.service.PagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pagamento")
public class PagamentoController extends AbstractCadastralController<Pagamento, PagamentoService> {
    @Autowired
    public PagamentoController(PagamentoService service) {
        super(service, Pagamento.class);
    }
}

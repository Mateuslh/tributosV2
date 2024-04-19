package com.example.tributosV2.resource.controller;

import com.example.tributosV2.model.Debito.Debito;
import com.example.tributosV2.service.DebitoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/credito")
public class CreditoController extends AbstractCadastralController<Debito, DebitoService> {
    @Autowired
    public CreditoController(DebitoService service) {
        super(service, Debito.class);
    }
}

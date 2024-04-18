package com.example.tributosV2.resource.controller;

import com.example.tributosV2.model.Contribuinte.Contribuinte;
import com.example.tributosV2.service.ContribuienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/contribuiente")
public class ContribuienteController extends AbstractCadastralController<Contribuinte, ContribuienteService> {

    @Autowired
    public ContribuienteController(ContribuienteService service) {
        super(service, Contribuinte.class);
    }
}

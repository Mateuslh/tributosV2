package com.example.tributosV2.controller;

import com.example.tributosV2.model.Contribuinte.PessoaFisica;
import com.example.tributosV2.service.PessoaFisicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pessoaFisica")
public class PessoaFisicaController extends AbstractCadastralController<PessoaFisica, PessoaFisicaService> {
    @Autowired
    public PessoaFisicaController(PessoaFisicaService service) {
        super(service, PessoaFisica.class);
    }
}

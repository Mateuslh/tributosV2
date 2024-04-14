package com.example.tributosV2.resource.controller;

import com.example.tributosV2.model.Contribuinte.PessoaFisica;
import com.example.tributosV2.repository.PessoaFisicaRepository;
import com.example.tributosV2.service.PessoaFisicaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pessoaFisica")
public class PessoaFisicaController extends AbstractCadastralController<PessoaFisica, PessoaFisicaService> {
    @Override
    protected Class<PessoaFisica> getEntityClass() {
        return PessoaFisica.class;
    }
}

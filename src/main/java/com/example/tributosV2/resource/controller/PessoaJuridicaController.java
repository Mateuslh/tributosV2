package com.example.tributosV2.resource.controller;

import com.example.tributosV2.model.Contribuinte.PessoaJuridica;
import com.example.tributosV2.repository.PessoaJuridicaRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pessoaJuridica")
public class PessoaJuridicaController extends AbstractCadastralController<PessoaJuridica, PessoaJuridicaRepository> {
    @Override
    protected Class<PessoaJuridica> getEntityClass() {
        return PessoaJuridica.class;
    }
}

package com.example.tributosV2.resource.controller;


import com.example.tributosV2.model.Contribuinte.Contribuinte;
import com.example.tributosV2.model.imovel.Imovel;
import com.example.tributosV2.service.ContribuienteService;
import com.example.tributosV2.service.ImovelService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/contribuiente")
public class ContribuienteController extends AbstractCadastralController<Contribuinte, ContribuienteService> {
    @Override
    protected Class<Contribuinte> getEntityClass() {
        return Contribuinte.class;
    }
}

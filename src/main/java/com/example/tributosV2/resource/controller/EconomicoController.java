package com.example.tributosV2.resource.controller;

import com.example.tributosV2.model.Economico.Economico;
import com.example.tributosV2.service.EconomicoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/economico")
public class EconomicoController extends AbstractCadastralController<Economico, EconomicoService> {
    @Override
    protected Class<Economico> getEntityClass() {
        return Economico.class;
    }
}

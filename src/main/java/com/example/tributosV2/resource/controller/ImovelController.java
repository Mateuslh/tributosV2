package com.example.tributosV2.resource.controller;


import com.example.tributosV2.model.imovel.Imovel;
import com.example.tributosV2.service.ImovelService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/imovel")
public class ImovelController extends AbstractCadastralController<Imovel, ImovelService> {
    @Override
    protected Class<Imovel> getEntityClass() {
        return Imovel.class;
    }
}
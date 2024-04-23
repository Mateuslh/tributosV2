package com.example.tributosV2.controller;


import com.example.tributosV2.model.imovel.Imovel;
import com.example.tributosV2.service.ImovelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/imovel")
public class ImovelController extends AbstractCadastralController<Imovel, ImovelService> {
    @Autowired
    public ImovelController(ImovelService service) {
        super(service, Imovel.class);
    }
}

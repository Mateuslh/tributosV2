package com.example.tributosV2.resource.controller;

import com.example.tributosV2.exception.NotFoundException;
import com.example.tributosV2.model.Contribuinte.Contribuinte;
import com.example.tributosV2.service.ContribuienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/contribuiente")
public class ContribuienteController extends AbstractCadastralController<Contribuinte, ContribuienteService> {

    @Autowired
    public ContribuienteController(ContribuienteService service) {
        super(service, Contribuinte.class);
    }

    @GetMapping("/{id}/getDebitos")
    public ResponseEntity<?> getDebitos(@PathVariable Long id) throws NotFoundException {
        return ResponseEntity.ok().body(service.getDebitos(id));
    }


}

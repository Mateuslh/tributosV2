package com.example.tributosV2.controller;

import com.example.tributosV2.exception.NotFoundException;
import com.example.tributosV2.model.Economico.Economico;
import com.example.tributosV2.service.EconomicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/economico")
public class EconomicoController extends AbstractCadastralController<Economico, EconomicoService> {
    @Autowired
    public EconomicoController(EconomicoService service) {
        super(service, Economico.class);
    }

    @GetMapping("/{id}/getDebitos")
    public ResponseEntity<?> getDebitos(@PathVariable Long id) throws NotFoundException {
        return ResponseEntity.ok().body(service.getDebitos(id));
    }
}

package com.example.tributosV2.resource.controller;

import com.example.tributosV2.service.AbstractCadastralService;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public abstract class AbstractCadastralController<E, R extends AbstractCadastralService<E>> {
    @Autowired
    protected R service;

    private final ObjectMapper objectMapper = new ObjectMapper();

    @GetMapping
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok().body(service.getAll());
    }


    @PostMapping
    public ResponseEntity<?> create(@RequestBody JsonNode requestBody) {
        try {
            List<E> entities = new ArrayList<>();
            if (requestBody.isArray()) {
                for (JsonNode node : requestBody){
                    E entity = objectMapper.convertValue(node, this.getEntityClass());
                    entities.add(entity);
                }
                return ResponseEntity.ok().body(service.saveAll(entities));
            } else {
                E entity = objectMapper.convertValue(requestBody, this.getEntityClass());
                return ResponseEntity.ok().body(service.save(entity));
            }
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body("Erro ao executar operação:"+ e.getMessage());
        }
    }

    protected abstract Class<E> getEntityClass();
}

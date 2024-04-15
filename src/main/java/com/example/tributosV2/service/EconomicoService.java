package com.example.tributosV2.service;

import com.example.tributosV2.exception.NotFoundException;
import com.example.tributosV2.model.Economico.Economico;
import com.example.tributosV2.repository.EconomicoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EconomicoService extends AbstractCadastralService<Economico> {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private EconomicoRepository repository;

    @Override
    public List<Economico> saveAll(List<Economico> entitys) {
        return repository.saveAll(entitys);
    }

    public Economico save(Economico economico) {
        return repository.save(economico);
    }

    public List<Economico> getAll() {
        return repository.findAll();
    }

    public Economico getById(Long id) {
        return repository.getReferenceById(id);
    }

    public Economico update(Long id, Economico entity) {
        Optional<Economico> existingEconomicoOptional = repository.findById(id);
        if (existingEconomicoOptional.isEmpty()) {
            throw new NotFoundException("Economico não encontrado!");
        }
        Economico existingEconomico = existingEconomicoOptional.get();

        modelMapper.map(entity, existingEconomico);

        return repository.save(existingEconomico);

    }

    public void delete(Long id) {
        Optional<Economico> existingEconomicoOptional = repository.findById(id);
        if (existingEconomicoOptional.isEmpty()) {
            throw new NotFoundException("Economico não encontrado!");
        }
        repository.deleteById(id);
    }
}

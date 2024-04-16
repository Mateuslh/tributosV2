package com.example.tributosV2.service;

import com.example.tributosV2.exception.NotFoundException;
import com.example.tributosV2.model.Contribuinte.Contribuinte;
import com.example.tributosV2.model.Economico.Economico;
import com.example.tributosV2.repository.ContribuienteRepository;
import com.example.tributosV2.repository.EconomicoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContribuienteService extends AbstractCadastralService<Contribuinte> {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private ContribuienteRepository repository;

    @Override
    public List<Contribuinte> saveAll(List<Contribuinte> entitys) {
        return repository.saveAll(entitys);
    }

    public Contribuinte save(Contribuinte entity) {
        return repository.save(entity);
    }

    public List<Contribuinte> getAll() {
        return repository.findAll();
    }

    public Contribuinte getById(Long id) {
        return repository.getReferenceById(id);
    }

    public Contribuinte update(Long id, Contribuinte entity) {
        Optional<Contribuinte> existingEntityOptional = repository.findById(id);
        if (existingEntityOptional.isEmpty()) {
            throw new NotFoundException("Contribuinte não encontrado!");
        }
        Contribuinte existingEntity = existingEntityOptional.get();

        modelMapper.map(entity, existingEntity);

        return repository.save(existingEntity);

    }

    public void delete(Long id) {
        Optional<Contribuinte> existingEntityOptional = repository.findById(id);
        if (existingEntityOptional.isEmpty()) {
            throw new NotFoundException("Contribuinte não encontrado!");
        }
        repository.deleteById(id);
    }
}

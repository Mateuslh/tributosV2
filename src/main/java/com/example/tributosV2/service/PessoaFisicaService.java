package com.example.tributosV2.service;

import com.example.tributosV2.exception.NotFoundException;
import com.example.tributosV2.model.Contribuinte.PessoaFisica;
import com.example.tributosV2.repository.PessoaFisicaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaFisicaService extends AbstractCadastralService<PessoaFisica> {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private PessoaFisicaRepository repository;

    @Override
    public List<PessoaFisica> saveAll(List<PessoaFisica> entitys) {
        return repository.saveAll(entitys);
    }

    public PessoaFisica save(PessoaFisica entity) {
        return repository.save(entity);
    }

    public List<PessoaFisica> getAll() {
        return repository.findAll();
    }

    public PessoaFisica getById(Long id) {
        return repository.getReferenceById(id);
    }

    public PessoaFisica update(Long id, PessoaFisica entity) {
        Optional<PessoaFisica> existingEntityOptional = repository.findById(id);
        if (existingEntityOptional.isEmpty()) {
            throw new NotFoundException("Pessoa Física não encontrada!");
        }
        PessoaFisica existingEntity = existingEntityOptional.get();

        modelMapper.map(entity, existingEntity);

        return repository.save(existingEntity);

    }

    public void delete(Long id) {
        Optional<PessoaFisica> existingEntityOptional = repository.findById(id);
        if (existingEntityOptional.isEmpty()) {
            throw new NotFoundException("Pessoa Física não encontrada!");
        }
        repository.deleteById(id);
    }
}

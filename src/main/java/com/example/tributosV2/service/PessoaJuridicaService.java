package com.example.tributosV2.service;

import com.example.tributosV2.exception.NotFoundException;
import com.example.tributosV2.model.Contribuinte.PessoaJuridica;
import com.example.tributosV2.repository.PessoaJuridicaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaJuridicaService extends AbstractCadastralService<PessoaJuridica> {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private PessoaJuridicaRepository repository;

    @Override
    public List<PessoaJuridica> saveAll(List<PessoaJuridica> entitys) {
        return repository.saveAll(entitys);
    }

    public PessoaJuridica save(PessoaJuridica entity) {
        return repository.save(entity);
    }

    public List<PessoaJuridica> getAll() {
        return repository.findAll();
    }

    public PessoaJuridica getById(Long id) {
        return repository.getReferenceById(id);
    }

    public PessoaJuridica update(Long id, PessoaJuridica entity) {
        Optional<PessoaJuridica> existingEntityOptional = repository.findById(id);
        if (existingEntityOptional.isEmpty()) {
            throw new NotFoundException("Pessoa Juridica não encontrada!");
        }
        PessoaJuridica existingPessoaFisica = existingEntityOptional.get();

        modelMapper.map(entity, existingPessoaFisica);

        return repository.save(existingPessoaFisica);

    }

    public void delete(Long id) {
        Optional<PessoaJuridica> existingEntityOptional = repository.findById(id);
        if (existingEntityOptional.isEmpty()) {
            throw new NotFoundException("Pessoa Juridica não encontrada!");
        }
        repository.deleteById(id);
    }
}

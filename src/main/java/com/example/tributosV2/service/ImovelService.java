package com.example.tributosV2.service;

import com.example.tributosV2.exception.NotFoundException;
import com.example.tributosV2.model.imovel.Imovel;
import com.example.tributosV2.repository.ImovelRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ImovelService extends AbstractCadastralService<Imovel> {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private ImovelRepository repository;

    @Override
    public List<Imovel> saveAll(List<Imovel> entitys) {
        return repository.saveAll(entitys);
    }

    public Imovel save(Imovel entity) {
        return repository.save(entity);
    }

    public List<Imovel> getAll() {
        return repository.findAll();
    }

    public Imovel getById(Long id) {
        return repository.getReferenceById(id);
    }

    public Imovel update(Long id, Imovel entity) {
        Optional<Imovel> existingEntityOptional = repository.findById(id);
        if (existingEntityOptional.isEmpty()) {
            throw new NotFoundException("Imovel não encontrado!");
        }
        Imovel existingEntity = existingEntityOptional.get();

        modelMapper.map(entity, existingEntity);

        return repository.save(existingEntity);

    }

    public void delete(Long id) {
        Optional<Imovel> existingEntityOptional = repository.findById(id);
        if (existingEntityOptional.isEmpty()) {
            throw new NotFoundException("Imovel não encontrado!");
        }
        repository.deleteById(id);
    }
}

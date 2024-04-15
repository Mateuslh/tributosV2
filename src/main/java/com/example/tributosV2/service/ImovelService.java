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

    public Imovel save(Imovel Imovel) {
        return repository.save(Imovel);
    }

    public List<Imovel> getAll() {
        return repository.findAll();
    }

    public Imovel getById(Long id) {
        return repository.getReferenceById(id);
    }

    public Imovel update(Long id, Imovel entity) {
        Optional<Imovel> existingImovelOptional = repository.findById(id);
        if (existingImovelOptional.isEmpty()) {
            throw new NotFoundException("Imovel não encontrado!");
        }
        Imovel existingImovel = existingImovelOptional.get();

        modelMapper.map(entity, existingImovel);

        return repository.save(existingImovel);

    }

    public void delete(Long id) {
        Optional<Imovel> existingImovelOptional = repository.findById(id);
        if (existingImovelOptional.isEmpty()) {
            throw new NotFoundException("Imovel não encontrado!");
        }
        repository.deleteById(id);
    }
}

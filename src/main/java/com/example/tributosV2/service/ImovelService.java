package com.example.tributosV2.service;

import com.example.tributosV2.exception.NotFoundException;
import com.example.tributosV2.model.Debito.Debito;
import com.example.tributosV2.model.Imovel.Imovel;
import com.example.tributosV2.repository.DebitoRepository;
import com.example.tributosV2.repository.ImovelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImovelService extends AbstractCadastralService<Imovel, ImovelRepository> {
    @Autowired
    protected DebitoRepository debitoRepository;

    public List<Debito> getDebitos(Long imovelId) throws NotFoundException {
        return debitoRepository.findDebitoByImovelId(imovelId);
    }
}

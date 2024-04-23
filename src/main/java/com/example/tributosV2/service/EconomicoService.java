package com.example.tributosV2.service;

import com.example.tributosV2.exception.NotFoundException;
import com.example.tributosV2.model.Debito.Debito;
import com.example.tributosV2.model.Economico.Economico;
import com.example.tributosV2.repository.DebitoRepository;
import com.example.tributosV2.repository.EconomicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EconomicoService extends AbstractCadastralService<Economico, EconomicoRepository> {

    @Autowired
    protected DebitoRepository debitoRepository;

    public List<Debito> getDebitos(Long contribuinteId) throws NotFoundException {
        return debitoRepository.findDebitoByContribuinteId(contribuinteId);
    }
}

package com.example.tributosV2.service;

import com.example.tributosV2.exception.NotFoundException;
import com.example.tributosV2.model.Debito.Debito;
import com.example.tributosV2.model.enums.ReferenteGuia;
import com.example.tributosV2.repository.DebitoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DebitoService extends AbstractCadastralService<Debito, DebitoRepository> {
    public List<Debito> getByReferente(Long idReferente, ReferenteParcela referenteParcela) throws NotFoundException {
        switch (referenteParcela){
            case CONTRIBUINTE -> {
                return repository.findDebitoByContribuinteId(idReferente);
            }
            case ECONOMICOS -> {
                return repository.findDebitoByEconomicoId(idReferente);
            }
            case IMOVEIS -> {
                return repository.findDebitoByImovelId(idReferente);
            }
        }
        throw new NotFoundException("O tipo de referente " + referenteParcela.name() + " não existe.");
    }
}

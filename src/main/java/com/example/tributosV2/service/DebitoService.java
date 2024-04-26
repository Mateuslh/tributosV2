package com.example.tributosV2.service;

import com.example.tributosV2.exception.NotFoundException;
import com.example.tributosV2.exception.ValidationException;
import com.example.tributosV2.model.Debito.Debito;
import com.example.tributosV2.model.enums.ReferenteGuia;
import com.example.tributosV2.repository.DebitoRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class DebitoService extends AbstractCadastralService<Debito, DebitoRepository> {
    public List<Debito> getByReferente(Long idReferente, ReferenteGuia referenteGuia) throws NotFoundException {
        switch (referenteGuia) {
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
        throw new NotFoundException("O tipo de referente " + referenteGuia.name() + " não existe.");
    }

    public void validate(Debito debito) throws ValidationException {
        if (debito.getEconomico() == null && debito.getContribuinte() == null && debito.getImovel() == null) {
            throw new ValidationException("Um referente deve ser preenchido.");
        }
        if (debito.getReferente() == null) {
            throw new ValidationException("O referente não pode ser nulo.");
        }
        if ((debito.getEconomico() == null && debito.getReferente() == ReferenteGuia.ECONOMICOS) ||
                (debito.getContribuinte() == null && debito.getReferente() == ReferenteGuia.CONTRIBUINTE) ||
                (debito.getImovel() == null && debito.getReferente() == ReferenteGuia.IMOVEIS)) {
            throw new ValidationException("O débito deve estar associado ao referente selecionado.");
        }
        if (debito.getValueTotal().compareTo(BigDecimal.ZERO) < 0) {
            throw new ValidationException("O valor final deve ser maior que 0.");
        }
    }
}

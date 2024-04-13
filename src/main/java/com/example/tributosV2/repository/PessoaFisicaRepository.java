package com.example.tributosV2.repository;

import com.example.tributosV2.model.Contribuinte.PessoaFisica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaFisicaRepository  extends JpaRepository<PessoaFisica,Long>/*, CustomQuerydslPredicateExecutor<PessoaFisica> */{

}

package com.example.tributosV2.model.Contribuinte;

import com.example.tributosV2.model.EntityId.EntityId;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public abstract class Contribuinte extends EntityId {

    @Column(name="codigo",nullable = false,unique = true)
    private Long codigo;

    @Column(name="nome",nullable = false)
    private String nome;
    @Enumerated(EnumType.STRING)
    @Column(name="situacao",nullable = false)
    private ContribuinteSituacao situacao = ContribuinteSituacao.ATIVO;

    @Column(name = "endereco", nullable = true)
    private String endereco;

    @Column(name = "email", nullable = true)
    private String email;
    @JsonIgnore
    public abstract String getDocumentoPrincipal();
}

package com.example.tributosV2.model.Contribuinte;

import com.example.tributosV2.model.EntityId.EntityId;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
public class Contribuinte extends EntityId {

    @OneToOne
    @JoinColumn(name = "pessoaFisica_id")
    private PessoaFisica pessoaFisica;

    @OneToOne
    @JoinColumn(name = "pessoaJuridica_id")
    private PessoaJuridica pessoaJuridica;

    @Column(name = "codigo", nullable = false, unique = true)
    private Long codigo;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Enumerated(EnumType.STRING)
    @Column(name = "situacao", nullable = false)
    private ContribuinteSituacao situacao = ContribuinteSituacao.ATIVO;

    @Column(name = "endereco")
    private String endereco;

    @Column(name = "email")
    private String email;
}

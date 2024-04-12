package com.example.tributosV2.model.Contribuinte;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity(name = "PessoaFisica")
@Table(name = "PessoaFisica")
public class PessoaFisica extends Contribuinte {

    @Column(name = "cpf", nullable = false,unique = true)
    private String cpf;

    @Column(name = "rg", nullable = false,unique = true)
    private String rg;

    @Override
    public String getDocumentoPrincipal() {
        return this.getCpf();
    }
}

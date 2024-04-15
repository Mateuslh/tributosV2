package com.example.tributosV2.model.Economico;

import com.example.tributosV2.exception.ValidationException;
import com.example.tributosV2.model.Contribuinte.PessoaFisica;
import com.example.tributosV2.model.Contribuinte.PessoaJuridica;
import com.example.tributosV2.model.EntityId.EntityId;
import com.example.tributosV2.util.ValidadorDocumento;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Entity(name = "Economico")
@Table(name = "Economico")
@Getter
@Setter
public class Economico extends EntityId {

    @ManyToOne
    @JoinColumn(name = "pessoaFisica_id")
    private PessoaFisica pessoaFisica;

    @ManyToOne
    @JoinColumn(name = "pessoaJuridica_id")
    private PessoaJuridica pessoaJuridica;

    @Column(name = "codigo", nullable = false, unique = true)
    private Long codigo;

    @Enumerated(EnumType.STRING)
    @Column(name = "situacao")
    private EconomicoSituacao situacao = EconomicoSituacao.INICIO;

    @Column(name = "endereco")
    private String endereco;

    @Column(name = "nome")
    private String nome;

    @Column(name = "dhInicioAtividade")
    private Timestamp dhInicioAtividade;

    @Column(name = "isAutonomo")
    private Boolean isAutonomo;

    @Column(name = "cpfCnpj")
    private String cpfCnpj;

    @Column(name = "email")
    private String email;

    public void setCpfCnpj(String cpfCnpj) {
        String cpfCnpjSemFormatacao = cpfCnpj.replace(".", "");
        if (!(ValidadorDocumento.validarCPF(cpfCnpjSemFormatacao) ||
                ValidadorDocumento.validarCNPJ(cpfCnpjSemFormatacao))) {
            throw new ValidationException("CpfCnpj não é valido para inserção!");
        }
        this.cpfCnpj = cpfCnpj;
    }
}
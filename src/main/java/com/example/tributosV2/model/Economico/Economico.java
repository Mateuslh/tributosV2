package com.example.tributosV2.model.Economico;

import com.example.tributosV2.exception.ValidationException;
import com.example.tributosV2.model.Contribuinte.Contribuinte;
import com.example.tributosV2.model.EntityId;
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
    @JoinColumn(name = "contribuinte_id", nullable = false)
    private Contribuinte contribuinte;

    @Column(name = "codigo", nullable = false, unique = true)
    private Long codigo;

    @Enumerated(EnumType.STRING)
    @Column(name = "situacao", nullable = false)
    private SituacaoEconomico situacao = SituacaoEconomico.INICIO;

    @Column(name = "endereco")
    private String endereco;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "dh_inicio_atividade")
    private Timestamp dhInicioAtividade;

    @Column(name = "is_autonomo", nullable = false)
    private Boolean isAutonomo = Boolean.FALSE;

    @Column(name = "cpf_cnpj", nullable = false)
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

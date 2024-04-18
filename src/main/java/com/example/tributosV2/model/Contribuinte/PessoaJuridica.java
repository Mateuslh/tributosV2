package com.example.tributosV2.model.Contribuinte;

import com.example.tributosV2.exception.ValidationException;
import com.example.tributosV2.model.EntityId;
import com.example.tributosV2.util.ValidadorDocumento;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Entity(name = "PessoaJuridica")
@Table(name = "PessoaJuridica")
@AllArgsConstructor
@NoArgsConstructor
public class PessoaJuridica extends EntityId {
    @Column(name = "codigo", nullable = false, unique = true)
    private Long codigo;

    @Column(name = "cnpj", nullable = false)
    private String cnpj;
    @Column(name = "inscricao_estadual")
    private String incricaoEstadual;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "endereco")
    private String endereco;

    @Column(name = "email")
    private String email;

    public void setCpf(String cnpj) {
        String cnpjSemFormatacao = cnpj.replaceAll("[./]", "");
        if (!ValidadorDocumento.validarCNPJ(cnpjSemFormatacao)) {
            throw new ValidationException("Cnpj não é valido para inserção!");
        }
        this.cnpj = cnpjSemFormatacao;
    }
}

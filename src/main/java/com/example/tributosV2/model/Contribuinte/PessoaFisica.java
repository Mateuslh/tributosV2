package com.example.tributosV2.model.Contribuinte;

import com.example.tributosV2.exception.ValidationException;
import com.example.tributosV2.model.Endereco.Endereco;
import com.example.tributosV2.model.EntityId;
import com.example.tributosV2.util.ValidadorDocumento;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "pessoa_fisica")
@Table(name = "pessoa_fisica")
@AllArgsConstructor
@NoArgsConstructor
public class PessoaFisica extends EntityId {

    @Column(name = "codigo", nullable = false, unique = true)
    private Long codigo;

    @Column(name = "cpf", nullable = false, unique = true)
    private String cpf;

    @Column(name = "rg", nullable = false, unique = true)
    private String rg;

    @Column(name = "nome", nullable = false)
    private String nome;

    @ManyToOne
    @JoinColumn(name = "endereco")
    private Endereco endereco;

    @Column(name = "email")
    private String email;

    public void setCpf(String cpf) {
        String cpfSemFormatacao = cpf.replace(".", "");
        if (!ValidadorDocumento.validarCPF(cpfSemFormatacao)) {
            throw new ValidationException("Cpf não é valido para inserção!");
        }
        this.cpf = cpfSemFormatacao;
    }

}

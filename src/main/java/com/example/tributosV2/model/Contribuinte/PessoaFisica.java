package com.example.tributosV2.model.Contribuinte;

import com.example.tributosV2.exception.ValidationException;
import com.example.tributosV2.util.ValidadorDocumento;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "PessoaFisica")
@Table(name = "PessoaFisica")
@AllArgsConstructor
@NoArgsConstructor
public class PessoaFisica extends Contribuinte {

    @Column(name = "cpf", nullable = false, unique = true)
    private String cpf;

    @Column(name = "rg", nullable = false, unique = true)
    private String rg;

    public void setCpf(String cpf) {
        String cpfSemFormatacao = cpf.replace(".", "");
        if (!ValidadorDocumento.validarCPF(cpfSemFormatacao)) {
            throw new ValidationException("Cpf não é valido para inserção!");
        }
        this.cpf = cpfSemFormatacao;
    }

    @Override
    public String getDocumentoPrincipal() {
        return this.getCpf();
    }
}

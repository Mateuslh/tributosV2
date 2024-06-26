package com.example.tributosV2.model.Contribuinte;

import com.example.tributosV2.exception.ValidationException;
import com.example.tributosV2.model.Endereco.Bairro;
import com.example.tributosV2.model.Endereco.Endereco;
import com.example.tributosV2.model.EntityId;
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
    @JoinColumn(name = "pessoa_fisica_id")
    private PessoaFisica pessoaFisica;

    @OneToOne
    @JoinColumn(name = "pessoa_juridica_id")
    private PessoaJuridica pessoaJuridica;

    @Column(name = "codigo", nullable = false, unique = true)
    private Long codigo;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Enumerated(EnumType.STRING)
    @Column(name = "situacao", nullable = false)
    private SituacaoContribuinte situacao = SituacaoContribuinte.ATIVO;

    @ManyToOne
    @JoinColumn(name = "endereco")
    private Endereco endereco;

    @Column(name = "email")
    private String email;

    public void validate() throws ValidationException {
        if ((pessoaFisica != null && pessoaJuridica != null) || (pessoaFisica == null && pessoaJuridica == null)) {
            throw new ValidationException("Apenas uma das pessoas (física ou jurídica) deve ser preenchida");
        }
    }
}

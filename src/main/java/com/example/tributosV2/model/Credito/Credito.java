package com.example.tributosV2.model.Credito;

import com.example.tributosV2.model.EntityId;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "Credito")
@Table(name = "Credito")
@Getter
@Setter
public class Credito extends EntityId {
    @Column(name = "descricao", nullable = false)
    private String descricao;

    @Column(name = "abreviatura", nullable = false)
    private String abreviatura;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipoCadastro")
    private TipoCadastroCredito tipoCadastro;
}

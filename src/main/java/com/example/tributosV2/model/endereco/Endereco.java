package com.example.tributosV2.model.endereco;

import com.example.tributosV2.model.EntityId;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Endereco extends EntityId {
    @Column
    private Boolean principal;

    @Column
    private String numero;

    @Column
    private String cep;

    @Column
    private String bloco;

    @Column
    private String complemento;

    @ManyToOne()
    @JoinColumn(name = "logradouro_id")
    private Logradouro logradouro;

    @ManyToOne()
    @JoinColumn(name = "municipio_id")
    private Municipio municipio;

    @ManyToOne()
    @JoinColumn(name = "estado_id")
    private Estado estado;

    @ManyToOne()
    @JoinColumn(name = "pais_id")
    private Pais pais;
}

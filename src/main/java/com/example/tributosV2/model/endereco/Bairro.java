package com.example.tributosV2.model.endereco;

import com.example.tributosV2.model.EntityId;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
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
public class Bairro extends EntityId {
    @Column
    private String nome;

    @Column
    private String cep;

    @Column
    private Boolean zonaRural;
}

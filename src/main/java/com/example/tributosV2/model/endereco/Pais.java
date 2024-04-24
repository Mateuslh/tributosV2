package com.example.tributosV2.model.endereco;

import com.example.tributosV2.model.EntityId;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Pais extends EntityId {
    @Column
    private Long codigo;

    @Column
    private String nome;

    @Column
    private String nome_en;

    @Column
    private String sigla;

    @Column
    private Integer bacen;
}
package com.example.tributosV2.model.Endereco;

import com.example.tributosV2.model.EntityId;
import jakarta.persistence.*;
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
public class Estado extends EntityId {
    @Column
    private Long codigo;

    @Column()
    private String nome;

    @JoinColumn(name = "pais_id")
    @ManyToOne()
    private Pais uf;

    @Column()
    private Integer ibge;

    @Column(columnDefinition = "json")
    private String ddd;
}

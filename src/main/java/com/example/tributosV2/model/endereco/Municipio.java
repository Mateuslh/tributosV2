package com.example.tributosV2.model.endereco;

import com.example.tributosV2.model.EntityId;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.awt.*;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Municipio extends EntityId {
    @Column
    private Long codigo;

    @Column()
    private String nome;

    @JoinColumn(name = "estado_id")
    @ManyToOne()
    private Estado uf;

    @Column()
    private Integer ibge;

    @Column()
    private Point lat_lot;

    @Column()
    private Double latitude;

    @Column()
    private Double longitude;

    @Column()
    private Short cod_tom;

}
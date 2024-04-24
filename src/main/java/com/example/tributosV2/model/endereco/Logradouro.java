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
public class Logradouro extends EntityId {
    @Column
    private Long codigo;

    @Column()
    private String nome;

    @JoinColumn(name = "municipio_id")
    @ManyToOne()
    private Municipio municipio;

    @Column()
    private Point lat_lot;

    @Column()
    private Double latitude;

    @Column()
    private Double longitude;


}
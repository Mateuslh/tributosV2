package com.example.tributosV2.model.imovel;

import com.example.tributosV2.model.Contribuinte.Contribuinte;
import com.example.tributosV2.model.EntityId;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Map;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Imovel extends EntityId {
    @Column(nullable = false, unique = true)
    private Long codigo;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private ImovelTipo imovelTipo = ImovelTipo.URBANO;
    @Column
    private String endereco;
    @Embedded
    private InscricaoImobiliaria inscricaoImobiliaria;
    @ManyToOne
    @JoinColumn(name = "contribuinte_id", nullable = false)
    private Contribuinte contribuinte;

    public void setInscricaoImobiliaria(@org.jetbrains.annotations.NotNull Map<String, Long> inscricaoImobiliaria) {
        this.inscricaoImobiliaria = new InscricaoImobiliaria();
        this.inscricaoImobiliaria.setCampo1(inscricaoImobiliaria.get("campo1"));
        this.inscricaoImobiliaria.setCampo2(inscricaoImobiliaria.get("campo2"));
        this.inscricaoImobiliaria.setCampo3(inscricaoImobiliaria.get("campo3"));
        this.inscricaoImobiliaria.setCampo4(inscricaoImobiliaria.get("campo4"));
    }
}

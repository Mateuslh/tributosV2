package com.example.tributosV2.model.Debito;

import com.example.tributosV2.model.Contribuinte.Contribuinte;
import com.example.tributosV2.model.Credito.Credito;
import com.example.tributosV2.model.Economico.Economico;
import com.example.tributosV2.model.EntityId;
import com.example.tributosV2.model.imovel.Imovel;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity(name = "Debito")
@Table(name = "Debito")
@Getter
@Setter
public class Debito extends EntityId {

    @ManyToOne
    @JoinColumn(name = "contribuinte_id")
    private Contribuinte contribuinte;

    @ManyToOne
    @JoinColumn(name = "imovel_id")
    private Imovel imovel;

    @ManyToOne
    @JoinColumn(name = "economico_id")
    private Economico economico;

    @Column(name = "ano", nullable = false)
    private Long ano;

    @ManyToOne
    @JoinColumn(name = "credito_id", nullable = false)
    private Credito credito;

    @Column(name = "nroParcela", nullable = false)
    private Long parcela;

    @Column(name = "situacao", nullable = false)
    private SituacaoParcela situacao;

    @Column(name = "vlLancado", nullable = false)
    private BigDecimal vlLancado;

    @Column(name = "vlCorreção", nullable = false)
    private BigDecimal vlCorreção;

    @Column(name = "vlJuros", nullable = false)
    private BigDecimal vlJuros;

    @Column(name = "vlMulta", nullable = false)
    private BigDecimal vlMulta;

    @Column(name = "vlDesconto", nullable = false)
    private BigDecimal vlDesconto;

    @Column(name = "vlBeneficio", nullable = false)
    private BigDecimal vlBeneficio;

}

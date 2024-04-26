package com.example.tributosV2.model.Debito;

import com.example.tributosV2.exception.ValidationException;
import com.example.tributosV2.model.Contribuinte.Contribuinte;
import com.example.tributosV2.model.Credito.Credito;
import com.example.tributosV2.model.Economico.Economico;
import com.example.tributosV2.model.EntityId;
import com.example.tributosV2.model.imovel.Imovel;
import com.example.tributosV2.util.BigDecimalUtils;
import jakarta.persistence.*;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Arrays;

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

    @Positive
    @Column(name = "nroParcela", nullable = false)
    private Long parcela;

    @Enumerated(EnumType.STRING)
    @Column(name = "situacao", nullable = false)
    private SituacaoParcela situacao;

    @Enumerated(EnumType.STRING)
    @Column(name = "referente", nullable = false)
    private ReferenteParcela referente;

    @Positive
    @Column(name = "vlLancado", nullable = false)
    private BigDecimal vlLancado;

    @Positive
    @Column(name = "vlCorrecao", nullable = false)
    private BigDecimal vlCorrecao;

    @Positive
    @Column(name = "vlJuros", nullable = false)
    private BigDecimal vlJuros;

    @Positive
    @Column(name = "vlMulta", nullable = false)
    private BigDecimal vlMulta;

    @Positive
    @Column(name = "vlDesconto", nullable = false)
    private BigDecimal vlDesconto;

    @Positive
    @Column(name = "vlBeneficio", nullable = false)
    private BigDecimal vlBeneficio;

    public BigDecimal getValueDescontos() {
        return BigDecimalUtils.somaLista(Arrays.asList(vlBeneficio, vlDesconto, vlMulta, vlJuros));
    }

    public BigDecimal getValueAcressimos() {
        return BigDecimalUtils.somaLista(Arrays.asList(vlCorrecao, vlLancado));
    }

    public BigDecimal getValueTotal() {
        return getValueAcressimos().subtract(getValueDescontos());
    }

}

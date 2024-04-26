package com.example.tributosV2.model.Pagamento;

import com.example.tributosV2.model.Contribuinte.Contribuinte;
import com.example.tributosV2.model.Credito.Credito;
import com.example.tributosV2.model.Debito.Debito;
import com.example.tributosV2.model.EntityId;
import com.example.tributosV2.model.enums.tipoGuia;
import jakarta.persistence.*;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity(name = "pagamento")
@Table(name = "pagamento")
@Getter
@Setter
public class Pagamento extends EntityId {

    @ManyToOne
    @JoinColumn(name = "debito_id")
    private Debito debito;

    @ManyToOne
    @JoinColumn(name = "contribuiente_id")
    private Contribuinte contribuinte;

    @Column(name = "data_pagamento", nullable = false)
    private LocalDateTime dataPagamento;

    @ManyToOne
    @JoinColumn(name = "credito_id", nullable = false)
    private Credito credito;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_guia", nullable = false)
    private tipoGuia tipoGuia;

    @Positive
    @Column(name = "vl_pago", nullable = false)
    private BigDecimal vlLancado;
}

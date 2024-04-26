package com.example.tributosV2.util;

import java.math.BigDecimal;
import java.util.List;

public class BigDecimalUtils {
    public static BigDecimal somaLista(List<BigDecimal> lista) {
        BigDecimal soma = BigDecimal.ZERO;
        for (BigDecimal numero : lista) {
            soma = soma.add(numero);
        }
        return soma;
    }
}

package com.example.tributosV2.util;

public class ValidadorDocumento {

    public static boolean validarCPF(String cpf) {
        if (cpf == null || !cpf.matches("\\d{11}")) {
            return false;
        }

        if (cpf.matches("(\\d)\\1{10}")) {
            return false;
        }

        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += (cpf.charAt(i) - '0') * (10 - i);
        }
        int resto = soma % 11;
        int digitoVerificador1 = (resto < 2) ? 0 : (11 - resto);
        if ((cpf.charAt(9) - '0') != digitoVerificador1) {
            return false;
        }

        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += (cpf.charAt(i) - '0') * (11 - i);
        }
        resto = soma % 11;
        int digitoVerificador2 = (resto < 2) ? 0 : (11 - resto);
        return (cpf.charAt(10) - '0') == digitoVerificador2;
    }

    public static boolean validarCNPJ(String cnpj) {
        if (cnpj == null || !cnpj.matches("\\d{14}")) {
            return false;
        }

        int soma = 0;
        for (int i = 0; i < 12; i++) {
            soma += (cnpj.charAt(i) - '0') * ((i < 4) ? (5 - i) : (13 - i));
        }
        int resto = soma % 11;
        int digitoVerificador1 = (resto < 2) ? 0 : (11 - resto);
        if ((cnpj.charAt(12) - '0') != digitoVerificador1) {
            return false;
        }

        soma = 0;
        for (int i = 0; i < 13; i++) {
            soma += (cnpj.charAt(i) - '0') * ((i < 5) ? (6 - i) : (14 - i));
        }
        resto = soma % 11;
        int digitoVerificador2 = (resto < 2) ? 0 : (11 - resto);
        return (cnpj.charAt(13) - '0') == digitoVerificador2;
    }
}
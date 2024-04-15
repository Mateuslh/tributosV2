package com.example.tributosV2.model.imovel;

import com.example.tributosV2.exception.ValidationException;
import jakarta.persistence.Column;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class InscricaoImobiliaria {
    @Column
    @Size(min = 4, max = 4)
    public Long campo1;

    @Column
    @Size(min = 9, max = 9)
    public Long campo2;

    @Column
    @Size(min = 3, max = 3)
    public Long campo3;

    @Column
    @Size(min = 1, max = 1)
    public Long campo4;

    public void setCampo1(Long campo1) {
        if(campo1.toString().length() == 4 ) this.campo1 = campo1;
        else throw new ValidationException("O campo 1 precisa ter exatos 4 caracteres!");
    }

    public void setCampo2(Long campo2) {
        if(campo2.toString().length() == 9) this.campo2 = campo2;
        else throw new ValidationException("O campo 2 precisa ter exatos 9 caracteres!");
    }
    public void setCampo3(Long campo3) {
        if(campo3.toString().length() == 3 ) this.campo3 = campo3;
        else throw new ValidationException("O campo 3 precisa ter exatos 3 caracteres!");
    }

    public void setCampo4(Long campo4) {
        if(campo4.toString().length() == 1 ) this.campo4 = campo4;
        else throw new ValidationException("O campo 4 precisa ter exatos 1 caracter!");
    }

    @Override
    public String toString() {
        return campo1 + "." + campo2 + "." + campo3 + "." + campo4;
    }
}

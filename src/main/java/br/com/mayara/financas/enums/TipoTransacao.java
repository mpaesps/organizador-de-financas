package br.com.mayara.financas.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.persistence.Embeddable;

public enum TipoTransacao {
    DESPESAS(1),
    GANHOS(2);

    private int tipoTransacao;

    private TipoTransacao(int tipoTransacao) {
        this.tipoTransacao = tipoTransacao;
    }

    private TipoTransacao() {
        this.tipoTransacao = 0;
    }

    public int getTipoTransacao() {
        return tipoTransacao;
    }
}

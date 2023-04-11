package br.com.mayara.financas.model;

import br.com.mayara.financas.enums.TipoTransacao;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "transacao")
public class Transacao {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Double valor;
    private String descricao;
    private Date data = new Date();
    @Enumerated
    @Column(name = "tipo_transacao")
    private TipoTransacao tipoTransacao;
}

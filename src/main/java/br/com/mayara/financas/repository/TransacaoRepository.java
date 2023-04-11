package br.com.mayara.financas.repository;

import br.com.mayara.financas.model.Transacao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.beans.JavaBean;

public interface TransacaoRepository  extends JpaRepository<Transacao, Long> {
}

package br.com.mayara.financas.controller;

import br.com.mayara.financas.model.Transacao;
import br.com.mayara.financas.repository.TransacaoRepository;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/transacao")
public class TransacaoController {
    @Autowired
    private TransacaoRepository repository;
    @PostMapping("/criar")
    public void criarTransacao(@RequestBody Transacao transacao){
        repository.save(transacao);
    }

    @DeleteMapping("/deletar")
    public void deletarTransacao(@RequestBody Transacao transacao){
        repository.delete(transacao);
    }

    @GetMapping("/ler")
    public List<Transacao> lerTransacao(){
        return repository.findAll();
    }
    @GetMapping("/ler/{id}")
    public Optional<Transacao> lerTransacao(@PathVariable Long id){
        return repository.findById(id);
    }
    @PutMapping("/alterar")
    public ResponseEntity<Object> atualizarTransaçao (@RequestBody Transacao transacao){
        Optional<Transacao> transacao1 = repository.findById(transacao.getId());

        transacao1.get().setTipoTransacao(transacao.getTipoTransacao());
        transacao1.get().setData(transacao.getData());
        transacao1.get().setDescricao(transacao.getDescricao());
        transacao1.get().setValor(transacao.getValor());

        repository.save(transacao1.get());

        return new ResponseEntity<>(HttpStatus.OK);
    }
}

package br.com.zupacademy.gabrielamartins.transacao.controller;

import br.com.zupacademy.gabrielamartins.transacao.model.Cartao;
import br.com.zupacademy.gabrielamartins.transacao.model.Transacao;
import br.com.zupacademy.gabrielamartins.transacao.repository.CartaoRepository;
import br.com.zupacademy.gabrielamartins.transacao.repository.TransacaoRepository;
import br.com.zupacademy.gabrielamartins.transacao.responseDto.TransacaoResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("/cartoes")
public class CartaoController {

    @Autowired
    CartaoRepository cartaoRepository;

    @Autowired
    TransacaoRepository transacaoRepository;


    @GetMapping("/{id}/transacoes")
    public ResponseEntity<?> consultarTransacoes(@PathVariable String id, @PageableDefault(sort = "efetivadaEm", direction = Sort.Direction.DESC, size = 10) Pageable pageable){
        Optional<Cartao> cartaoObject = cartaoRepository.findById(id);

        if(cartaoObject.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        Page<Transacao> transacoes = transacaoRepository.findByCartaoId(id, pageable);

        return ResponseEntity.ok(TransacaoResponseDto.converteParaLista(transacoes));
    }
}

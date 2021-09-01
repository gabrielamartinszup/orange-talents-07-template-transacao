package br.com.zupacademy.gabrielamartins.transacao.config;

import br.com.zupacademy.gabrielamartins.transacao.model.Transacao;
import br.com.zupacademy.gabrielamartins.transacao.repository.TransacaoRepository;
import br.com.zupacademy.gabrielamartins.transacao.requestDto.TransacaoRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class TransacaoListener {

    @Autowired
    private TransacaoRepository transacaoRepository;

    @KafkaListener(topics = "transacoes")
    public void ouvir(TransacaoRequestDto transacaoRequestDto) {

        Transacao transacao = transacaoRequestDto.converteParaTransacao();

        System.out.println(transacaoRequestDto);
        transacaoRepository.save(transacao);

    }
}

package br.com.zupacademy.gabrielamartins.transacao.requestDto;

import br.com.zupacademy.gabrielamartins.transacao.model.Cartao;
import br.com.zupacademy.gabrielamartins.transacao.model.Estabelecimento;
import br.com.zupacademy.gabrielamartins.transacao.model.Transacao;

import java.time.LocalDateTime;

public class TransacaoRequestDto {

    private String id;

    private Double valor;

    private EstabelecimentoRequestDto estabelecimento;

    private CartaoRequestDto cartao;

    private LocalDateTime efetivadaEm = LocalDateTime.now();

    @Deprecated
    public TransacaoRequestDto() {
    }

    public TransacaoRequestDto(String id, Double valor, EstabelecimentoRequestDto estabelecimento, CartaoRequestDto cartao, LocalDateTime efetivadaEm) {
        this.id = id;
        this.valor = valor;
        this.estabelecimento = estabelecimento;
        this.cartao = cartao;
        this.efetivadaEm = efetivadaEm;
    }

    public String getId() {
        return id;
    }

    public Double getValor() {
        return valor;
    }

    public EstabelecimentoRequestDto getEstabelecimento() {
        return estabelecimento;
    }

    public CartaoRequestDto getCartao() {
        return cartao;
    }

    public LocalDateTime getEfetivadaEm() {
        return efetivadaEm;
    }

    @Override
    public String toString() {
        return "TransacaoRequestDto{" +
                "id='" + id + '\'' +
                ", valor=" + valor +
                ", estabelecimento=" + estabelecimento +
                ", cartao=" + cartao +
                ", efetivadaEm=" + efetivadaEm +
                '}';
    }

    public Transacao converteParaTransacao(){
        Cartao cartao = this.cartao.converteParaCartao();
        Estabelecimento estabelecimento = this.estabelecimento.converteParaEstabelecimento();
        return new Transacao(id, valor, estabelecimento, cartao, efetivadaEm);
    }
}

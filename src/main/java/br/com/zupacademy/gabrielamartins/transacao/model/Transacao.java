package br.com.zupacademy.gabrielamartins.transacao.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Transacao {

    @Id
    private String id;

    private Double valor;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Estabelecimento estabelecimento;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Cartao cartao;

    private LocalDateTime efetivadaEm = LocalDateTime.now();

    @Deprecated
    public Transacao() {
    }

    public Transacao(String id, Double valor, Estabelecimento estabelecimento, Cartao cartao, LocalDateTime efetivadaEm) {
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

    public Estabelecimento getEstabelecimento() {
        return estabelecimento;
    }

    public Cartao getCartao() {
        return cartao;
    }

    public LocalDateTime getEfetivadaEm() {
        return efetivadaEm;
    }

}

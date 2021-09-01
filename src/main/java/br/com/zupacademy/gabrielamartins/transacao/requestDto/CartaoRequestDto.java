package br.com.zupacademy.gabrielamartins.transacao.requestDto;

import br.com.zupacademy.gabrielamartins.transacao.model.Cartao;


public class CartaoRequestDto {


    private String id;
    private String email;

    @Deprecated
    public CartaoRequestDto() {
    }

    public CartaoRequestDto(String id, String email) {
        this.id = id;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }


    public Cartao converteParaCartao(){
        return new Cartao(id, email);
    }
}

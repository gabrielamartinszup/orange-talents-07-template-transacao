package br.com.zupacademy.gabrielamartins.transacao.responseDto;

import br.com.zupacademy.gabrielamartins.transacao.model.Cartao;

public class CartaoResponseDto {

    private String id;
    private String email;

    public CartaoResponseDto(Cartao cartao){
        this.id = cartao.getId();
        this.email = cartao.getEmail();
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }
}

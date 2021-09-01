package br.com.zupacademy.gabrielamartins.transacao.model;


import javax.persistence.*;

@Entity
public class Cartao {

    @Id
    private String id;
    private String email;

    @Deprecated
    public Cartao() {
    }

    public Cartao(String id, String email) {
        this.id = id;
        this.email = email;

    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }
}

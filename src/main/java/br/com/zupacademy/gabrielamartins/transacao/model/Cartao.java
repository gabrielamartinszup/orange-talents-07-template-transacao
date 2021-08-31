package br.com.zupacademy.gabrielamartins.transacao.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cartao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBanco;
    private String id;
    private String email;

    @Deprecated
    public Cartao() {
    }

    public Cartao(String id, String email) {
        this.id = id;
        this.email = email;
    }

    public Long getIdBanco() {
        return idBanco;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }
}

package br.com.zupacademy.gabrielamartins.transacao.requestDto;

import br.com.zupacademy.gabrielamartins.transacao.model.Estabelecimento;

public class EstabelecimentoRequestDto {

    private String nome;
    private String cidade;
    private String endereco;

    @Deprecated
    public EstabelecimentoRequestDto() {
    }

    public EstabelecimentoRequestDto(String nome, String cidade, String endereco) {
        this.nome = nome;
        this.cidade = cidade;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEndereco() {
        return endereco;
    }


    public Estabelecimento converteParaEstabelecimento(){
        return new Estabelecimento(nome, cidade, endereco);
    }
}

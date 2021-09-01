package br.com.zupacademy.gabrielamartins.transacao.responseDto;

import br.com.zupacademy.gabrielamartins.transacao.model.Estabelecimento;

public class EstabelecimentoResponseDto {

    private String nome;
    private String cidade;
    private String endereco;

    public EstabelecimentoResponseDto(Estabelecimento estabelecimento) {
        this.nome = estabelecimento.getNome();
        this.cidade = estabelecimento.getCidade();
        this.endereco = estabelecimento.getEndereco();
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
}

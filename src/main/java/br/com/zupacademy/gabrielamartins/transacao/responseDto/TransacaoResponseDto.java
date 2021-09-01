package br.com.zupacademy.gabrielamartins.transacao.responseDto;

import br.com.zupacademy.gabrielamartins.transacao.model.Transacao;
import org.springframework.data.domain.Page;

import java.time.LocalDateTime;

public class TransacaoResponseDto {

    private Double valor;
    private EstabelecimentoResponseDto estabelecimentoResponseDto;
    private CartaoResponseDto cartaoResponseDto;
    private LocalDateTime efetivadaEm;

    public TransacaoResponseDto(Transacao transacao) {
        this.valor = transacao.getValor();
        this.estabelecimentoResponseDto = new EstabelecimentoResponseDto(transacao.getEstabelecimento());
        this.cartaoResponseDto = new CartaoResponseDto(transacao.getCartao());
        this.efetivadaEm = transacao.getEfetivadaEm();
    }

    public Double getValor() {
        return valor;
    }

    public EstabelecimentoResponseDto getEstabelecimentoResponseDto() {
        return estabelecimentoResponseDto;
    }

    public CartaoResponseDto getCartaoResponseDto() {
        return cartaoResponseDto;
    }

    public LocalDateTime getEfetivadaEm() {
        return efetivadaEm;
    }

    public static Page<TransacaoResponseDto> converteParaLista(Page<Transacao> page){

        return page.map(TransacaoResponseDto::new);
    }
}

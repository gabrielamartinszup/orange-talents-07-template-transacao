package br.com.zupacademy.gabrielamartins.transacao.repository;

import br.com.zupacademy.gabrielamartins.transacao.model.Estabelecimento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstabelecimentoRepository extends JpaRepository<Estabelecimento, Long> {
}

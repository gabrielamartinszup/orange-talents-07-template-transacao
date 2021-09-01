package br.com.zupacademy.gabrielamartins.transacao.repository;

import br.com.zupacademy.gabrielamartins.transacao.model.Transacao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;



public interface TransacaoRepository extends JpaRepository<Transacao, Long> {

    Page<Transacao> findByCartaoId(String id, Pageable pageable);

}

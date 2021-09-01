package br.com.zupacademy.gabrielamartins.transacao.repository;

import br.com.zupacademy.gabrielamartins.transacao.model.Cartao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CartaoRepository extends JpaRepository<Cartao, Long> {
    Optional<Cartao> findById(String id);

}

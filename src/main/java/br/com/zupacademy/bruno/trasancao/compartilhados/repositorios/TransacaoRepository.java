package br.com.zupacademy.bruno.trasancao.compartilhados.repositorios;

import br.com.zupacademy.bruno.trasancao.compartilhados.entidades.Transacao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransacaoRepository extends JpaRepository<Transacao, String> {
    Page<Transacao> findByCartao_Id(String id, Pageable paginacao);
}

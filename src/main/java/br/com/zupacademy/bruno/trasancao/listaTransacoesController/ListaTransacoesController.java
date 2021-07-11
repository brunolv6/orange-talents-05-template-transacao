package br.com.zupacademy.bruno.trasancao.listaTransacoesController;

import br.com.zupacademy.bruno.trasancao.compartilhados.cartao.Cartao;
import br.com.zupacademy.bruno.trasancao.compartilhados.errors.ApiException;
import br.com.zupacademy.bruno.trasancao.compartilhados.transacao.Transacao;
import br.com.zupacademy.bruno.trasancao.compartilhados.transacao.TransacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@RestController
@RequestMapping("/api/cartoes")
public class ListaTransacoesController {

    @PersistenceContext
    private EntityManager em;

    @Autowired
    private TransacaoRepository transacaoRepository;

    @GetMapping("/{id}/transacao")
    public Page<ResponseTransacao> listar(@PathVariable String id,
                                       @PageableDefault(sort="efetivadaEm", direction = Sort.Direction.DESC, page = 0, size = 10) Pageable paginacao){

        Cartao cartao = em.find(Cartao.class, id);

        if(cartao == null) throw new ApiException(HttpStatus.NOT_FOUND, "Cartao não encontrada!");

        Page<Transacao> transacoes = transacaoRepository.findByCartao_Id(id, paginacao);

        return ResponseTransacao.toModel(transacoes);
    }

}

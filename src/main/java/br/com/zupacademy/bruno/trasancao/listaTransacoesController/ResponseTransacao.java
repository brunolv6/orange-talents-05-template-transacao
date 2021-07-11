package br.com.zupacademy.bruno.trasancao.listaTransacoesController;

import br.com.zupacademy.bruno.trasancao.compartilhados.transacao.Transacao;
import org.springframework.data.domain.Page;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ResponseTransacao {

    private String id;

    private BigDecimal valor;

    private ResponseEstabelecimento estabelecimento;

    private LocalDateTime efetivadaEm;

    public ResponseTransacao(Transacao transacao) {
        this.id = transacao.getId();
        this.valor = transacao.getValor();
        this.estabelecimento = new ResponseEstabelecimento(transacao.getEstabelecimento());
        this.efetivadaEm = transacao.getEfetivadaEm();
    }

    public String getId() {
        return id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public ResponseEstabelecimento getEstabelecimento() {
        return estabelecimento;
    }

    public LocalDateTime getEfetivadaEm() {
        return efetivadaEm;
    }

    public static Page<ResponseTransacao> toModel(Page<Transacao> transacoes){
        return transacoes.map(ResponseTransacao::new);
    }
}

package br.com.zupacademy.bruno.trasancao.compartilhados.transacao;

import br.com.zupacademy.bruno.trasancao.compartilhados.cartao.RequestCartao;
import br.com.zupacademy.bruno.trasancao.compartilhados.estabelecimento.RequestEstabelecimento;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class RequestTransacao {

    @JsonProperty
    private String id;

    @JsonProperty
    private BigDecimal valor;

    @JsonProperty
    private RequestEstabelecimento estabelecimento;

    @JsonProperty
    private RequestCartao cartao;

    @JsonProperty
    private LocalDateTime efetivadaEm;

    @JsonCreator
    public RequestTransacao(@JsonProperty("id") String id, @JsonProperty("valor") BigDecimal valor, @JsonProperty("estabelecimento") RequestEstabelecimento estabelecimento,
                            @JsonProperty("cartao") RequestCartao cartao, @JsonProperty("efetivadaEm") LocalDateTime efetivadaEm) {
        this.id = id;
        this.valor = valor;
        this.estabelecimento = estabelecimento;
        this.cartao = cartao;
        this.efetivadaEm = efetivadaEm;
    }

    public Transacao toModel(){
        return new Transacao(this.id, this.valor, this.estabelecimento.toModel(), this.cartao.toModel(), this.efetivadaEm);
    }

    @Override
    public String toString() {
        return "RequestTransacao{" +
                "id='" + id + '\'' +
                ", valor=" + valor +
                ", estabelecimento=" + estabelecimento +
                ", cartao=" + cartao +
                ", efetivadaEm='" + efetivadaEm + '\'' +
                '}';
    }
}

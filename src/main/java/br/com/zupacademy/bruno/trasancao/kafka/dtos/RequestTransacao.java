package br.com.zupacademy.bruno.trasancao.kafka.dtos;

import br.com.zupacademy.bruno.trasancao.kafka.dtos.RequestCartao;
import br.com.zupacademy.bruno.trasancao.kafka.dtos.RequestEstabelecimento;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

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
    private String efetivadaEm;

    @JsonCreator
    public RequestTransacao(@JsonProperty("id") String id, @JsonProperty("valor") BigDecimal valor, @JsonProperty("estabelecimento") RequestEstabelecimento estabelecimento, @JsonProperty("cartao") RequestCartao cartao, @JsonProperty("efetivadaEm") String efetivadaEm) {
        this.id = id;
        this.valor = valor;
        this.estabelecimento = estabelecimento;
        this.cartao = cartao;
        this.efetivadaEm = efetivadaEm;
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

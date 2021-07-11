package br.com.zupacademy.bruno.trasancao.compartilhados.transacao;

import br.com.zupacademy.bruno.trasancao.compartilhados.cartao.Cartao;
import br.com.zupacademy.bruno.trasancao.compartilhados.estabelecimento.Estabelecimento;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Transacao {

    @NotNull
    @NotBlank
    @Id
    private String id;

    @NotNull
    @Positive
    private BigDecimal valor;

    @NotNull
    @ManyToOne(cascade = CascadeType.ALL)
    private Estabelecimento estabelecimento;

    @NotNull
    @ManyToOne(cascade = CascadeType.ALL)
    private Cartao cartao;

    private LocalDateTime efetivadaEm;

    @Deprecated
    public Transacao() {
    }

    public Transacao(String id, BigDecimal valor, Estabelecimento estabelecimento, Cartao cartao, LocalDateTime efetivadaEm) {
        this.id = id;
        this.valor = valor;
        this.estabelecimento = estabelecimento;
        this.cartao = cartao;
        this.efetivadaEm = efetivadaEm;
    }

    public String getId() {
        return id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public Estabelecimento getEstabelecimento() {
        return estabelecimento;
    }

    public Cartao getCartao() {
        return cartao;
    }

    public LocalDateTime getEfetivadaEm() {
        return efetivadaEm;
    }

    @Override
    public String toString() {
        return "Transacao{" +
                "id='" + id + '\'' +
                ", valor=" + valor +
                ", estabelecimento=" + estabelecimento +
                ", cartao=" + cartao +
                ", efetivadaEm='" + efetivadaEm + '\'' +
                '}';
    }
}

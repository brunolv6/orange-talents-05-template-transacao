package br.com.zupacademy.bruno.trasancao.kafka.dtos;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class RequestEstabelecimento {

    @JsonProperty
    private String nome;

    @JsonProperty
    private String cidade;

    @JsonProperty
    private String endereco;

    @JsonCreator
    public RequestEstabelecimento(@JsonProperty("nome") String nome, @JsonProperty("cidade") String cidade, @JsonProperty("endereco") String endereco) {
        this.nome = nome;
        this.cidade = cidade;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "RequestEstabelecimento{" +
                "nome='" + nome + '\'' +
                ", cidade='" + cidade + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}

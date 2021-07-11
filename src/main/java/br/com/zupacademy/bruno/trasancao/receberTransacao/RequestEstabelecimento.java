package br.com.zupacademy.bruno.trasancao.receberTransacao;

import br.com.zupacademy.bruno.trasancao.compartilhados.entidades.Estabelecimento;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

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

    public Estabelecimento toModel() {
        return new Estabelecimento(this.nome, this.cidade, this.endereco);
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

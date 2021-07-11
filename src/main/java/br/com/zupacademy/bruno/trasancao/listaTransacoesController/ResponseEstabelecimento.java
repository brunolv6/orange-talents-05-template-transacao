package br.com.zupacademy.bruno.trasancao.listaTransacoesController;

import br.com.zupacademy.bruno.trasancao.compartilhados.entidades.Estabelecimento;

public class ResponseEstabelecimento {

    private String nome;

    private String cidade;

    private String endereco;

    public ResponseEstabelecimento(Estabelecimento estabelecimento) {
        this.nome = estabelecimento.getNome();
        this.cidade = estabelecimento.getCidade();
        this.endereco = estabelecimento.getEndereco();
    }

    public String getNome() {
        return nome;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEndereco() {
        return endereco;
    }
}

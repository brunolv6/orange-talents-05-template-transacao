package br.com.zupacademy.bruno.trasancao.receberTransacao;

import br.com.zupacademy.bruno.trasancao.compartilhados.transacao.RequestTransacao;
import br.com.zupacademy.bruno.trasancao.compartilhados.transacao.Transacao;
import br.com.zupacademy.bruno.trasancao.compartilhados.transacao.TransacaoRepository;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class TransacaoesConsumer {

    private final TransacaoRepository transacaoRepository;

    public TransacaoesConsumer(TransacaoRepository transacaoRepository) {
        this.transacaoRepository = transacaoRepository;
    }

    @KafkaListener(id = "my.api", topics = "transacoes")
    void consome(RequestTransacao requestTransacao){
        Transacao novaTransacao = requestTransacao.toModel();
        transacaoRepository.save(novaTransacao);
        System.out.println(requestTransacao.toString());
    }
}

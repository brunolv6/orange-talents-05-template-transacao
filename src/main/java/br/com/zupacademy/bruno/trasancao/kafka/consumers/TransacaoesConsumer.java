package br.com.zupacademy.bruno.trasancao.kafka.consumers;

import br.com.zupacademy.bruno.trasancao.kafka.dtos.RequestTransacao;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class TransacaoesConsumer {

    @KafkaListener(id = "my.api", topics = "transacoes")
    void consome(RequestTransacao requestTransacao){
        System.out.println(requestTransacao.toString());
    }
}

package br.com.zupacademy.bruno.trasancao.receberTransacao.kafka.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.support.converter.JsonMessageConverter;

@Configuration
public class KafkaConfigurations {

    @Bean
    JsonMessageConverter jsonMessageConverter() {
        return new JsonMessageConverter();
    }
}

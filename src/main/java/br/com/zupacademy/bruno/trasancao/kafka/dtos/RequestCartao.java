package br.com.zupacademy.bruno.trasancao.kafka.dtos;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestCartao {

    @JsonProperty
    private String id;

    @JsonProperty
    private String email;

    @JsonCreator
    public RequestCartao(@JsonProperty("id") String id, @JsonProperty("email") String email) {
        this.id = id;
        this.email = email;
    }

    @Override
    public String toString() {
        return "RequestCartao{" +
                "id='" + id + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

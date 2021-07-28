package com.br.apiglobal.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "cliente")
public class Cliente {

    @Id
    private String id;

    private String nome;

    private String email;

    @CPF(message = "CPF invalido")
    private String cpf;



}

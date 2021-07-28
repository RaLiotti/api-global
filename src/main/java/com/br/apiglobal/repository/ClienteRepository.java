package com.br.apiglobal.repository;

import com.br.apiglobal.model.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;


public interface ClienteRepository extends MongoRepository<Cliente, String> {

    public Cliente save(Cliente cliente);

    public Optional<Cliente> findClienteByCpf(String cpf);


}

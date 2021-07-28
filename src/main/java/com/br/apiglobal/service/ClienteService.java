package com.br.apiglobal.service;

import com.br.apiglobal.model.Cliente;

import java.util.List;
import java.util.Optional;

public interface ClienteService {

    public Cliente criarCliente(Cliente cliente);

    public List<Cliente> bucarTodosClientes();

    public Optional<Cliente> buscarClientePorCpf(String cpf);



}

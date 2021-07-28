package com.br.apiglobal.service.impl;

import com.br.apiglobal.model.Cliente;
import com.br.apiglobal.repository.ClienteRepository;
import com.br.apiglobal.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    @Override
    public Cliente criarCliente(Cliente cliente) {
        return this.clienteRepository.save(cliente);
    }

    @Override
    public List<Cliente> bucarTodosClientes() {
        return this.clienteRepository.findAll();
    }

    @Override
    public Optional<Cliente> buscarClientePorCpf(String cpf) {
        return this.clienteRepository.findClienteByCpf(cpf);

    }
}

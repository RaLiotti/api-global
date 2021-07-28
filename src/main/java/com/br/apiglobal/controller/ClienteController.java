package com.br.apiglobal.controller;


import com.br.apiglobal.model.Cliente;
import com.br.apiglobal.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @PostMapping
    public ResponseEntity<Cliente> incluirCliente(@RequestBody Cliente cliente){

        try {

            Optional<Cliente> clienteEncontrado = clienteService.buscarClientePorCpf(cliente.getCpf());

            if(ObjectUtils.isEmpty(clienteEncontrado)){
                Cliente clienteCriado = this.clienteService.criarCliente(cliente);
                return ResponseEntity.ok().body(clienteCriado);
            }
            return ResponseEntity.badRequest().build();
        }catch (Exception e){
            throw e;
        }

    }

    @GetMapping
    public ResponseEntity<List<Cliente>> buscarTodosClientes(){

        try{
            List<Cliente> clientes = this.clienteService.bucarTodosClientes();
            return ResponseEntity.ok(clientes);
        }catch (Exception e){
            throw e;
        }
    }


}

package com.SistemaFacturacion.controller;

import com.SistemaFacturacion.entitites.User;
import com.SistemaFacturacion.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/clientes")
public class ClientesController {

    @Autowired
    private UserRepository clienteRepository;

    @PostMapping
    public User registrarCLientes(@RequestBody User cliente) {
        return clienteRepository.save(cliente);
    }
}

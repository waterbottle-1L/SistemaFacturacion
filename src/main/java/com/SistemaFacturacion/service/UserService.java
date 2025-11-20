package com.SistemaFacturacion.service;

import com.SistemaFacturacion.dtos.CreateClientDTO;
import com.SistemaFacturacion.entitites.Clientes;
import com.SistemaFacturacion.repositories.ClienteRepository;
import com.SistemaFacturacion.validations.ClientValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    private final ClienteRepository repo;
    private List<ClientValidator> validators;

    @Autowired
    public ClienteService(ClienteRepository repo, List<ClientValidator> validators) {
        this.repo = repo;
        this.validators = validators;
    }

    public Clientes create(CreateClientDTO datos) {
        validators.forEach(v->v.validate(datos));

        Clientes cliente = new Clientes(datos);
        return new User
    }
}

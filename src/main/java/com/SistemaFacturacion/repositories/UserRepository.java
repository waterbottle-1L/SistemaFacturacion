package com.SistemaFacturacion.repositories;

import com.SistemaFacturacion.entitites.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClienteRepository extends JpaRepository<Clientes, Long> {
    Optional<Clientes> findByDni(String dni);
    boolean existByDNI(String dni);
}

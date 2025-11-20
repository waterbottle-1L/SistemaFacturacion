package com.SistemaFacturacion.entitites;

import com.SistemaFacturacion.dtos.CreateUserDTO;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "clientes",
        uniqueConstraints = @UniqueConstraint(columnNames = {"dni"}))
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 8, nullable = false, unique = true)
    private String dni;
    @Column(length = 100, nullable = false)
    private String nombres;
    @Column(length = 100, nullable = false)
    private String apellidos;
    private String correo;
    private String password;
    private LocalDateTime createdAt = LocalDateTime.now();


    public Users(CreateUserDTO dto) {
        this.password = dto.password();
        this.correo = dto.correo();
        this.apellidos = dto.apellidos();
        this.nombres = dto.nombres();
        this.dni = dto.dni();
    }
}

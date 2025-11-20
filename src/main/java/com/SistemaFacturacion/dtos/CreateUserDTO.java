package com.SistemaFacturacion.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record CreateClientDTO(
        @NotBlank(message = "DNI es obligatorio")
        @Pattern(regexp = "\\d{8}", message = "DNI debe tener 8 dígitos")
        String dni,
        @NotBlank(message = "Nombres es obligatorio")
        @Size(max = 100)
        String nombres,
        @Size(max = 100)
        String apellidos,
        @NotBlank
        String correo,
        @NotBlank
        String password

){
}

package com.SistemaFacturacion.validations;

import com.SistemaFacturacion.dtos.CreateClientDTO;

public interface ClientValidator {
    void validate (CreateClientDTO data);
}

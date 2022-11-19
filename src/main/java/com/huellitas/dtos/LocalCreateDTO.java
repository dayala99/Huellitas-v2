package com.huellitas.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class LocalCreateDTO {

    private String distrito;
    private String ubicacion;
    private String horario;
    private Long cantidadEmp;
}

package com.huellitas.dtos;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import java.util.Date;

@Getter
@Setter
public class LocalDTO {

    private Long id;
    private String distrito;
    private String ubicacion;
    private String horario;
    private Long cantidadEmp;


}

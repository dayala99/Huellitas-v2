package com.huellitas.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class ServicioUpdateDTO {

    private Long id;
    private String descripcion;
    private String precio;
}

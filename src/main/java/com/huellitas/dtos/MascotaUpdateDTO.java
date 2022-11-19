package com.huellitas.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class MascotaUpdateDTO {

    private Long id;
    private String nombres;
    private String tipo;
    private String peso;
    private String altura;
    private Date anio;
}

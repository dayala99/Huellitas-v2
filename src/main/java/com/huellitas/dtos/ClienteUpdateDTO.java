package com.huellitas.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class ClienteUpdateDTO {

    private Long id;
    private String nombres;
    private String apePaterno;
    private String apeMaterno;
    private String dni;
    private Date fechaNacimiento;
    private Long mascotaId;
}

package com.huellitas.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class DetalleCitaCreateDTO {

    private Long clienteCod;
    private Date fechaCita;
    private Long servicioCod;
    private Long localCod;
}

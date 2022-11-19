package com.huellitas.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class DetalleCitaUpdateDTO {

    private Long id;
    private Long clienteCod;
    private Date fechaCita;
    private Long servicioCod;
    private Long localCod;
}

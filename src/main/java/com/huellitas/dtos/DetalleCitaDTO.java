package com.huellitas.dtos;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Getter
@Setter
public class DetalleCitaDTO {

    private Long id;
    private Long clienteCod;
    private Date fechaCita;
    private Long servicioCod;
    private Long localCod;


}

package com.huellitas.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tb_detallecita")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DetalleCita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="detid")
    private Long id;

    @Column(name = "detclicod", length = 8, nullable = false)
    private Long clienteCod;

    @Column(name="detfeccit", nullable = false)
    @Temporal(value= TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date fechaCita;

    @Column(name = "detsercod", length = 8, nullable = false)
    private Long servicioCod;

    @Column(name = "detloccod", length = 8, nullable = false)
    private Long localCod;

}

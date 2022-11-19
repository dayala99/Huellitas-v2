package com.huellitas.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tb_servicio")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Servicio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="serid")
    private Long id;

    @Column(name = "serdes", length = 60, nullable = false)
    private String descripcion;

    @Column(name = "serpre", length = 30, nullable = false)
    private String precio;

}

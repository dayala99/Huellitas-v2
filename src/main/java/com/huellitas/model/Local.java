package com.huellitas.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tb_local")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Local {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="locid")
    private Long id;

    @Column(name = "locdis", length = 60, nullable = false)
    private String distrito;

    @Column(name = "locubi", length = 30, nullable = false)
    private String ubicacion;

    @Column(name = "lochor", length = 30, nullable = false)
    private String horario;

    @Column(name = "loccantemp")
    private Long cantidadEmp;
}

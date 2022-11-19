package com.huellitas.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tb_cliente")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cliid")
    private Long id;

    @Column(name = "clinom", length = 60, nullable = false)
    private String nombres;

    @Column(name = "cliapepat", length = 30, nullable = false)
    private String apePaterno;

    @Column(name = "cliapemat", length = 30, nullable = false)
    private String apeMaterno;

    @Column(name = "clinrodni", length = 8, nullable = false)
    private String dni;

    @Column(name="clifecnac", nullable = false)
    @Temporal(value= TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date fechaNacimiento;

    @Column(name = "climasid", length = 8, nullable = false)
    private Long mascotaId;
}

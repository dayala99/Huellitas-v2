package com.huellitas.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tb_mascota")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Mascota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="masid")
    private Long id;

    @Column(name = "masnom", length = 30, nullable = false)
    private String nombres;

    @Column(name = "mastip", length = 30, nullable = false)
    private String tipo;

    @Column(name = "maspes", length = 30, nullable = false)
    private String peso;

    @Column(name = "masalt", length = 30, nullable = false)
    private String altura;

    @Column(name="masanio", nullable = false)
    @Temporal(value= TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date anio;

}

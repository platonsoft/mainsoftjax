package com.test.apache.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="sucursales")
@Data
public class Sucursal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_sucursal")
    private Long idSucursal;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "fecha_registro")
    private Date fechaRegistro;
    @JoinColumn(referencedColumnName = "id_banco")
    @ManyToOne()
    private Banco banco;
}

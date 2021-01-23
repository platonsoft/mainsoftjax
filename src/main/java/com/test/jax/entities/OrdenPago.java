package com.test.jax.entities;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name="ordenes_pago")
@Data
public class OrdenPago {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_orden_pago")
    private Long idOrdenPago;
    @Column(name = "monto")
    private BigDecimal monto;
    @Column(name = "moneda")
    private String moneda;
    @Column(name = "estado")
    private String estado;
    @Column(name = "fecha_pago")
    private Date fechaPago;
    @JoinColumn(referencedColumnName = "id_sucursal")
    @ManyToOne()
    private Sucursal sucursal;
}

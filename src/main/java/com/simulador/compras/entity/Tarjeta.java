package com.simulador.compras.entity;


import lombok.*;

import javax.persistence.*;
import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name="TARJETAS")
@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery(name = "Tarjeta.getMoneda",
            procedureName = "SP_VALIDARDATOS",
            parameters = {
                    @StoredProcedureParameter(mode = ParameterMode.IN, name = "INT_DNI", type = String.class),
                    @StoredProcedureParameter(mode = ParameterMode.IN, name = "INT_TIPOTARJETA", type = String.class),
                    @StoredProcedureParameter(mode = ParameterMode.OUT, name = "OUT_MONEDA", type = String.class)})})

public class Tarjeta {

    @Id
    @Column(name="IDTARJETA")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTarjeta;

    @Column(name="TIPOTARJETA", nullable = false, length = 50)
    private String tipoTarjeta;

    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name="FK_CLIENTE", nullable = false)
    private Cliente cliente;

    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name="FK_MONEDA", nullable = false )
    private Moneda moneda;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tarjeta tarjeta = (Tarjeta) o;
        return Objects.equals(idTarjeta, tarjeta.idTarjeta) && Objects.equals(tipoTarjeta, tarjeta.tipoTarjeta) && Objects.equals(cliente, tarjeta.cliente) && Objects.equals(moneda, tarjeta.moneda);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTarjeta, tipoTarjeta, cliente, moneda);
    }
}

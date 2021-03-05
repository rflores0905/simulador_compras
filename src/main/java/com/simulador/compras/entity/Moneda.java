package com.simulador.compras.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Objects;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="MONEDAS")
public class Moneda {

    @Id
    @Column(name="IDMONEDA")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMoneda;

    @Column(name="TIPOMONEDA", nullable = false, length = 10)
    private String tipoMoneda;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Moneda moneda = (Moneda) o;
        return Objects.equals(idMoneda, moneda.idMoneda) && Objects.equals(tipoMoneda, moneda.tipoMoneda);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idMoneda, tipoMoneda);
    }
}

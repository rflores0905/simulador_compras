package com.simulador.compras.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Objects;

@NoArgsConstructor //generar los constructores que dejaron de existir con Builder
@AllArgsConstructor
@Builder //Habilitar patron Builder para construir la entidad
@Getter  //generar automaticamente el encapsulado de la variable
@Setter  //generar automaticamente el encapsulado de la variable
@Entity  //Para persistencia y uso del spring data JPA, con esta anotación se reconoce a la clase como una entidad en BD
@Table(name="CLIENTES")  //para que la clase sea persistente en la BD.
public class Cliente {

    @Id
    @Column(name="IDCLIENTE")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;

    @Column(name="NOMBRE", nullable = false, length = 100)
    private String nombre;

    @Column(name="APELLIDO", nullable = false, length = 100)
    private String apellido;

    @Column(name="DNI", nullable = false, length = 20)
    private String dni;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(idCliente, cliente.idCliente) && Objects.equals(nombre, cliente.nombre) && Objects.equals(apellido, cliente.apellido) && Objects.equals(dni, cliente.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCliente, nombre, apellido, dni);
    }
}

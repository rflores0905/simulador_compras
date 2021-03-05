package com.simulador.compras.repository;


import com.simulador.compras.entity.Tarjeta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface TarjetaRepository extends JpaRepository<Tarjeta, Long> {

    @Procedure(name="Tarjeta.getMoneda")
    String getMoneda(
            @Param("INT_DNI") String intDni,
            @Param("INT_TIPOTARJETA") String intTipoTarjeta,
            @Param("OUT_MONEDA") String outMoneda
    );

}

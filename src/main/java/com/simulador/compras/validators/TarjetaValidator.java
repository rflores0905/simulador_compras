package com.simulador.compras.validators;

import com.simulador.compras.entity.Tarjeta;

public class TarjetaValidator {

    public static void save(Tarjeta tarjeta){

        if(tarjeta.getTipoTarjeta() == null || tarjeta.getTipoTarjeta().isEmpty()){
            throw new RuntimeException("El TIPO DE TARJETA es requerido");
        }
        //VALIDAR SI LA TARJETA ES BLACK, ORO, CLASICA

    }
}

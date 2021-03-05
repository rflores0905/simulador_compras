package com.simulador.compras.validators;

import com.simulador.compras.entity.Cliente;


public class ClienteValidator {

    public static void save(Cliente cliente){

       if(cliente.getDni() == null || cliente.getDni().isEmpty()){
               throw new RuntimeException("El número de DNI es requerido");
        }

    }
}

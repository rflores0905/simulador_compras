package com.simulador.compras.controllers;

import com.simulador.compras.entity.Request;
import com.simulador.compras.entity.Response;

import com.simulador.compras.repository.TarjetaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@Controller
@RestController
@PropertySource("classpath:application.properties")
public class ResponseController {

    @Autowired
    TarjetaRepository repoTarjeta;

    @PostMapping(value="/comprascliente")
    public ResponseEntity<Response> create(@RequestBody Request request)  {
        //Capturar BODY del POSTMAN
        Request newRequest = new Request();
        newRequest.setDni(request.getDni().trim());
        newRequest.setTipoTarjeta(request.getTipoTarjeta());
        newRequest.setDiaDePago(request.getDiaDePago());
        newRequest.setCuotas(request.getCuotas());
        newRequest.setTasa(request.getTasa());
        newRequest.setFechaCompra(request.getFechaCompra());

        //variable para recibir Moneda
        String outMoneda = "";

        //Instanciar REPO para ejecutar STORED PROCEDURE y Retorna la Moneda
        //Paso el DNI y TARJETA:
        // 1.- Si cliente no existe debo retornar: Ingrese bien el DNI
        // 2.- Si cliente existe y no la tarjeta, registro la tarjeta y retorna la moneda.
        repoTarjeta.getMoneda(newRequest.getDni(), newRequest.getTipoTarjeta(), outMoneda);

        //Aplicar logica de Negocio para calcular Cuotas
        //-> aquí falta la regla de negocio

        //Pintar respuesta según lo solicitado
        Response newResponse = new Response();
        newResponse.setValorCuota("1500");
        newResponse.setMoneda(outMoneda);
        newResponse.setPrimeraCuota("12/20/2022");
        return new ResponseEntity<Response>(newResponse,HttpStatus.OK);
    }
}

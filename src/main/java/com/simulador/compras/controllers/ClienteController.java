package com.simulador.compras.controllers;

import com.simulador.compras.entity.Cliente;
import com.simulador.compras.entity.Request;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RestController
public class ClienteController {

        private List<Cliente> clientes = new ArrayList<>();

        public ClienteController() {
            for (int c = 0; c < 10; c++){
                clientes.add(Cliente.builder()
                        .idCliente((c+1L))
                        .nombre("Nombre" + (c+1L))
                        .apellido("Apellido" + (c+1L))
                        .dni("DNI" +(c+1L))
                        .build()
                );
            }

        }
        @GetMapping(value="/clientes")
        public List<Cliente> findAll(){
            return this.clientes;
        }

        @GetMapping(value="/clientes/{clienteId}")
        public Cliente findById(@PathVariable("clienteId") Long clienteId){
            for (Cliente cliente : this.clientes){
                if(cliente.getIdCliente().longValue() == clienteId.longValue()){
                    return cliente;
                }
            }
            return null;
        }

       @PostMapping(value="/clientes")
       public Cliente create(@RequestBody Cliente cliente){
          this.clientes.add(cliente);
          return cliente;
       }

}

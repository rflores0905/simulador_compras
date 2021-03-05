package com.simulador.compras.services;


import com.simulador.compras.entity.Cliente;
import com.simulador.compras.exceptions.GeneralServiceException;
import com.simulador.compras.exceptions.NoDataFoundException;
import com.simulador.compras.exceptions.ValidateServiceException;
import com.simulador.compras.repository.ClienteRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ClienteService {


    @Autowired
    private ClienteRepository clienteRepo;


    public Cliente findByDni(String dni){
        try {
            log.debug("findBYDni => " + dni);
            Cliente cliente = null; // falta completar
            return cliente;
        }catch(ValidateServiceException | NoDataFoundException e){
            log.info(e.getMessage(), e);
            throw e;
        }catch(Exception e){
            log.error(e.getMessage(), e);
            throw new GeneralServiceException(e.getMessage(), e);
        }
    }

}

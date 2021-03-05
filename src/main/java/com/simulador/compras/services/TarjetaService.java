package com.simulador.compras.services;

import com.simulador.compras.entity.Tarjeta;
import com.simulador.compras.exceptions.GeneralServiceException;
import com.simulador.compras.exceptions.NoDataFoundException;
import com.simulador.compras.exceptions.ValidateServiceException;
import com.simulador.compras.repository.TarjetaRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TarjetaService {

    @Autowired
    private TarjetaRepository tarjetaRepo;

    public Tarjeta findTarjetabyID(Long id) {
        try {
            log.debug("findTarjetaByTipoTarjeta => " + id);
            //Tarjeta tarjeta = tarjetaRepo.findTarjetaById(id);
            return null;//falta completar
        } catch (ValidateServiceException | NoDataFoundException e) {
            log.info(e.getMessage(), e);
            throw e;
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw new GeneralServiceException(e.getMessage(), e);
        }

    }

    public Tarjeta InsertTarjeta(Tarjeta tarjeta) {
        try {
            log.debug("InsertTarjeta => " + tarjeta);
            return tarjetaRepo.save(tarjeta);
        } catch (ValidateServiceException e) {
            log.info(e.getMessage(), e);
            throw e;
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw new GeneralServiceException(e.getMessage(), e);
        }

    }


}

package com.simulador.compras.converters;

import com.simulador.compras.dtos.ClienteDTO;
import com.simulador.compras.dtos.MonedaDTO;
import com.simulador.compras.dtos.TarjetaDTO;
import com.simulador.compras.entity.Cliente;
import com.simulador.compras.entity.Moneda;
import com.simulador.compras.entity.Tarjeta;

public class TarjetaConverter extends AbstractConverter<Tarjeta, TarjetaDTO>  {

    @Override
    public TarjetaDTO fromEntity(Tarjeta entity){
        if (entity == null) return null;

        ClienteDTO cliente = fromClientEntity(entity.getCliente());
        return TarjetaDTO.builder()
                .idTarjeta(entity.getIdTarjeta())
                .tipoTarjeta(entity.getTipoTarjeta())
                .cliente(cliente)
                .moneda(entity.getMoneda())
                .build();
    }

    @Override
    public Tarjeta fromDTO(TarjetaDTO dto){
        if (dto == null) return null;

        Cliente cliente = fromClientDTO(dto.getCliente());
        return Tarjeta.builder()
                .idTarjeta(dto.getIdTarjeta())
                .tipoTarjeta(dto.getTipoTarjeta())
                .moneda(dto.getMoneda())
                .cliente(cliente)
                .build();
    }

    private ClienteDTO fromClientEntity(Cliente cliente){
        if( cliente == null) return null;

        return ClienteDTO.builder()
                .idCliente(cliente.getIdCliente())
                .dni(cliente.getDni())
                .nombre(cliente.getNombre())
                .apellido(cliente.getApellido())
                .build();
    }

    private MonedaDTO fromMonedaEntity(Moneda moneda) {
        if( moneda == null) return null;

        return MonedaDTO.builder()
                .idMoneda(moneda.getIdMoneda())
                .tipoMoneda(moneda.getTipoMoneda())
                .build();
    }

    private Cliente fromClientDTO(ClienteDTO cliente){
        if( cliente == null) return null;

        return Cliente.builder()
                .idCliente(cliente.getIdCliente())
                .dni(cliente.getDni())
                .nombre(cliente.getNombre())
                .apellido(cliente.getApellido())
                .build();
    }

    private Moneda fromMonedaDTO(MonedaDTO moneda){
        if( moneda == null) return null;

        return Moneda.builder()
                .idMoneda(moneda.getIdMoneda())
                .tipoMoneda(moneda.getTipoMoneda())
                .build();
    }
}

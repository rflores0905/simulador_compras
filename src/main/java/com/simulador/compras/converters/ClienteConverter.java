package com.simulador.compras.converters;

import com.simulador.compras.dtos.ClienteDTO;
import com.simulador.compras.entity.Cliente;

public class ClienteConverter extends AbstractConverter<Cliente, ClienteDTO> {

    @Override
    public ClienteDTO fromEntity(Cliente entity){
        if (entity == null) return null;

        return ClienteDTO.builder()
                .idCliente(entity.getIdCliente())
                .nombre(entity.getNombre())
                .apellido(entity.getApellido())
                .dni(entity.getDni())
                .build();
    }

    @Override
    public Cliente fromDTO(ClienteDTO dto){
        if (dto == null) return null;

        return Cliente.builder()
                .idCliente(dto.getIdCliente())
                .nombre(dto.getNombre())
                .apellido(dto.getApellido())
                .dni(dto.getDni())
                .build();
    }
}

package com.simulador.compras.converters;


import com.simulador.compras.dtos.MonedaDTO;
import com.simulador.compras.entity.Moneda;


public class MonedaConverter extends AbstractConverter<Moneda, MonedaDTO> {

    @Override
    public MonedaDTO fromEntity(Moneda entity){
        if (entity == null) return null;

        return MonedaDTO.builder()
                .idMoneda(entity.getIdMoneda())
                .tipoMoneda(entity.getTipoMoneda())
                .build();
    }

    @Override
    public Moneda fromDTO(MonedaDTO dto){
        if (dto == null) return null;

        return Moneda.builder()
                .idMoneda(dto.getIdMoneda())
                .tipoMoneda(dto.getTipoMoneda())
                .build();
    }
}

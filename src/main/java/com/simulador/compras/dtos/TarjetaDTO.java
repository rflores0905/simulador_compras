package com.simulador.compras.dtos;


import com.simulador.compras.entity.Moneda;
import lombok.*;



@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TarjetaDTO {

    private Long idTarjeta;
    private String tipoTarjeta;
    private Moneda moneda;
    private ClienteDTO cliente;
}

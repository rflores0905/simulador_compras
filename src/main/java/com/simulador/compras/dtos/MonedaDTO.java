package com.simulador.compras.dtos;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MonedaDTO {

    private Long idMoneda;
    private String tipoMoneda;
}

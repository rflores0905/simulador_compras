package com.simulador.compras.entity;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Response {

    private String valorCuota;
    private String moneda;
    private String primeraCuota;
}

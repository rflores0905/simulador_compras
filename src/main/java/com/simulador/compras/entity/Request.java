package com.simulador.compras.entity;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter

public class Request {

    private String dni;
    private String tipoTarjeta;
    private Double montoCompra;
    private Integer cuotas;
    private Double tasa;
    private String fechaCompra;
    private String diaDePago;

}

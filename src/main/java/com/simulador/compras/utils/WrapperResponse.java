package com.simulador.compras.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class WrapperResponse<T> {
    private boolean ok;
    private String message;
    private T body;

    public ResponseEntity<WrapperResponse<T>> createResponse(HttpStatus status){
        return new ResponseEntity<WrapperResponse<T>>(this, status);
    }
}

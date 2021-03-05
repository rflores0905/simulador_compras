package com.simulador.compras.utils;

import lombok.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.beans.factory.annotation.Value;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Configuration
@PropertySource("classpath:application.properties")
public class SimuladorConfig {

    @Value("${spring.datasource.url}")
    public String url;
    @Value("${spring.datasource.username}")
    public String user;
    @Value("${spring.datasource.password}")
    public String pass;
}

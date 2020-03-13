package com.mx.rodo.spring.di.app;

import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

@Component
@PropertySources({ @PropertySource("classpath:clientes.properties"), @PropertySource("classpath:facturas.properties") })
public class AppConfigurationConfig {

}

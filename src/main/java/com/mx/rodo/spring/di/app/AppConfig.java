package com.mx.rodo.spring.di.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mx.rodo.spring.di.app.beans.domain.ItemFactura;
import com.mx.rodo.spring.di.app.beans.domain.Producto;
import com.mx.rodo.spring.di.app.beans.services.MiServicio;
import com.mx.rodo.spring.di.app.beans.services.MiServicioComplejo;
import com.mx.rodo.spring.di.app.beans.servicesinterfaces.IServicio;

@Configuration
public class AppConfig {

	@Bean("miServicioSimple")
	public IServicio registrarMiServicio() {
		return new MiServicio();
	}

	@Bean("miServicioComplejo")
	public IServicio registrarMiServicioComplejo() {
		return new MiServicioComplejo();
	}

	@Bean("itemsFactura")
	public List<ItemFactura> registrarItems() {
		Producto producto1 = new Producto("Camara Sony", Float.valueOf("100"));
		Producto producto2 = new Producto("Bicicleta Chida", Float.valueOf("200"));
		Producto producto3 = new Producto("1Kg de tortillas", Float.valueOf("300"));

		ItemFactura itemFactura = new ItemFactura(producto1, 1);
		ItemFactura itemFactura2 = new ItemFactura(producto2, 3);
		ItemFactura itemFactura3 = new ItemFactura(producto3, 5);

		return Arrays.asList(itemFactura, itemFactura2, itemFactura3);
	}

	@Bean("itemsFacturaOficina")
	public List<ItemFactura> registrarItemsOficina() {
		Producto producto1 = new Producto("Monitor LG", Float.valueOf("249.99"));
		Producto producto2 = new Producto("Escritorio Chido", Float.valueOf("344.95"));
		Producto producto3 = new Producto("1Kg de carnitas", Float.valueOf("399.99"));
		Producto producto4 = new Producto("Laptop chida", Float.valueOf("599.99"));

		ItemFactura itemFactura = new ItemFactura(producto1, 1);
		ItemFactura itemFactura2 = new ItemFactura(producto2, 3);
		ItemFactura itemFactura3 = new ItemFactura(producto3, 5);
		ItemFactura itemFactura4 = new ItemFactura(producto4, 2);

		return Arrays.asList(itemFactura, itemFactura2, itemFactura3, itemFactura4);
	}
	
}

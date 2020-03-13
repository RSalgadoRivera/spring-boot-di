package com.mx.rodo.spring.di.app.beans.domain;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class Factura {

	@Autowired
	private Cliente cliente;
	@Value("${factura.descripcion}")
	private String descripcion;
	@Autowired
	@Qualifier("itemsFacturaOficina")
	private List<ItemFactura> itemFacturas;
	
	@PostConstruct
	public void inicializar() {
		cliente.setNombre(cliente.getNombre().concat(" José"));
		descripcion = descripcion.concat(" del cliente: ").concat(cliente.getNombre()+" "+cliente.getApellido());
	}
	
	@PreDestroy
	public void destruir() {
		System.out.println("Factura destruida ".concat(descripcion));
	}

	public Factura(Cliente cliente, String descripcion, List<ItemFactura> itemFacturas) {
		this.cliente = cliente;
		this.descripcion = descripcion;
		this.itemFacturas = itemFacturas;
	}

	public Factura() {

	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<ItemFactura> getItemFacturas() {
		return itemFacturas;
	}

	public void setItemFacturas(List<ItemFactura> itemFacturas) {
		this.itemFacturas = itemFacturas;
	}

}

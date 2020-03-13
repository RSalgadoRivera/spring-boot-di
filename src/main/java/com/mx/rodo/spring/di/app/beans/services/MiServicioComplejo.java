package com.mx.rodo.spring.di.app.beans.services;

//import org.springframework.stereotype.Component;

import com.mx.rodo.spring.di.app.beans.servicesinterfaces.IServicio;

//@Component("miServicioComplejo")
public class MiServicioComplejo implements IServicio {
	@Override
	public String operacion() {
		return "Haciendo algo importante complicado...";
	}
}

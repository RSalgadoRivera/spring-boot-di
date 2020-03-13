package com.mx.rodo.spring.di.app.beans.services;

/*import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;*/

import com.mx.rodo.spring.di.app.beans.servicesinterfaces.IServicio;

/*@Component("miServicio")
@Primary*/
public class MiServicio implements IServicio{
	@Override
	public String operacion() {
		return "Haciendo algo importante simple...";
	}
}

package com.mx.rodo.spring.di.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.mx.rodo.spring.di.app.beans.servicesinterfaces.IServicio;

@Controller
public class IndexController {

	private IServicio miServicio;

	@Autowired
	@Qualifier("miServicioComplejo")
	public void setMiServicio(IServicio miServicio) {
		this.miServicio = miServicio;
	}

	@GetMapping({ "", "/", "/index" })
	public String index(Model model) {
		model.addAttribute("objeto", miServicio.operacion());
		return "index";
	}

}

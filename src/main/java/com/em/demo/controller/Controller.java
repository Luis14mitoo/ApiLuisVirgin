package com.em.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.em.demo.entities.Personaentidad;
import com.em.demo.models.Persona;
import com.em.demo.services.Servicio;

@RestController
@RequestMapping("/inicio")
public class Controller {

	@Autowired
	@Qualifier("servicio")
	Servicio servicio;
	
	
	@GetMapping("/tpersonas")
	public List<Persona> TPersonas(){
		return servicio.traerPersonas();
	}
	
	@GetMapping("/tpersona/{cedula}")
	public Persona TPersona(@PathVariable ("cedula") int cedula){
		return servicio.traerPersona(cedula);
	}
	
	
	@PostMapping("/cpersona")
	public boolean CPersona(@RequestBody Personaentidad P){
		return servicio.crearPersona(P);		
		
	}
	
	@DeleteMapping("/bpersona/{id}")
	public boolean borrarPersona(@PathVariable ("id") long id) {
		
		return servicio.borrarPersonas(id);
	}
	
	
}

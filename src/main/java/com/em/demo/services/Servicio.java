package com.em.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.em.demo.converter.Convertidor;
import com.em.demo.entities.Personaentidad;
import com.em.demo.models.Persona;
import com.em.demo.repository.Repositorio;

@Service("servicio")
public class Servicio {

	
	@Autowired
	@Qualifier("repositorio")
	private Repositorio repositorio;
	
	@Autowired
	@Qualifier("convertidor")
	private Convertidor convertidor;
	
	
	public List<Persona> traerPersonas() {		
		return convertidor.convertirLista((repositorio.findAll()));
		}
	
	public Persona traerPersona(int cedula) {		
		return new Persona(((repositorio.findByCedula(cedula))));
		}
	
	
	
	public boolean crearPersona(Personaentidad P) {
				
		try {
			repositorio.save(P);
			
		}catch(Exception e) {
			return false;
		}
		 
		return true;
		}
	
	
	public boolean borrarPersonas(long id) {
		
		try {
			repositorio.deleteById(id);
			
		}catch(Exception e) {
			return false;
		}
		 
		return true;
		}
}

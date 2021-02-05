package com.em.demo.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.em.demo.entities.Personaentidad;
import com.em.demo.models.Persona;

@Component("convertidor")
public class Convertidor {
	
	public List<Persona> convertirLista(List<Personaentidad> personasentidad){
		
		List<Persona> personamodel = new ArrayList<>();
		
		for(Personaentidad Pernonaen:personasentidad ) {
			personamodel.add(new Persona(Pernonaen));
		}
		return personamodel;
	}

}

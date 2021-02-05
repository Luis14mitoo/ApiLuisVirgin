package com.em.demo.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.em.demo.entities.Personaentidad;
import com.em.demo.models.Persona;

@Repository("repositorio")
public interface Repositorio extends JpaRepository <Personaentidad, Serializable> {
	
	public abstract List<Personaentidad> findAll();
	
	public abstract Personaentidad findByCedula(int cedula);
	
	
}


   
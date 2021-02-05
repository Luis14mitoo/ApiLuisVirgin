package com.em.demo.entities;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name ="Persona")
@Entity
public class Personaentidad {

	
	@GeneratedValue
	@Id
	@Column(name="ID")
	private Long id;
	
	@Column(name="NOMBRES")
	private String nombres;
	
	@Column(name="APELLIDOS")
	private String apellidos;
	
	@Column(name="TIPO_DOCUMENTO")
	private String tipo_documento;
	
	@Column(name="CEDULA")
	private int cedula;
	
	@Column(name="FECHA_NACIMIENTO")
	private LocalDate fecha_nacimiento;
	
	@Column(name="DIRECCION")
	private String direccion;
	
	
	@Column(name="CELULAR")
	private int celular;
	
	
	
	public Personaentidad() {}
	

	public Personaentidad(Long id, String nombres, String apellidos, String tipo_documento, int cedula, LocalDate fecha_nacimiento,
			String direccion, int celular) {
		
		this.id = id;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.tipo_documento = tipo_documento;
		this.cedula = cedula;
		this.fecha_nacimiento = fecha_nacimiento;
		this.direccion = direccion;
		this.celular = celular;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombres=" + nombres + ", apellidos=" + apellidos + ", tipo_documento="
				+ tipo_documento + ", cedula=" + cedula + ", fecha_nacimiento=" + fecha_nacimiento + ", direccion="
				+ direccion + ", celular=" + celular + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTipo_documento() {
		return tipo_documento;
	}

	public void setTipo_documento(String tipo_documento) {
		this.tipo_documento = tipo_documento;
	}

	public int getCedula() {
		return cedula;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

	public LocalDate getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getCelular() {
		return celular;
	}

	public void setCelular(int celular) {
		this.celular = celular;
	}
	
}

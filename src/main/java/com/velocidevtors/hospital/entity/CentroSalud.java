package com.velocidevtors.hospital.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "centro_salud")
public class CentroSalud implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_centro_salud;
	private Integer personas;
	private Integer tiempo;
	private String direccion;
	private String nombre;
	
	private EPS eps;
	@Column(name = "fecha_creacion")
	@Temporal(TemporalType.DATE)
	private Date fechaCreacion;

	

	public Long getId_centro_salud() {
		return id_centro_salud;
	}



	public void setId_centro_salud(Long id_centro_salud) {
		this.id_centro_salud = id_centro_salud;
	}



	public Integer getPersonas() {
		return personas;
	}



	public void setPersonas(Integer personas) {
		this.personas = personas;
	}



	public Integer getTiempo() {
		return tiempo;
	}



	public void setTiempo(Integer tiempo) {
		this.tiempo = tiempo;
	}



	public String getDireccion() {
		return direccion;
	}



	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public EPS getEps() {
		return eps;
	}



	public void setEps(EPS eps) {
		this.eps = eps;
	}



	public Date getFechaCreacion() {
		return fechaCreacion;
	}



	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}

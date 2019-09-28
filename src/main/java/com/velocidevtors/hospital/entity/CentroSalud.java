package com.velocidevtors.hospital.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "centro_salud")
public class CentroSalud implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Integer personas;
	private Integer tiempo;
	private String direccion;
	private String nombre;
	private String latitud;
	private String longitud;
	
	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="eps_id")
	private EPS eps;

	
	public String getLatitud() {
		return latitud;
	}



	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}



	public String getLongitud() {
		return longitud;
	}



	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
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


	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}

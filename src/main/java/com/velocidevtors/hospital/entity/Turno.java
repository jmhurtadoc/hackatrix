package com.velocidevtors.hospital.entity;

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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "turno")
public class Turno {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String turno;

	private String estado;

	@Column(name = "fecha_inicio")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaInicio;

	@Column(name = "fecha_atencion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaAtencion;

	@Column(name = "fecha_finalizacion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaFinalizacion;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_centro_salud")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
	private CentroSalud centroSalud;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaAtencion() {
		return fechaAtencion;
	}

	public void setFechaAtencion(Date fechaAtencion) {
		this.fechaAtencion = fechaAtencion;
	}

	public Date getFechaFinalizacion() {
		return fechaFinalizacion;
	}

	public void setFechaFinalizacion(Date fechaFinalizacion) {
		this.fechaFinalizacion = fechaFinalizacion;
	}

	public CentroSalud getCentroSalud() {
		return centroSalud;
	}

	public void setCentroSalud(CentroSalud centroSalud) {
		this.centroSalud = centroSalud;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}

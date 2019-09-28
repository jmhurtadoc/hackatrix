package com.velocidevtors.hospital.service;

import java.util.List;

import com.velocidevtors.hospital.entity.Turno;

public interface ITurnoService {

	public List<Turno> findAll();

	public List<Turno> findByCentroSalud(Long id_centro_salud);

}

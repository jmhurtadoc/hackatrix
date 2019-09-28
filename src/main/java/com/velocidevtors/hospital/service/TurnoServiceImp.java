package com.velocidevtors.hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocidevtors.hospital.dao.ITurnoDao;
import com.velocidevtors.hospital.entity.Turno;

@Service
public class TurnoServiceImp implements ITurnoService {

	@Autowired
	private ITurnoDao turnoDao;

	@Override
	public List<Turno> findAll() {
		return (List<Turno>) turnoDao.findAll();
	}

	@Override
	public List<Turno> findByCentroSalud(Long id_centro_salud) {
		return turnoDao.findAllByCentroSalud(id_centro_salud);
	}

}

package com.velocidevtors.hospital.service;

import java.util.List;

import com.velocidevtors.hospital.entity.CentroSalud;

public interface ICentroSaludService {
	
	public List<CentroSalud> findAll();
	
	public List<CentroSalud> findAllByEPS(Long id_eps);

}

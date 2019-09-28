package com.velocidevtors.hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.velocidevtors.hospital.dao.ICentroSaludDao;
import com.velocidevtors.hospital.entity.CentroSalud;

@Service
public class CentroSaludServiceImp implements ICentroSaludService{
	
	@Autowired
	private ICentroSaludDao centroSaludDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<CentroSalud> findAll() {
		return (List<CentroSalud>) centroSaludDao.findAll();
	}

	public List<CentroSalud> findAllByEPS(Long id_eps) {
		return centroSaludDao.findAllByEPS(id_eps);
	}
	
	public List<CentroSalud> findNear(String longitid, String latitud) {
		return centroSaludDao.findNear(longitid, latitud);
	} 

}

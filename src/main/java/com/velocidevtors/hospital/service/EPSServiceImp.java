package com.velocidevtors.hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.velocidevtors.hospital.dao.IEPSDao;
import com.velocidevtors.hospital.entity.EPS;

@Service
public class EPSServiceImp implements IEPSService{
	
	@Autowired
	private IEPSDao epsDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<EPS> findAll() {
		return (List<EPS>) epsDao.findAll();
	}

}

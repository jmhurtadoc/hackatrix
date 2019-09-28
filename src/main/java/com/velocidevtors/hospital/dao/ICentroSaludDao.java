package com.velocidevtors.hospital.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.velocidevtors.hospital.entity.CentroSalud;

public interface ICentroSaludDao extends CrudRepository<CentroSalud, Long>{
	
	@Query("select c from centro_salud c where c.eps_id=?1")
	List<CentroSalud> findAllByEPS(Integer id_eps);

}

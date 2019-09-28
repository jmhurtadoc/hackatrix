package com.velocidevtors.hospital.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.velocidevtors.hospital.entity.CentroSalud;

public interface ICentroSaludDao extends CrudRepository<CentroSalud, Long>{
	@Query(
		  value = "SELECT * FROM centro_salud u WHERE u.eps_id = ?1", 
		  nativeQuery = true)
	List<CentroSalud> findAllByEPS(Long id_eps);

}

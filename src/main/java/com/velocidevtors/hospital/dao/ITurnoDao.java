package com.velocidevtors.hospital.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.velocidevtors.hospital.entity.Turno;

public interface ITurnoDao extends CrudRepository<Turno, Long> {

	@Query("select c from Turno c where c.centroSalud.id=:idCentroSalud")
	List<Turno> findAllByCentroSalud(@Param("idCentroSalud")Long id_centro_salud);

}

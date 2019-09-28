package com.velocidevtors.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.velocidevtors.hospital.entity.CentroSalud;
import com.velocidevtors.hospital.service.ICentroSaludService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/api")
public class CentroSaludRestController {
	@Autowired
	private ICentroSaludService centroSaludService;
	
	@GetMapping("/obtenerCentroSaludPorEPS/{id_eps}")
	public List<CentroSalud> obtenerCentroSaludPorEPS(@PathVariable Long id_eps){
		System.out.println("id_eps : " + id_eps);
		return centroSaludService.findAllByEPS(id_eps);
	}
	
	@GetMapping("/obtenerCentroSaludCercanos/{latitud}/{longitud}")
	public List<CentroSalud> obtenerCentroSaludPorEPS(@PathVariable String latitud, @PathVariable String longitud){
		System.out.println("latitud : " + latitud + ", longitud :" + longitud);
		return centroSaludService.findNear(latitud, longitud);
	}
}

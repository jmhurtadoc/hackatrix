package com.velocidevtors.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.velocidevtors.hospital.entity.CentroSalud;
import com.velocidevtors.hospital.service.ICentroSaludService;

@RestController
@RequestMapping("/api")
public class CentroSaludRestController {
	@Autowired
	private ICentroSaludService centroSaludService;
	
	@GetMapping("/obtenerCentroSaludPorEPS/{id_eps}")
	public List<CentroSalud> obtenerCentroSaludPorEPS(@PathVariable Long id_eps){
		System.out.println("id_eps : " + id_eps);
		return centroSaludService.findAllByEPS(id_eps);
	}
}

package com.velocidevtors.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.velocidevtors.hospital.entity.Turno;
import com.velocidevtors.hospital.service.ITurnoService;

@RestController
@RequestMapping("/api")
public class TurnoRestController {

	@Autowired
	private ITurnoService turnoService;

	@GetMapping("/obtenerListaTurno")
	public List<Turno> obtenerListaTurnos() {
		return turnoService.findAll();
	}

}

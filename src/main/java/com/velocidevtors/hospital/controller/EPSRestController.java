package com.velocidevtors.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.velocidevtors.hospital.entity.EPS;
import com.velocidevtors.hospital.service.IEPSService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/api")
public class EPSRestController {
	@Autowired
	private IEPSService epsService;
	
	@GetMapping("/obtenerListaEPS")
	public List<EPS> obtenerListaEPS(){
		return epsService.findAll();
	}
}

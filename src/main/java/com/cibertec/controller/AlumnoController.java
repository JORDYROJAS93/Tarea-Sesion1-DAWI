package com.cibertec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.entity.Alumno;
import com.cibertec.service.AlumnoService;

@RestController()
@RequestMapping("/rest/alumno")
public class AlumnoController {

	@Autowired	
	private AlumnoService alumnoService;
	
	@GetMapping("/lista")
	public ResponseEntity<?> listaAlumno(){
		List<Alumno> lstSalida = alumnoService.listaAlumno();
		return ResponseEntity.ok(lstSalida);	
	}
	
	@GetMapping("/porDni/{dni}")
	public ResponseEntity<?> listaPorDni(@PathVariable("dni")String dni){
		List<Alumno> lstSalida = alumnoService.listaAlumnoPorDni(dni);
		return ResponseEntity.ok(lstSalida);	
	}
	
}







 
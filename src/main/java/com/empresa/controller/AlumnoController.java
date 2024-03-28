package com.empresa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.entity.Alumno;
import com.empresa.service.AlumnoService;

@RestController
@RequestMapping("/url/alumno")
public class AlumnoController {

	@Autowired
	private AlumnoService alumnoService;
	
	
	@GetMapping
	public List<Alumno> listaAlumno(){
		List<Alumno> lstSalida = alumnoService.listaAlumno();
		return lstSalida;
	}
	
	@GetMapping("/porDni/{dni}")
	public List<Alumno> listaAlumnoPorDni(@PathVariable("dni") String dni){
		List<Alumno> lstSalida = alumnoService.listaAlumnoPorDni(dni);
		return lstSalida;
	}
	
	@GetMapping("/porNombreLike/{nombre}")
	public List<Alumno> listaAlumnoPorNombre(@PathVariable("nombre") String nombre){
		List<Alumno> lstSalida = alumnoService.listaAlumnoPorNombreLike(nombre+"%");
		return lstSalida;
	}
	
	@GetMapping("/porId/{id}")
	public List<Alumno> listaAlumnoPorId(@PathVariable("id") int id){
		List<Alumno> lstSalida = alumnoService.listaAlumnoPorId(id);
		return lstSalida;
	}
	
}







package com.empresa.service;

import java.util.List;

import com.empresa.entity.Alumno;

public interface AlumnoService {

	public abstract List<Alumno> listaAlumno();
	public abstract List<Alumno> listaAlumnoPorDni(String dni);
	public abstract List<Alumno> listaAlumnoPorNombreLike(String nombre);
	public abstract List<Alumno> listaAlumnoPorId(int idAlumno);
	
}

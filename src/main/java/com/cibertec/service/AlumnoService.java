package com.cibertec.service;

import java.util.List;

import com.cibertec.entity.Alumno;

public interface AlumnoService {

	public abstract List<Alumno> listaAlumno();
	public abstract List<Alumno> listaAlumnoPorDni(String dni);
}

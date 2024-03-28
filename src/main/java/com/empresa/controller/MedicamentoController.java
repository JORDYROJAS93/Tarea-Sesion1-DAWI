package com.empresa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.empresa.entity.Medicamento;
import com.empresa.service.MedicamentoService;

@RestController
@RequestMapping("/url/Medicamento")
public class MedicamentoController {

	@Autowired
	private MedicamentoService medicamentoService;
	
	
	@GetMapping
	public List<Medicamento> listaMedicamento(){
		List<Medicamento> lstSalida = medicamentoService.listaMedicamento();
		return lstSalida;
	}
	
	
	@GetMapping("/porMedicamentoLike/{nombre}")
	public List<Medicamento> listaMedicamentoPorNombre(@PathVariable("nombre") String nombre){
		List<Medicamento> lstSalida = medicamentoService.listaPorMedicamentoLike(nombre+"%");
		return lstSalida;
	}
	
	@GetMapping("/porId/{id}")
	public List<Medicamento> listaMedicamentoPorId(@PathVariable("id") int id){
		List<Medicamento> lstSalida = medicamentoService.listaMedicamentoPorId(id);
		return lstSalida;
	}
	
}







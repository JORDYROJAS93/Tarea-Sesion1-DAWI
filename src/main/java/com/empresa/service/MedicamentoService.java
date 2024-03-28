package com.empresa.service;

import java.util.List;


import com.empresa.entity.Medicamento;

public interface MedicamentoService {

	public abstract List<Medicamento> listaMedicamento();
	public abstract List<Medicamento> listaPorMedicamentoLike(String nombre);
	public abstract List<Medicamento> listaMedicamentoPorId(int idMedicamento);
	
}

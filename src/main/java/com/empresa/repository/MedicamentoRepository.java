package com.empresa.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.empresa.entity.Medicamento;

public interface MedicamentoRepository extends JpaRepository<Medicamento, Integer>{
	
	public List<Medicamento> findByMedicamentoLike(String nombre);
	public List<Medicamento> findByIdMedicamento(int id);

}

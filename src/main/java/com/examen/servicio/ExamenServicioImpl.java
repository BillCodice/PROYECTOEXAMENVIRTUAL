package com.examen.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.entidad.Examen;
import com.examen.repositorio.ExamenRepositorio;

@Service
public class ExamenServicioImpl implements ExamenServicio {
	
	@Autowired
	private ExamenRepositorio examenRepositorio;

	@Override
	public List<Examen> listaTodos() {
		return examenRepositorio.findAll();
	}

	@Override
	public Examen registraExamen(Examen obj) {
		
		return examenRepositorio.save(obj);
	}
	
	
	
	
	
	
	
	
	
	

}

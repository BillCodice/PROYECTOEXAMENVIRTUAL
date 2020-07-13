package com.examen.entidad;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "examen_has_estudiante")
public class ExamenHasEstudiante {

	@EmbeddedId
	private ExamenHasEstudiantePK examenHasEstudiantePK;

	@ManyToOne
	@JoinColumn(name = "idExamen", nullable = false)
	private Examen examen;

	@ManyToOne
	@JoinColumn(name = "idEstudiante", nullable = false)
	private Estudiante estudiante;

	@ManyToOne
	@JoinColumn(name = "idEvento", nullable = false)
	private Evento evento;

	@Column(name = "nota")
	private double nota;

	public ExamenHasEstudiantePK getExamenHasEstudiantePK() {
		return examenHasEstudiantePK;
	}

	public void setExamenHasEstudiantePK(ExamenHasEstudiantePK examenHasEstudiantePK) {
		this.examenHasEstudiantePK = examenHasEstudiantePK;
	}

	public Examen getExamen() {
		return examen;
	}

	public void setExamen(Examen examen) {
		this.examen = examen;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

}

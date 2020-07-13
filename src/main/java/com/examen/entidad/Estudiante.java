package com.examen.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "estudiante")
public class Estudiante {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idEstudiante")
	private int idEstudiante;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "apellidoPaterno")
	private String apellidoPaterno;
	
	@Column(name = "apellidoMaterno")
	private String apellidoMaterno;
	
	@Column(name = "dni")
	private String dni;
	
	@Column(name = "fecNaci")
	private String fechNac;
	
	@Column(name = "colegio")
	private String colegio;
	
	@Column(name = "celular")
	private int celular;
	
	@JoinColumn(name = "idDistrito")
	@ManyToOne
	private Distrito distrito;
	
	@JoinColumn(name = "idusuario")
	@ManyToOne
	private Usuario usuario;
	
	

	public int getIdEstudiante() {
		return idEstudiante;
	}

	public void setIdEstudiante(int idEstudiante) {
		this.idEstudiante = idEstudiante;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getFechNac() {
		return fechNac;
	}

	public void setFechNac(String fechNac) {
		this.fechNac = fechNac;
	}

	public String getColegio() {
		return colegio;
	}

	public void setColegio(String colegio) {
		this.colegio = colegio;
	}

	public int getCelular() {
		return celular;
	}

	public void setCelular(int celular) {
		this.celular = celular;
	}

	public Distrito getDistrito() {
		return distrito;
	}

	public void setDistrito(Distrito distrito) {
		this.distrito = distrito;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	



}

package ar.com.uade.dao.model;

import java.io.Serializable;

public class Talle implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 256568523159612723L;
	private Long id;
	private String descripcion;

	public Talle() {

	}

	public Talle(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}

package ar.com.uade.dao.model;

import java.io.Serializable;

public class Marca implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 83386290037228752L;
	private Long id;
	private String descripcion;

	public Marca() {

	}

	public Marca(Long id) {
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

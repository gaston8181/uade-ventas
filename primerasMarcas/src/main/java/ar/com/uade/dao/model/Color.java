package ar.com.uade.dao.model;

import java.io.Serializable;

public class Color implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 802203645344977654L;
	private Long id;
	private String descripcion;

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

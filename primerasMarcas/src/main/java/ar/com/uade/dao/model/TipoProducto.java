package ar.com.uade.dao.model;

import java.io.Serializable;

public class TipoProducto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7472357014119721438L;
	private Long id;
	private String descripcion;

	public TipoProducto() {

	}

	public TipoProducto(Long id) {
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

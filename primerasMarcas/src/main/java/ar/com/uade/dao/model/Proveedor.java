package ar.com.uade.dao.model;

import java.io.Serializable;

public class Proveedor implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6700518550788030641L;
	private Long id;
	private String nombre;
	private String direccion;
	private String telefono;
	private String estado;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}

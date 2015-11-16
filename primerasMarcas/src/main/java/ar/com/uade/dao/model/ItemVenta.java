package ar.com.uade.dao.model;

import java.io.Serializable;

public class ItemVenta implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2973735696050302428L;
	private Long id;
	private Producto producto;
	private int cantidad;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

}

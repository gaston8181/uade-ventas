package ar.com.uade.form;

import java.math.BigDecimal;
import java.util.Date;

public class ReporteVentaProductoForm {

	// ESTO DE VENTA O CAMBIO
	private Long idVentaCambio;
	private Date fechaVentaCambio;

	// ESTO DE PRODUCTO
	private Long codigoBarras;
	private String descMarca;
	private String descColor;
	private String descProducto;
	private String descTalle;
	private BigDecimal precioVenta;
	private int stock;

	public Long getIdVentaCambio() {
		return idVentaCambio;
	}

	public void setIdVentaCambio(Long idVentaCambio) {
		this.idVentaCambio = idVentaCambio;
	}

	public Date getFechaVentaCambio() {
		return fechaVentaCambio;
	}

	public void setFechaVentaCambio(Date fechaVentaCambio) {
		this.fechaVentaCambio = fechaVentaCambio;
	}

	public Long getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(Long codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public String getDescMarca() {
		return descMarca;
	}

	public void setDescMarca(String descMarca) {
		this.descMarca = descMarca;
	}

	public String getDescColor() {
		return descColor;
	}

	public void setDescColor(String descColor) {
		this.descColor = descColor;
	}

	public String getDescProducto() {
		return descProducto;
	}

	public void setDescProducto(String descProducto) {
		this.descProducto = descProducto;
	}

	public String getDescTalle() {
		return descTalle;
	}

	public void setDescTalle(String descTalle) {
		this.descTalle = descTalle;
	}

	public BigDecimal getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(BigDecimal precioVenta) {
		this.precioVenta = precioVenta;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

}

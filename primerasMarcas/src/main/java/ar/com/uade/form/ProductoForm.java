package ar.com.uade.form;

import java.math.BigDecimal;

public class ProductoForm {
	private Long id;
	private String idMarca;
	private Long idColor;
	private BigDecimal precioVenta;
	private BigDecimal precioCompra;
	private Long idProveedor;
	private String datoAdicional;
	private int stock;
	private Long idTipoProducto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIdMarca() {
		return idMarca;
	}

	public void setIdMarca(String idMarca) {
		this.idMarca = idMarca;
	}

	public Long getIdColor() {
		return idColor;
	}

	public void setIdColor(Long idColor) {
		this.idColor = idColor;
	}

	public BigDecimal getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(BigDecimal precioVenta) {
		this.precioVenta = precioVenta;
	}

	public BigDecimal getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(BigDecimal precioCompra) {
		this.precioCompra = precioCompra;
	}

	public Long getIdProveedor() {
		return idProveedor;
	}

	public void setIdProveedor(Long idProveedor) {
		this.idProveedor = idProveedor;
	}

	public String getDatoAdicional() {
		return datoAdicional;
	}

	public void setDatoAdicional(String datoAdicional) {
		this.datoAdicional = datoAdicional;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public Long getIdTipoProducto() {
		return idTipoProducto;
	}

	public void setIdTipoProducto(Long idTipoProducto) {
		this.idTipoProducto = idTipoProducto;
	}

}

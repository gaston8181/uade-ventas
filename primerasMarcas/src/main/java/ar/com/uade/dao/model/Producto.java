package ar.com.uade.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import ar.com.uade.form.ProductoForm;

public class Producto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6965383958732823521L;
	private Long id;
	private Marca marca;
	private Color color;
	private Date fechaIngreso;
	private BigDecimal precioVenta;
	private BigDecimal precioCompra;
	private Proveedor proveedor;
	private String datoAdicional;
	private String descripcion;
	private TipoProducto tipoProducto;
	private int stock;

	public Producto() {
	}

	public Producto(Long id) {
		this.id = id;
	}

	public Producto(ProductoForm pf) {
		this.id = pf.getId();
		this.marca = new Marca(pf.getIdMarca());
		this.color = new Color(pf.getIdColor());
		this.fechaIngreso = new Date();
		this.precioVenta = pf.getPrecioVenta();
		this.precioCompra = pf.getPrecioCompra();
		this.proveedor = new Proveedor(pf.getIdProveedor());
		this.datoAdicional = pf.getDatoAdicional();
		this.tipoProducto = new TipoProducto(pf.getIdTipoProducto());
		this.stock = pf.getStock();
	}

	public void agregarStock(int cantidad) {
		this.stock += cantidad;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
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

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	public String getDatoAdicional() {
		return datoAdicional;
	}

	public void setDatoAdicional(String datoAdicional) {
		this.datoAdicional = datoAdicional;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public TipoProducto getTipoProducto() {
		return tipoProducto;
	}

	public void setTipoProducto(TipoProducto tipoProducto) {
		this.tipoProducto = tipoProducto;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

}

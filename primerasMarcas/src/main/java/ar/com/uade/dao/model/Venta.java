package ar.com.uade.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Venta implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4914798774179905433L;
	private Long id;
	private Date fecha;
	private Vendedor vendedor;
	private BigDecimal total;
	private String observaciones;
	private Pago pago;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public Pago getPago() {
		return pago;
	}

	public void setPago(Pago pago) {
		this.pago = pago;
	}

}

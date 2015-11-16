package ar.com.uade.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Cambio implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1969950344193837377L;
	private Long idCambio;
	private Date fecha;
	private BigDecimal diferencia;
	private String observaciones;
	private Pago pago;
	private Venta venta;

	public Long getIdCambio() {
		return idCambio;
	}

	public void setIdCambio(Long idCambio) {
		this.idCambio = idCambio;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public BigDecimal getDiferencia() {
		return diferencia;
	}

	public void setDiferencia(BigDecimal diferencia) {
		this.diferencia = diferencia;
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

	public Venta getVenta() {
		return venta;
	}

	public void setVenta(Venta venta) {
		this.venta = venta;
	}

}

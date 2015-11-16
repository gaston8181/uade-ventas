package ar.com.uade.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class Efectivo extends Pago implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4577464564436285707L;
	private Long idPago;
	private BigDecimal descuento;

	@Override
	public Long getIdPago() {
		return this.idPago;
	}

	@Override
	public void setIdPago(Long idPago) {
		this.idPago = idPago;
	}

	public BigDecimal getDescuento() {
		return descuento;
	}

	public void setDescuento(BigDecimal descuento) {
		this.descuento = descuento;
	}

}

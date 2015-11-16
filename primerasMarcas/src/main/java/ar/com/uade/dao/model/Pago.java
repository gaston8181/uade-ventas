package ar.com.uade.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class Pago implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5943586867048030480L;
	private Long idPago;
	private BigDecimal totalPago;

	public Long getIdPago() {
		return idPago;
	}

	public void setIdPago(Long idPago) {
		this.idPago = idPago;
	}

	public BigDecimal getTotalPago() {
		return totalPago;
	}

	public void setTotalPago(BigDecimal totalPago) {
		this.totalPago = totalPago;
	}

}

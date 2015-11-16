package ar.com.uade.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class Credito extends Pago implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8100467913023882428L;
	private Long idPago;
	private int cantCuotas;
	private BigDecimal intereses;
	private int nroCupon;

	public Long getIdPago() {
		return idPago;
	}

	public void setIdPago(Long idPago) {
		this.idPago = idPago;
	}

	public int getCantCuotas() {
		return cantCuotas;
	}

	public void setCantCuotas(int cantCuotas) {
		this.cantCuotas = cantCuotas;
	}

	public BigDecimal getIntereses() {
		return intereses;
	}

	public void setIntereses(BigDecimal intereses) {
		this.intereses = intereses;
	}

	public int getNroCupon() {
		return nroCupon;
	}

	public void setNroCupon(int nroCupon) {
		this.nroCupon = nroCupon;
	}

}

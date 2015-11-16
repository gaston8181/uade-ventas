package ar.com.uade.dao.model;

import java.io.Serializable;

public class Debito extends Pago implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9099777583375799986L;
	private Long idPago;
	private int nroCupon;

	public Long getIdPago() {
		return idPago;
	}

	public void setIdPago(Long idPago) {
		this.idPago = idPago;
	}

	public int getNroCupon() {
		return nroCupon;
	}

	public void setNroCupon(int nroCupon) {
		this.nroCupon = nroCupon;
	}

}

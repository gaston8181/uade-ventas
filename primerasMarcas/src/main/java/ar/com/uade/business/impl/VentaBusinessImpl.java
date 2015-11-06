package ar.com.uade.business.impl;

import ar.com.uade.business.VentaBusiness;
import ar.com.uade.dao.VentaDAO;

public class VentaBusinessImpl implements VentaBusiness {
	private VentaDAO ventaDAO;

	public VentaDAO getVentaDAO() {
		return ventaDAO;
	}

	public void setVentaDAO(VentaDAO ventaDAO) {
		this.ventaDAO = ventaDAO;
	}

}

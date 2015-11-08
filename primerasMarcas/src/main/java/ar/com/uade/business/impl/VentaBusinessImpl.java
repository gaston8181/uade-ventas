package ar.com.uade.business.impl;

import ar.com.uade.business.VentaBusiness;
import ar.com.uade.dao.VentaDAO;

public class VentaBusinessImpl implements VentaBusiness {
	private VentaDAO ventaDAO;

	@Override
	public void nuevaVenta() {
		ventaDAO.nuevaVenta();
	}

	@Override
	public void gestionarCambio() {
		ventaDAO.gestionarCambio();
	}

	@Override
	public void cerrarCaja() {
		ventaDAO.cerrarCaja();
	}

	public VentaDAO getVentaDAO() {
		return ventaDAO;
	}

	public void setVentaDAO(VentaDAO ventaDAO) {
		this.ventaDAO = ventaDAO;
	}

}

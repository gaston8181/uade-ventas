package ar.com.uade.business.impl;

import java.util.List;

import ar.com.uade.business.VentaBusiness;
import ar.com.uade.dao.VentaDAO;
import ar.com.uade.dao.model.Venta;
import ar.com.uade.form.ReporteForm;

public class VentaBusinessImpl implements VentaBusiness {
	private VentaDAO ventaDAO;

	@Override
	public List<Venta> reporteVentaSemanal(ReporteForm form) {
		return ventaDAO.reporteVentaSemanal(form);
	}

	@Override
	public List<Venta> reporteVentaMensual(ReporteForm form) {
		return ventaDAO.reporteVentaMensual(form);
	}

	@Override
	public List<Venta> reporteVentaAnual(ReporteForm form) {
		return ventaDAO.reporteVentaAnual(form);
	}

	public void setVentaDAO(VentaDAO ventaDAO) {
		this.ventaDAO = ventaDAO;
	}
}

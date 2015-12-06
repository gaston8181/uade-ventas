package ar.com.uade.business.impl;

import java.util.ArrayList;
import java.util.List;

import ar.com.uade.business.VentaBusiness;
import ar.com.uade.dao.VentaDAO;
import ar.com.uade.dao.model.Venta;
import ar.com.uade.form.CierreListaForm;
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

	@Override
	public List<CierreListaForm> ventasDelDia() {
		ventaDAO.ventasDelDia();
		return new ArrayList<CierreListaForm>();
	}

	@Override
	public int totalEfectivo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int totalTarjeta() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setVentaDAO(VentaDAO ventaDAO) {
		this.ventaDAO = ventaDAO;
	}

}

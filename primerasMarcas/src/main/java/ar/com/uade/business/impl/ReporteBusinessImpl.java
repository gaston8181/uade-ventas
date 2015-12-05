package ar.com.uade.business.impl;

import java.util.List;

import ar.com.uade.business.CombosBusiness;
import ar.com.uade.business.ReporteBusiness;
import ar.com.uade.dao.ReporteDAO;
import ar.com.uade.form.ColorForm;
import ar.com.uade.form.MarcaForm;
import ar.com.uade.form.TalleForm;
import ar.com.uade.form.TipoProductoForm;

public class ReporteBusinessImpl implements ReporteBusiness {
	private CombosBusiness comboBusiness;
	private ReporteDAO reporteDAO;

	@Override
	public void reporteSemanal() {
		reporteDAO.reporteSemanal();
	}

	@Override
	public void reporteMensual() {
		reporteDAO.reporteMensual();
	}

	@Override
	public void reporteAnual() {
		reporteDAO.reporteAnual();
	}

	@Override
	public void reporteEntreDosFechas() {
		// TODO Auto-generated method stub

	}

	@Override
	public List<ColorForm> getColores() {
		return comboBusiness.getColores();
	}

	@Override
	public List<TipoProductoForm> getTiposProd() {
		return comboBusiness.getTiposProd();
	}

	@Override
	public List<MarcaForm> getMarcas() {
		return comboBusiness.getMarcas();
	}

	@Override
	public List<TalleForm> getTalles() {
		return comboBusiness.getTalles();
	}

	public void setReporteDAO(ReporteDAO reporteDAO) {
		this.reporteDAO = reporteDAO;
	}

	public void setComboBusiness(CombosBusiness comboBusiness) {
		this.comboBusiness = comboBusiness;
	}
}

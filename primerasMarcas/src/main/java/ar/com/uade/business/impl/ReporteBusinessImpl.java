package ar.com.uade.business.impl;

import ar.com.uade.business.ReporteBusiness;
import ar.com.uade.dao.ReporteDAO;

public class ReporteBusinessImpl implements ReporteBusiness {
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

	public ReporteDAO getReporteDAO() {
		return reporteDAO;
	}

	public void setReporteDAO(ReporteDAO reporteDAO) {
		this.reporteDAO = reporteDAO;
	}

	@Override
	public void reporteEntreDosFechas() {
		// TODO Auto-generated method stub

	}

}

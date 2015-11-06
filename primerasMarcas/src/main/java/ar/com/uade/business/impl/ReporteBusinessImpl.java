package ar.com.uade.business.impl;

import ar.com.uade.business.ReporteBusiness;
import ar.com.uade.dao.ReporteDAO;

public class ReporteBusinessImpl implements ReporteBusiness {
	private ReporteDAO reporteDAO;

	public ReporteDAO getReporteDAO() {
		return reporteDAO;
	}

	public void setReporteDAO(ReporteDAO reporteDAO) {
		this.reporteDAO = reporteDAO;
	}

}

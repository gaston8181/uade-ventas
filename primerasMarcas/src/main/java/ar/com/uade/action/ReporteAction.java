package ar.com.uade.action;

import ar.com.uade.business.ReporteBusiness;

import com.opensymphony.xwork2.ActionSupport;

public class ReporteAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1829922474780098910L;
	private ReporteBusiness reporte;

	@Override
	public String execute() throws Exception {
		System.out.println("Esto en reportes");
		return SUCCESS;
	}

	public String reporteSemanal() {
		reporte.reporteSemanal();
		return SUCCESS;
	}

	public String reporteMensual() {
		reporte.reporteMensual();
		return SUCCESS;
	}

	public String reporteAnual() {
		reporte.reporteAnual();
		return SUCCESS;
	}

	public String reporteEntreDosFechas() {
		reporte.reporteEntreDosFechas();
		return SUCCESS;
	}

	public ReporteBusiness getReporte() {
		return reporte;
	}

	public void setReporte(ReporteBusiness reporte) {
		this.reporte = reporte;
	}

}

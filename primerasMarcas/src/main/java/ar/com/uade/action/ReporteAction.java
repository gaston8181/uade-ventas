package ar.com.uade.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

import ar.com.uade.business.ReporteBusiness;
import ar.com.uade.form.CombosForm;
import ar.com.uade.form.ReporteForm;
import ar.com.uade.form.ReporteVentaProductoForm;

public class ReporteAction extends ActionSupport implements Preparable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1829922474780098910L;
	private ReporteBusiness reporte;
	private ReporteForm form;
	private CombosForm combos;
	private List<ReporteVentaProductoForm> productosVentas;

	@Override
	public String execute() throws Exception {
		System.out.println("Esto en reportes");
		return SUCCESS;
	}

	public String reporteSemanal() {
		productosVentas = reporte.reporteSemanal(form);
		return SUCCESS;
	}

	public String reporteMensual() {
		productosVentas = reporte.reporteMensual(form);
		return SUCCESS;
	}

	public String reporteAnual() {
		productosVentas = reporte.reporteAnual(form);
		return SUCCESS;
	}

	public String reporteEntreDosFechas() {
		productosVentas = reporte.reporteEntreDosFechas(form);
		return SUCCESS;
	}

	@Override
	public void prepare() throws Exception {
		combos = new CombosForm();
		combos.setColores(reporte.getColores());
		combos.setTiposProductos(reporte.getTiposProd());
		combos.setMarcas(reporte.getMarcas());
		combos.setTalles(reporte.getTalles());
	}

	public void setReporte(ReporteBusiness reporte) {
		this.reporte = reporte;
	}

	public ReporteForm getForm() {
		return form;
	}

	public void setForm(ReporteForm form) {
		this.form = form;
	}

	public CombosForm getCombos() {
		return combos;
	}

	public void setCombos(CombosForm combos) {
		this.combos = combos;
	}

	public List<ReporteVentaProductoForm> getProductosVentas() {
		return productosVentas;
	}

	public void setProductosVentas(List<ReporteVentaProductoForm> productosVentas) {
		this.productosVentas = productosVentas;
	}
}

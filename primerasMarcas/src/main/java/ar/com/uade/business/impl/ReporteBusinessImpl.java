package ar.com.uade.business.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ar.com.uade.business.CambioBusiness;
import ar.com.uade.business.CombosBusiness;
import ar.com.uade.business.ReporteBusiness;
import ar.com.uade.business.VentaBusiness;
import ar.com.uade.dao.model.Cambio;
import ar.com.uade.dao.model.Venta;
import ar.com.uade.form.ColorForm;
import ar.com.uade.form.MarcaForm;
import ar.com.uade.form.ReporteForm;
import ar.com.uade.form.ReporteVentaProductoForm;
import ar.com.uade.form.TalleForm;
import ar.com.uade.form.TipoProductoForm;

public class ReporteBusinessImpl implements ReporteBusiness {
	private CombosBusiness comboBusiness;
	private VentaBusiness ventaBusiness;
	private CambioBusiness cambioBusiness;

	@Override
	public List<ReporteVentaProductoForm> reporteSemanal(ReporteForm form) {
		List<ReporteVentaProductoForm> listaForm = new ArrayList<ReporteVentaProductoForm>();
		List<Venta> ventas = ventaBusiness.reporteVentaSemanal(form);
		List<Cambio> cambios = cambioBusiness.reporteCambioSemanal(form);
		
		pruebaborrarcarga(listaForm);
		return listaForm;
	}

	private void pruebaborrarcarga(List<ReporteVentaProductoForm> listaForm) {
		for (int x = 0; x < 5; x++) {

			ReporteVentaProductoForm prueba = new ReporteVentaProductoForm();
			prueba.setCodigoBarras(3434L + x);
			prueba.setDescColor("blanco" + x);
			prueba.setDescMarca("puinguin" + x);
			prueba.setDescProducto("CAMPERA" + x);
			prueba.setDescTalle("L" + x);
			prueba.setFechaVentaCambio(new Date());
			prueba.setIdVentaCambio(100L + x);
			prueba.setPrecioVenta(new BigDecimal(x));
			prueba.setStock(5 + x);

			listaForm.add(prueba);

		}
	}

	@Override
	public List<ReporteVentaProductoForm> reporteMensual(ReporteForm form) {
		List<ReporteVentaProductoForm> listaForm = new ArrayList<ReporteVentaProductoForm>();
		List<Venta> ventas = ventaBusiness.reporteVentaMensual(form);
		List<Cambio> cambios = cambioBusiness.reporteCambioMensual(form);
		
		return listaForm;
	}

	@Override
	public List<ReporteVentaProductoForm> reporteAnual(ReporteForm form) {
		List<ReporteVentaProductoForm> listaForm = new ArrayList<ReporteVentaProductoForm>();
		List<Venta> ventas = ventaBusiness.reporteVentaAnual(form);
		List<Cambio> cambios = cambioBusiness.reporteCambioAnual(form);
		
		return listaForm;
	}

	@Override
	public List<ReporteVentaProductoForm> reporteEntreDosFechas(ReporteForm form) {
		List<ReporteVentaProductoForm> listaForm = new ArrayList<ReporteVentaProductoForm>();
		List<Venta> ventas = ventaBusiness.reporteVentaMensual(form);
		List<Cambio> cambios = cambioBusiness.reporteCambioMensual(form);
		
		return listaForm;
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

	public void setVentaBusiness(VentaBusiness ventaBusiness) {
		this.ventaBusiness = ventaBusiness;
	}

	public void setCambioBusiness(CambioBusiness cambioBusiness) {
		this.cambioBusiness = cambioBusiness;
	}

	public void setComboBusiness(CombosBusiness comboBusiness) {
		this.comboBusiness = comboBusiness;
	}
}

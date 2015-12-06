package ar.com.uade.business;

import java.util.List;

import ar.com.uade.form.ColorForm;
import ar.com.uade.form.MarcaForm;
import ar.com.uade.form.ReporteForm;
import ar.com.uade.form.ReporteVentaProductoForm;
import ar.com.uade.form.TalleForm;
import ar.com.uade.form.TipoProductoForm;

public interface ReporteBusiness {
	List<ReporteVentaProductoForm> reporteSemanal(ReporteForm form);

	List<ReporteVentaProductoForm> reporteMensual(ReporteForm form);

	List<ReporteVentaProductoForm> reporteAnual(ReporteForm form);

	List<ReporteVentaProductoForm> reporteEntreDosFechas(ReporteForm form);

	List<ColorForm> getColores();

	List<TipoProductoForm> getTiposProd();

	List<MarcaForm> getMarcas();

	List<TalleForm> getTalles();

}

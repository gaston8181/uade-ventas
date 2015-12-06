package ar.com.uade.business;

import java.util.List;

import ar.com.uade.dao.model.Venta;
import ar.com.uade.form.CierreListaForm;
import ar.com.uade.form.ReporteForm;

public interface VentaBusiness {

	List<Venta> reporteVentaSemanal(ReporteForm form);

	List<Venta> reporteVentaMensual(ReporteForm form);

	List<Venta> reporteVentaAnual(ReporteForm form);

	List<CierreListaForm> ventasDelDia();

	int totalEfectivo();

	int totalTarjeta();

}

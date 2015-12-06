package ar.com.uade.business;

import java.util.List;

import ar.com.uade.dao.model.Venta;
import ar.com.uade.form.ReporteForm;
import ar.com.uade.form.VentaForm;

public interface VentaBusiness {

	List<Venta> reporteVentaSemanal(ReporteForm form);

	List<Venta> reporteVentaMensual(ReporteForm form);

	List<Venta> reporteVentaAnual(ReporteForm form);

	List<VentaForm> ventasDelDia();

}

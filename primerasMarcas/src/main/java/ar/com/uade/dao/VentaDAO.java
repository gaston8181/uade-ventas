package ar.com.uade.dao;

import java.util.List;

import ar.com.uade.dao.model.Venta;
import ar.com.uade.form.ReporteForm;

public interface VentaDAO {

	List<Venta> reporteVentaSemanal(ReporteForm form);

	List<Venta> reporteVentaMensual(ReporteForm form);

	List<Venta> reporteVentaAnual(ReporteForm form);


}

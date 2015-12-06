package ar.com.uade.dao;

import java.util.List;

import ar.com.uade.dao.model.Cambio;
import ar.com.uade.form.CambioForm;
import ar.com.uade.form.ReporteForm;

public interface CambioDAO {

	List<Cambio> reporteCambioSemanal(ReporteForm form);

	List<Cambio> reporteCambioMensual(ReporteForm form);

	List<Cambio> reporteCambioAnual(ReporteForm form);

	List<CambioForm> cambiosDelDia();

}

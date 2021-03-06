package ar.com.uade.business;

import java.util.List;

import ar.com.uade.dao.model.Cambio;
import ar.com.uade.form.CierreListaForm;
import ar.com.uade.form.ReporteForm;

public interface CambioBusiness {

	List<Cambio> reporteCambioSemanal(ReporteForm form);

	List<Cambio> reporteCambioMensual(ReporteForm form);

	List<Cambio> reporteCambioAnual(ReporteForm form);

	List<CierreListaForm> cambiosDelDia();

	int totalEfectivo();

	int totalTarjeta();

}

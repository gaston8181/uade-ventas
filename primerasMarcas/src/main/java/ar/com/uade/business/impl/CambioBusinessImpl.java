package ar.com.uade.business.impl;

import java.util.ArrayList;
import java.util.List;

import ar.com.uade.business.CambioBusiness;
import ar.com.uade.dao.CambioDAO;
import ar.com.uade.dao.model.Cambio;
import ar.com.uade.form.CierreListaForm;
import ar.com.uade.form.ReporteForm;

public class CambioBusinessImpl implements CambioBusiness {
	private CambioDAO cambioDAO;

	@Override
	public List<Cambio> reporteCambioSemanal(ReporteForm form) {
		return cambioDAO.reporteCambioSemanal(form);
	}

	@Override
	public List<Cambio> reporteCambioMensual(ReporteForm form) {
		return cambioDAO.reporteCambioMensual(form);
	}

	@Override
	public List<Cambio> reporteCambioAnual(ReporteForm form) {
		return cambioDAO.reporteCambioAnual(form);
	}

	@Override
	public List<CierreListaForm> cambiosDelDia() {
		cambioDAO.cambiosDelDia();
		return new ArrayList<CierreListaForm>();
	}

	@Override
	public int totalEfectivo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int totalTarjeta() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setCambioDAO(CambioDAO cambioDAO) {
		this.cambioDAO = cambioDAO;
	}

}

package ar.com.uade.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import ar.com.uade.dao.CambioDAO;
import ar.com.uade.dao.model.Cambio;
import ar.com.uade.form.ReporteForm;

public class CambioDAOImpl extends HibernateDaoSupport implements CambioDAO{

	@Override
	public List<Cambio> reporteCambioSemanal(ReporteForm form) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cambio> reporteCambioMensual(ReporteForm form) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cambio> reporteCambioAnual(ReporteForm form) {
		// TODO Auto-generated method stub
		return null;
	}

}

package ar.com.uade.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import ar.com.uade.dao.VentaDAO;
import ar.com.uade.dao.model.Venta;
import ar.com.uade.form.ReporteForm;
import ar.com.uade.form.VentaForm;

public class VentaDAOImpl extends HibernateDaoSupport implements VentaDAO {

	@Override
	public List<Venta> reporteVentaSemanal(ReporteForm form) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Venta> reporteVentaMensual(ReporteForm form) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Venta> reporteVentaAnual(ReporteForm form) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<VentaForm> ventasDelDia() {
		// TODO Auto-generated method stub
		return null;
	}

}

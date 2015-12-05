package ar.com.uade.business.impl;

import java.util.ArrayList;
import java.util.List;

import ar.com.uade.business.TalleBusiness;
import ar.com.uade.dao.TalleDAO;
import ar.com.uade.dao.model.Talle;
import ar.com.uade.form.TalleForm;

public class TalleBusinessImpl implements TalleBusiness {

	private TalleDAO talleDAO;

	@Override
	public List<TalleForm> listarTalles() {
		List<Talle> talles = talleDAO.listarTalles();
		List<TalleForm> lista = new ArrayList<TalleForm>();
		for (Talle talle : talles) {
			lista.add(crearView(talle));
		}
		return lista;
	}

	private TalleForm crearView(Talle talle) {
		TalleForm cf = new TalleForm();
		cf.setId(talle.getId());
		cf.setDescripcion(talle.getDescripcion());
		return cf;
	}

	public void setTalleDAO(TalleDAO talleDAO) {
		this.talleDAO = talleDAO;
	}

}

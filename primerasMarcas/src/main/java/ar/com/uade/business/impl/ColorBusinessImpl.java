package ar.com.uade.business.impl;

import java.util.ArrayList;
import java.util.List;

import ar.com.uade.business.ColorBusiness;
import ar.com.uade.dao.ColorDAO;
import ar.com.uade.dao.model.Color;
import ar.com.uade.form.ColorForm;

public class ColorBusinessImpl implements ColorBusiness {

	private ColorDAO colorDAO;

	@Override
	public List<ColorForm> listarColores() {
		List<Color> colores = colorDAO.listarColores();
		List<ColorForm> lista = new ArrayList<ColorForm>();
		for (Color color : colores) {
			lista.add(crearView(color));
		}
		return lista;
	}

	private ColorForm crearView(Color color) {
		ColorForm cf = new ColorForm();
		cf.setId(color.getId());
		cf.setDescripcion(color.getDescripcion());
		return cf;
	}

	public void setColorDAO(ColorDAO colorDAO) {
		this.colorDAO = colorDAO;
	}

}

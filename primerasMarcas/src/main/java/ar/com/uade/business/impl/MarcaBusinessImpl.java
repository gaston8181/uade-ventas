package ar.com.uade.business.impl;

import java.util.ArrayList;
import java.util.List;

import ar.com.uade.business.MarcaBusiness;
import ar.com.uade.dao.MarcaDAO;
import ar.com.uade.dao.model.Marca;
import ar.com.uade.form.MarcaForm;

public class MarcaBusinessImpl implements MarcaBusiness {

	private MarcaDAO marcaDAO;

	@Override
	public List<MarcaForm> listarMarcas() {
		List<Marca> marcas = marcaDAO.listarMarcas();
		List<MarcaForm> lista = new ArrayList<MarcaForm>();
		for (Marca marca : marcas) {
			lista.add(crearView(marca));
		}
		return lista;
	}
	
	private MarcaForm crearView(Marca marca) {
		MarcaForm mf = new MarcaForm();
		mf.setId(marca.getId());
		mf.setDescripcion(marca.getDescripcion());
		return mf;
	}


	public void setMarcaDAO(MarcaDAO marcaDAO) {
		this.marcaDAO = marcaDAO;
	}

}

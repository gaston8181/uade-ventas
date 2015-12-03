package ar.com.uade.business.impl;

import java.util.ArrayList;
import java.util.List;

import ar.com.uade.business.TipoProductoBusiness;
import ar.com.uade.dao.TipoProductoDAO;
import ar.com.uade.dao.model.TipoProducto;
import ar.com.uade.form.TipoProductoForm;

public class TipoProductoBusinessImpl implements TipoProductoBusiness {

	private TipoProductoDAO tipoProductoDAO;

	@Override
	public List<TipoProductoForm> listarTipoProductos() {
		List<TipoProducto> tiposProductos = tipoProductoDAO.listarTipoProductos();
		List<TipoProductoForm> lista = new ArrayList<TipoProductoForm>();
		for (TipoProducto tipoProducto : tiposProductos) {
			lista.add(crearView(tipoProducto));
		}
		return lista;
	}

	private TipoProductoForm crearView(TipoProducto tipoProducto) {
		TipoProductoForm view = new TipoProductoForm();
		view.setId(tipoProducto.getId());
		view.setDescripcion(tipoProducto.getDescripcion() + " - " + tipoProducto.getTalle());
		return view;
	}

	public void setTipoProductoDAO(TipoProductoDAO tipoProductoDAO) {
		this.tipoProductoDAO = tipoProductoDAO;
	}

}

package ar.com.uade.business.impl;

import ar.com.uade.business.ProveedorBusiness;
import ar.com.uade.dao.ProveedorDAO;

public class ProveedorBusinessImpl implements ProveedorBusiness {
	private ProveedorDAO proveedorDAO;

	public ProveedorDAO getProveedorDAO() {
		return proveedorDAO;
	}

	public void setProveedorDAO(ProveedorDAO proveedorDAO) {
		this.proveedorDAO = proveedorDAO;
	}

}

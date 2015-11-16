package ar.com.uade.business.impl;

import ar.com.uade.business.ProveedorBusiness;
import ar.com.uade.dao.ProveedorDAO;
import ar.com.uade.dao.model.Proveedor;

public class ProveedorBusinessImpl implements ProveedorBusiness {
	private ProveedorDAO proveedorDAO;

	@Override
	public void altaProveedor() {
		Proveedor proveedor = new Proveedor();
		proveedorDAO.altaProveedor(proveedor);
	}

	@Override
	public void modificarProveedor() {
		Proveedor proveedor = new Proveedor();
		proveedorDAO.modificarProveedor(proveedor);
	}

	@Override
	public void bajaProveedor() {
		Proveedor proveedor = new Proveedor();
		proveedorDAO.bajaProveedor(proveedor);
	}

	public ProveedorDAO getProveedorDAO() {
		return proveedorDAO;
	}

	public void setProveedorDAO(ProveedorDAO proveedorDAO) {
		this.proveedorDAO = proveedorDAO;
	}
}

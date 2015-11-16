package ar.com.uade.business.impl;

import ar.com.uade.business.VendedorBusiness;
import ar.com.uade.dao.VendedorDAO;
import ar.com.uade.dao.model.Vendedor;

public class VendedorBusinessImpl implements VendedorBusiness {
	private VendedorDAO vendedorDAO;

	@Override
	public void altaVendedor() {
		Vendedor vendedor = new Vendedor();
		vendedorDAO.altaVendedor(vendedor);
	}

	@Override
	public void bajaVendedor() {
		Vendedor vendedor = new Vendedor();
		vendedorDAO.bajaVendedor(vendedor);
	}

	@Override
	public void modificarVendedor() {
		Vendedor vendedor = new Vendedor();
		vendedorDAO.modificarVendedor(vendedor);
	}

	public VendedorDAO getVendedorDAO() {
		return vendedorDAO;
	}

	public void setVendedorDAO(VendedorDAO vendedorDAO) {
		this.vendedorDAO = vendedorDAO;
	}

}

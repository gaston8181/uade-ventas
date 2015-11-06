package ar.com.uade.business.impl;

import ar.com.uade.business.VendedorBusiness;
import ar.com.uade.dao.VendedorDAO;

public class VendedorBusinessImpl implements VendedorBusiness {
	private VendedorDAO vendedorDAO;

	public VendedorDAO getVendedorDAO() {
		return vendedorDAO;
	}

	public void setVendedorDAO(VendedorDAO vendedorDAO) {
		this.vendedorDAO = vendedorDAO;
	}

}

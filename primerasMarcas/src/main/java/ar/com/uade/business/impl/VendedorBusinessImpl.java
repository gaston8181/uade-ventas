package ar.com.uade.business.impl;

import org.springframework.transaction.annotation.Transactional;

import ar.com.uade.business.VendedorBusiness;
import ar.com.uade.dao.VendedorDAO;
import ar.com.uade.dao.model.Vendedor;
import ar.com.uade.form.VendedorForm;

public class VendedorBusinessImpl implements VendedorBusiness {
	private VendedorDAO vendedorDAO;

	@Override
	@Transactional
	public void altaVendedor(VendedorForm form) {
		Vendedor vendedor = new Vendedor(form);
		vendedorDAO.altaVendedor(vendedor);
	}

	@Override
	public void bajaVendedor(VendedorForm form) {
		Vendedor vendedor = new Vendedor(form);
		vendedorDAO.bajaVendedor(vendedor);
	}

	@Override
	public void modificarVendedor(VendedorForm form) {
		Vendedor vendedor = new Vendedor(form);
		vendedorDAO.modificarVendedor(vendedor);
	}

	public VendedorDAO getVendedorDAO() {
		return vendedorDAO;
	}

	public void setVendedorDAO(VendedorDAO vendedorDAO) {
		this.vendedorDAO = vendedorDAO;
	}

}

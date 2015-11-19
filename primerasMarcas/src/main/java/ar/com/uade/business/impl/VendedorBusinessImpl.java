package ar.com.uade.business.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
	@Transactional
	public void bajaVendedor(VendedorForm form) {
		Vendedor vendedor = vendedorDAO.loadVendedor(form.getLegajo());
		vendedor.setFechaBaja(new Date());
		vendedorDAO.bajaVendedor(vendedor);
	}

	@Override
	public void modificarVendedor(VendedorForm form) {
		Vendedor vendedor = new Vendedor(form);
		vendedorDAO.modificarVendedor(vendedor);
	}

	@Override
	public List<VendedorForm> listarVendedores() {
		List<Vendedor> vendedores = vendedorDAO.listarVendedores();
		List<VendedorForm> vendedoresForm = new ArrayList<VendedorForm>();
		for(Vendedor vendedor:vendedores) {
			VendedorForm vf = new VendedorForm();
			vf.setLegajo(vendedor.getLegajo());
			vf.setApellido(vendedor.getApellido());
			vf.setDni(vendedor.getDni());
			vf.setDomicilio(vendedor.getDomicilio());
			vf.setFechaIngreso(vendedor.getFechaIngreso());
			vf.setFechaNac(vendedor.getFechaNac());
			vf.setNombre(vendedor.getNombre());
			vf.setTelefono(vendedor.getTelefono());
			vf.setFechaBaja(vendedor.getFechaBaja());
			
			vendedoresForm.add(vf);
		}
		return vendedoresForm;
	}

	public VendedorDAO getVendedorDAO() {
		return vendedorDAO;
	}

	public void setVendedorDAO(VendedorDAO vendedorDAO) {
		this.vendedorDAO = vendedorDAO;
	}

}

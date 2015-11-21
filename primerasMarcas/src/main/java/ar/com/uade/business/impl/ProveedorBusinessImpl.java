package ar.com.uade.business.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import ar.com.uade.business.ProveedorBusiness;
import ar.com.uade.dao.ProveedorDAO;
import ar.com.uade.dao.model.Proveedor;
import ar.com.uade.form.ProveedorForm;

public class ProveedorBusinessImpl implements ProveedorBusiness {
	private ProveedorDAO proveedorDAO;

	@Override
	public List<ProveedorForm> listarProveedores() {
		List<Proveedor> proveedores = proveedorDAO.listarProveedores();
		List<ProveedorForm> proveedorForm = new ArrayList<ProveedorForm>();
		for (Proveedor proveedor : proveedores) {
			proveedorForm.add(crearView(proveedor));
		}
		return proveedorForm;
	}

	private ProveedorForm crearView(Proveedor proveedor) {
		ProveedorForm pf = new ProveedorForm();
		pf.setDireccion(proveedor.getDireccion());
		pf.setEstado(proveedor.getEstado());
		pf.setId(proveedor.getId());
		pf.setNombre(proveedor.getNombre());
		pf.setTelefono(proveedor.getTelefono());
		pf.setActivo(!proveedor.eliminado());
		return pf;
	}

	@Override
	@Transactional
	public void altaProveedor(ProveedorForm form) {
		Proveedor proveedor = new Proveedor(form);
		proveedorDAO.altaProveedor(proveedor);
	}

	@Override
	@Transactional
	public void modificarProveedor(ProveedorForm form) {
		Proveedor proveedor = new Proveedor(form);
		proveedorDAO.modificarProveedor(proveedor);
	}

	@Override
	@Transactional
	public void bajaProveedor(ProveedorForm form) {
		Proveedor proveedor = proveedorDAO.loadProveedor(form.getId());
		proveedor.inactivar();
		proveedorDAO.bajaProveedor(proveedor);
	}

	@Override
	@Transactional
	public ProveedorForm obtenerProveedor(Long id) {
		Proveedor proveedor = proveedorDAO.loadProveedor(id);
		return crearView(proveedor);
		
	}

	public ProveedorDAO getProveedorDAO() {
		return proveedorDAO;
	}

	public void setProveedorDAO(ProveedorDAO proveedorDAO) {
		this.proveedorDAO = proveedorDAO;
	}

}

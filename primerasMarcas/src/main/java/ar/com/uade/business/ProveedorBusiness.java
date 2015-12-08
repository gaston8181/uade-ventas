package ar.com.uade.business;

import java.util.List;

import ar.com.uade.form.ProveedorForm;

public interface ProveedorBusiness {
	void altaProveedor(ProveedorForm form);

	void modificarProveedor(ProveedorForm form);

	void bajaProveedor(ProveedorForm form);

	ProveedorForm obtenerProveedor(Long id);

	List<ProveedorForm> listarProveedores();

	List<ProveedorForm> listarProveedoresActivos();

	boolean proveedorExiste(ProveedorForm form);

}

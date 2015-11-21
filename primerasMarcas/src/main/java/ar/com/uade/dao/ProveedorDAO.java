package ar.com.uade.dao;

import java.util.List;

import ar.com.uade.dao.model.Proveedor;

public interface ProveedorDAO {

	void altaProveedor(Proveedor proveedor);

	void modificarProveedor(Proveedor proveedor);

	void bajaProveedor(Proveedor proveedor);

	List<Proveedor> listarProveedores();

	Proveedor loadProveedor(Long id);

}

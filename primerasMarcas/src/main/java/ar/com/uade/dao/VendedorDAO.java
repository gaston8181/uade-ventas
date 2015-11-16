package ar.com.uade.dao;

import ar.com.uade.dao.model.Vendedor;

public interface VendedorDAO {

	void altaVendedor(Vendedor vendedor);

	void bajaVendedor(Vendedor vendedor);

	void modificarVendedor(Vendedor vendedor);

}

package ar.com.uade.dao;

import java.util.List;

import ar.com.uade.dao.model.Vendedor;

public interface VendedorDAO {

	void altaVendedor(Vendedor vendedor);

	void bajaVendedor(Vendedor vendedor);

	void modificarVendedor(Vendedor vendedor);

	List<Vendedor> listarVendedores();

	Vendedor loadVendedor(Long legajo);

}

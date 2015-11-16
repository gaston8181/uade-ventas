package ar.com.uade.dao;

import ar.com.uade.dao.model.Producto;

public interface ProductoDAO {

	void altaProducto(Producto producto);

	void bajaProducto(Producto producto);

	void modificarProducto(Producto producto);

	void modificarStock();

	void consultarProducto();

}

package ar.com.uade.dao;

import java.util.List;

import ar.com.uade.dao.model.Producto;
import ar.com.uade.form.ProductoForm;

public interface ProductoDAO {

	void altaProducto(Producto producto);

	void bajaProducto(Producto producto);

	void modificarProducto(Producto producto);

	Producto loadProducto(Long id);

	List<Producto> listarProductos();

	List<Producto> listarProductos(ProductoForm form);

	boolean codigoBarrasExiste(Long id);

}
